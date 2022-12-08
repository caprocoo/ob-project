package com.caprocoo.ob.repository;

import com.caprocoo.ob.domain.Member;

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
public interface MemberRepository  {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
