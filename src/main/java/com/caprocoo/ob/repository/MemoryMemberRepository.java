package com.caprocoo.ob.repository;

import com.caprocoo.ob.repository.rdb.member.Member;

import java.util.*;

/**
 * packageName    : com.caprocoo.ob.repository
 * fileName       : MemoryMemberRepository
 * author         : caprocoo
 * date           : 2022-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-08        caprocoo       최초 생성
 */
public class MemoryMemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;


//    @Override
//    public Member save(Member member) {
//        member.setId(++sequence);
//        store.put(member.getId(), member);
//        return member;
//    }
//
//    @Override
//    public Optional<Member> findById(Long id) {
//        return Optional.ofNullable(store.get(id));
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
//
//        return store.values().stream().filter(member-> member.getName().equals(name)).findAny();
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return new ArrayList<>(store.values());
//    }
//
//    public void clearStore(){
//        store.clear();
//    }
}
