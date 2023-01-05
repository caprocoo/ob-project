package com.caprocoo.ob.dto.album;

import com.caprocoo.ob.entity.album.Album;
import lombok.*;

import javax.persistence.Column;

/**
 * packageName    : com.caprocoo.ob.dto.album
 * fileName       : AlbumDto
 * author         : caprocoo
 * date           : 2023-01-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-05        caprocoo       최초 생성
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlbumDto {

    private Long albumSeq;

    private String albumTitle;

    private String albumContent;

    private String accountId;

    private int albumViewCnt;

    public AlbumDto(Album entity) {
        this.albumSeq = entity.getAlbumSeq();
        this.albumTitle = entity.getAlbumTitle();
        this.albumContent = entity.getAlbumContent();
        this.accountId = entity.getAccountId();
        this.albumViewCnt = entity.getAlbumViewCnt();
    }



    public Album toEntity(){
        Album album = Album.builder()
                .albumSeq(albumSeq)
                .albumTitle(albumTitle)
                .albumContent(albumContent)
                .accountId(accountId)
                .albumViewCnt(albumViewCnt)
                .build();
        return album;
    }
}
