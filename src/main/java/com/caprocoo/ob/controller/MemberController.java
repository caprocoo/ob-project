package com.caprocoo.ob.controller;

import com.caprocoo.ob.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/api/member")
public class MemberController {
    private final MemberService memberService;

    // 아래의 Autowired는 생성자 주입이라고 한다.
    // 생성자 주입이란 생성자를 통해 MemberService가 MemberController에 주입이 되는 것을 말한다.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * methodName : memberJoin
     * author : Hyeonseong Oh
     * description : 회원가입 POST
     *
     * @return string
     */
    @RequestMapping(value = "join", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memberJoin(){
        return "";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memberLogin(){
        return "";
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memberUpdate(){
        return "";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memberDelete(){
        return "";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memberFindOne(){
        return "";
    }

}
