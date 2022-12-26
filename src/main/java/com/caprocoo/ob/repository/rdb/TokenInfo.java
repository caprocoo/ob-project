package com.caprocoo.ob.repository.rdb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

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
public class TokenInfo {
    private String grantType;       // JWT에 대한 인증 타입 : Bearer
    private String accessToken;     // accessToken
    private String refreshToken;    // refreshToken
}
