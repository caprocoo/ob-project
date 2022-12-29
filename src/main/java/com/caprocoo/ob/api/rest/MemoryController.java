package com.caprocoo.ob.api.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * packageName    : com.caprocoo.ob.api.rest
 * fileName       : AlbumController
 * author         : caprocoo
 * date           : 2022-12-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-28        caprocoo       최초 생성
 */
@Controller
@RequestMapping("/memory")
public class MemoryController {

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memoryHome(Model model){

        return "memory/main";
    }

}
