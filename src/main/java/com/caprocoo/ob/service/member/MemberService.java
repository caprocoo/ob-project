package com.caprocoo.ob.service.member;

import com.caprocoo.ob.repository.MemberRepository;
import com.caprocoo.ob.repository.rdb.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member findByMemberId(String id){
        Member member = memberRepository.findByMemberId(id);
        return member;
    }




//    /**
//     * methodName : join
//     * author : Hyeonseong Oh
//     * description : 회원가입
//     *
//     * @param member
//     * @return long
//     */
//    public Long join(Member member) {
//        validateDuplicateMember(member);
//        memberRepository.save(member);
//        return member.getId();
//    }
//
//    private void validateDuplicateMember(Member member) {
//        memberRepository.findByName(member.getName())
//                .ifPresent(m -> {
//                    throw new IllegalStateException("이미 존재하는 회원입니다.");
//                });
//    }
//
//    public List<Member> findMembers(){
//        return memberRepository.findAll();
//    }
//    public Optional<Member> findOne(Long memberId){
//        return memberRepository.findById(memberId);
//    }
}
