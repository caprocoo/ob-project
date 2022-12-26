package com.caprocoo.ob.repository;

import com.caprocoo.ob.repository.rdb.CrudRepository;
import com.caprocoo.ob.repository.rdb.member.Member;

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
public interface MemberRepository extends CrudRepository<Member, String> {
    Member save(Member member);
    Optional<Member> findByMemberId(String id);
    Member findByMemberEmail(String email);
    List<Member> findAll();
}
