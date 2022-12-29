package com.caprocoo.ob.repository.rdb.account;


import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : com.caprocoo.ob.repository
 * fileName       : MemberRepository
 * author         : caprocoo
 * date           : 2022-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-08        caprocoo       최초 생성
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Account save(Account account);
    Optional<Account> findByMemberId(String id);
    Account findByMemberEmail(String email);
    List<Account> findAll();

}
