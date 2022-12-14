package com.caprocoo.ob.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

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

@RestController
@RequestMapping("/api/test")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> home(){
        HashMap<String, String> hello = new HashMap<>();
        hello.put("title", "OBONG");
        return hello;
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> news(){
        HashMap<String, String> news = new HashMap<>();
        news.put("title", "news");
        return news;
    }

    @RequestMapping(value = "/ask", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> ask(){
        HashMap<String, String> ask = new HashMap<>();
        ask.put("title", "ask");
        return ask;
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> jobs(){
        HashMap<String, String> jobs = new HashMap<>();
        jobs.put("title", "jobs");
        return jobs;
    }

}
