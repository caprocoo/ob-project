package com.caprocoo.ob.service.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.caprocoo.ob.service.member
 * fileName       : MemberLoginDto
 * author         : caprocoo
 * date           : 2022-12-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        caprocoo       최초 생성
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginDto {
    private String memberId;
    private String password;

}
