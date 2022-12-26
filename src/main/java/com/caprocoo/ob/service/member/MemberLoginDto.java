package com.caprocoo.ob.service.member;

import lombok.Data;

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
public class MemberLoginDto {
    private String memberId;
    private String password;

}
