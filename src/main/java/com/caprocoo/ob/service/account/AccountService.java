package com.caprocoo.ob.service.account;

import com.caprocoo.ob.entity.account.Authority;
import com.caprocoo.ob.exception.DuplicateMemberException;
import com.caprocoo.ob.exception.NotFoundMemberException;
import com.caprocoo.ob.repository.rdb.account.AccountRepository;
import com.caprocoo.ob.entity.account.Account;
import java.util.Collections;
import java.util.Optional;

import com.caprocoo.ob.service.jwt.AccountDto;
import com.caprocoo.ob.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName    : com.caprocoo.ob.service
 * fileName       : MemberService
 * author         : caprocoo
 * date           : 2022-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-08        caprocoo       최초 생성
 */
@Transactional
@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;

    private final PasswordEncoder passwordEncoder;

    @Transactional
    public AccountDto signup(AccountDto accountDto) {
        if (accountRepository.findByMemberId(accountDto.getMemberId()).orElse(null) != null) {
            throw new DuplicateMemberException("이미 가입되어 있는 유저입니다.");
        }

        Authority authority = Authority.builder()
                .authorityName("ROLE_USER")
                .build();

        Account account = Account.builder()
                .memberId(accountDto.getMemberId())
                .memberPwd(passwordEncoder.encode(accountDto.getMemberPwd()))
                .telNoFirst(accountDto.getTelNoFirst())
                .telNoSecond(accountDto.getTelNoSecond())
                .telNoThird(accountDto.getTelNoThird())
                .memberEmail(accountDto.getMemberEmail())
                .authorities(Collections.singleton(authority))
                .activated('1')
                .build();

        return AccountDto.from(accountRepository.save(account));
    }

    @Transactional(readOnly = true)
    public AccountDto getUserWithAuthorities(String memberId) {
        return AccountDto.from(accountRepository.findByMemberId(memberId).orElse(null));
    }

    @Transactional(readOnly = true)
    public AccountDto getMyUserWithAuthorities() {
        return AccountDto.from(
                SecurityUtil.getCurrentUsername()
                        .flatMap(accountRepository::findByMemberId)
                        .orElseThrow(() -> new NotFoundMemberException("Member not found"))
        );
    }





}
