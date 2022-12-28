package com.caprocoo.ob.api.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * packageName    : com.caprocoo.ob.controller
 * fileName       : HomeController
 * author         : caprocoo
 * date           : 2022-12-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-09        caprocoo       최초 생성
 */

//@RestController
@Controller
@RequestMapping("/main")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String home(Model model){
        HashMap<String, String> hello = new HashMap<>();
        hello.put("title", "OBONG");
        model.addAttribute("hello", hello);
        return "index";
    }


}
