package com.caprocoo.ob.controller;

import com.caprocoo.ob.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.caprocoo.ob.controller
 * fileName       : MemberController
 * author         : caprocoo
 * date           : 2022-12-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-09        caprocoo       최초 생성
 */
@RestController
public class MemberController {
    private final MemberService memberService;

    // 아래의 Autowired는 생성자 주입이라고 한다.
    // 생성자 주입이란 생성자를 통해 MemberService가 MemberController에 주입이 되는 것을 말한다.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }



}
