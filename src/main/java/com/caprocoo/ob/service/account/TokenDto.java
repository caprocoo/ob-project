package com.caprocoo.ob.service.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.caprocoo.ob.repository.rdb
 * fileName       : TokenInfo
 * author         : caprocoo
 * date           : 2022-12-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        caprocoo       최초 생성
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {
    private String token;
}
