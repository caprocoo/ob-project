package com.caprocoo.ob.service.memory;

import com.caprocoo.ob.dto.album.AlbumDto;
import com.caprocoo.ob.dto.memory.MemoryDto;
import com.caprocoo.ob.entity.album.Album;
import com.caprocoo.ob.entity.memory.Memory;
import com.caprocoo.ob.repository.rdb.memory.MemoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.caprocoo.ob.service.memory
 * fileName       : MemoryService
 * author         : caprocoo
 * date           : 2023-01-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        caprocoo       최초 생성
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class MemoryService {

    private final MemoryRepository memoryRepository;

    public MemoryDto getMemorySeq(long seq){
        Memory memory = memoryRepository.findByMemorySeq(seq);
        MemoryDto memoryDto = new MemoryDto(memory);
        return memoryDto;
    }


    public MemoryDto saveMemory(MemoryDto memoryDto) {

        memoryDto.setMemoryViewCnt(0);

        Memory entity = memoryDto.toEntity();
        memoryRepository.save(entity);


        return memoryDto;
    }

}
