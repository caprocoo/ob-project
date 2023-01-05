package com.caprocoo.ob.repository.rdb.album;

import com.caprocoo.ob.entity.album.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.caprocoo.ob.repository.rdb.album
 * fileName       : AlbumRepository
 * author         : caprocoo
 * date           : 2023-01-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-05        caprocoo       최초 생성
 */
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {


    Album findByAlbumSeq(long seq);

}
