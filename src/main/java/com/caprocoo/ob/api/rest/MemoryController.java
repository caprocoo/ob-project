package com.caprocoo.ob.api.rest;

import com.caprocoo.ob.dto.album.AlbumDto;
import com.caprocoo.ob.dto.memory.MemoryDto;
import com.caprocoo.ob.service.memory.MemoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequiredArgsConstructor
public class MemoryController {

    private final MemoryService memoryService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String memoryHome(Model model){

        return "memory/main";
    }

//    getMemorySeq

    @RequestMapping(value = "{seq}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAlbumSeq(@PathVariable(value = "seq") long seq, Model model){

        MemoryDto memoryDetail = memoryService.getMemorySeq(seq);

        model.addAttribute("seq", memoryDetail.getMemorySeq());
        model.addAttribute("type", memoryDetail.getMemoryType());
        model.addAttribute("title", memoryDetail.getMemoryTitle());
        model.addAttribute("content", memoryDetail.getMemoryContent());
        model.addAttribute("accountId", memoryDetail.getAccountId());
        model.addAttribute("viewCnt", memoryDetail.getMemoryViewCnt());

        return "memory/detail";

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MemoryDto insertMemory(@RequestBody MemoryDto memoryDto) {

        memoryService.saveMemory(memoryDto);

        return memoryDto;

    }


}
