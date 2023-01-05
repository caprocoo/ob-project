package com.caprocoo.ob.service.album;

import com.caprocoo.ob.dto.album.AlbumDto;
import com.caprocoo.ob.entity.album.Album;
import com.caprocoo.ob.repository.rdb.album.AlbumRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.caprocoo.ob.service.album
 * fileName       : AlbumService
 * author         : caprocoo
 * date           : 2023-01-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-05        caprocoo       최초 생성
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumDto findByAlbumSeq(long seq) {

        Album album = albumRepository.findByAlbumSeq(seq);
        AlbumDto albumDto = new AlbumDto(album);


        return albumDto;
    }


    public AlbumDto saveAlbum(AlbumDto albumDto) {

        albumDto.setAlbumViewCnt(0);

        Album entity = albumDto.toEntity();
        albumRepository.save(entity);


        return albumDto;
    }

}
