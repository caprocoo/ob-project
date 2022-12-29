package com.caprocoo.ob.service.account;

import com.caprocoo.ob.repository.rdb.account.AccountRepository;
import com.caprocoo.ob.repository.rdb.account.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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



    public Optional<Account> findByAccountId(String id){
        Optional<Account> member = accountRepository.findByMemberId(id);
        return member;
    }


    public String join(AccountDto accountDto){
        accountDto.setMemberPwd(passwordEncoder.encode(accountDto.getMemberPwd()));
        Account account = accountDto.toEntity();
        accountRepository.save(account);
        log.info("회원가입 성공");
        return account.getMemberId();
    }




}
