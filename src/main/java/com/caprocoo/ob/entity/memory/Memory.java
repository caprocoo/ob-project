package com.caprocoo.ob.entity.memory;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName    : com.caprocoo.ob.entity.memory
 * fileName       : Memory
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
@Entity
@Table(name = "OB_MEMORY")
@SequenceGenerator(
        name = "OB_MEMORY_SEQ_GEN",
        sequenceName = "MEMORY_SEQ", allocationSize = 1
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Memory {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "OB_MEMORY_SEQ_GEN"
    )
    @Column(name = "MEMORY_SEQ", unique = true, nullable = false)
    private Long memorySeq;

    @NotNull
    @Column(name = "MEMORY_TYPE")
    private String memoryType;

    @NotNull
    @Column(name = "MEMORY_TITLE")
    private String memoryTitle;

    @NotNull
    @Column(name = "MEMORY_CONTENT")
    private String memoryContent;

    @NotNull
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    @Column(name = "VIEW_CNT")
    private int memoryViewCnt;


}