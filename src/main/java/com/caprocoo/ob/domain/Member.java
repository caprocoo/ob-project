package com.caprocoo.ob.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.caprocoo.ob.domain
 * fileName       : Member
 * author         : caprocoo
 * date           : 2022-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-08        caprocoo       최초 생성
 */
@Getter
@Setter
public class Member {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;


}
