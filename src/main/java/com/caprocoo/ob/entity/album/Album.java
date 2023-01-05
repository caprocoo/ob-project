package com.caprocoo.ob.entity.album;

import com.caprocoo.ob.entity.account.Authority;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * packageName    : com.caprocoo.ob.repository.rdb.album
 * fileName       : Album
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
@Entity
@Table(name = "OB_ALBUM")
@SequenceGenerator(
        name = "OB_ALBUM_SEQ_GEN",
        sequenceName = "ALBUM_SEQ", allocationSize = 1
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OB_ALBUM_SEQ_GEN"
    )
    @Column(name = "SEQ", unique = true, nullable = false)
    private Long albumSeq;

    @Column(name = "TITLE")
    private String albumTitle;

    @Column(name = "CONTENT")
    private String albumContent;

    @Column(name = "ACCOUNT_ID")
    private String accountId;

    @Column(name = "VIEW_CNT")
    private int albumViewCnt;


}
