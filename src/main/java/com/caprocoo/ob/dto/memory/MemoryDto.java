package com.caprocoo.ob.dto.memory;

import com.caprocoo.ob.entity.memory.Memory;
import lombok.*;

/**
 * packageName    : com.caprocoo.ob.dto.memory
 * fileName       : MemoryDto
 * author         : caprocoo
 * date           : 2023-01-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        caprocoo       최초 생성
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemoryDto {

    private Long memorySeq;

    private String memoryType;

    private String memoryTitle;

    private String memoryContent;

    private String accountId;

    private int memoryViewCnt;

    public MemoryDto(Memory entity) {
        this.memorySeq = entity.getMemorySeq();
        this.memoryType = entity.getMemoryType();
        this.memoryTitle = entity.getMemoryTitle();
        this.memoryContent = entity.getMemoryContent();
        this.accountId = entity.getAccountId();
        this.memoryViewCnt = entity.getMemoryViewCnt();
    }



    public Memory toEntity(){
        Memory memory = Memory.builder()
                .memorySeq(memorySeq)
                .memoryType(memoryType)
                .memoryTitle(memoryTitle)
                .memoryContent(memoryContent)
                .accountId(accountId)
                .memoryViewCnt(memoryViewCnt)
                .build();
        return memory;
    }
}


