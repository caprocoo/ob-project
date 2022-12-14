package com.caprocoo.ob.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName    : com.caprocoo.ob.service
 * fileName       : MemberServiceTest
 * author         : caprocoo
 * date           : 2022-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-08        caprocoo       최초 생성
 */
@SpringBootTest
@Transactional
class MemberServiceTest {
//
//    @Autowired
//    MemberService memberService;
//    @Autowired
//    MemberRepository memberRepository;
//
//
//
//    @Test
//    void 회원가입() {
//        //given
//        Member member = new Member();
//        member.setName("spring");
//        //when
//        Long saveId = memberService.join(member);
//
//        //then
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//
//
//    }
//
//    @Test
//    public void 중복_회원_예외(){
//        //given
//        Member member = new Member();
//        member.setName("spring");
//
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        //when
//        memberService.join(member);
//
//        //then
//        IllegalStateException e = assertThrows(IllegalStateException.class, ()->memberService.join(member2));
//        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//
//    }
//
//    @Test
//    void findMembers() {
//    }
//
//    @Test
//    void findOne() {
//    }
}