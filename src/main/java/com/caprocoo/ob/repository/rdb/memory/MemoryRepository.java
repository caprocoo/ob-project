package com.caprocoo.ob.repository.rdb.memory;

import com.caprocoo.ob.entity.memory.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.caprocoo.ob.repository.rdb.memory
 * fileName       : MemoryRepository
 * author         : caprocoo
 * date           : 2023-01-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        caprocoo       최초 생성
 */
@Repository
public interface MemoryRepository extends JpaRepository<Memory, Long> {

    Memory findByMemorySeq(long seq);
}
