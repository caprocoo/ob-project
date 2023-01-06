package com.caprocoo.ob.api.rest;

import com.caprocoo.ob.dto.album.AlbumDto;
import com.caprocoo.ob.service.album.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
@RequestMapping("/album")
@RequiredArgsConstructor
@Slf4j
public class AlbumController {
    private final AlbumService albumService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String albumHome(Model model){

        return "album/main";
    }


    @RequestMapping(value = "{seq}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAlbumSeq(@PathVariable(value = "seq") long seq, Model model){

        AlbumDto albumDetail = albumService.findByAlbumSeq(seq);

        model.addAttribute("seq", albumDetail.getAlbumSeq());
        model.addAttribute("title", albumDetail.getAlbumTitle());
        model.addAttribute("content", albumDetail.getAlbumContent());
        model.addAttribute("accountId", albumDetail.getAccountId());
        model.addAttribute("viewCnt", albumDetail.getAlbumViewCnt());

        return "album/detail";

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String insertAlbum(@RequestBody AlbumDto albumDto) {

        albumService.saveAlbum(albumDto);

        return "album/insert";

    }


}
