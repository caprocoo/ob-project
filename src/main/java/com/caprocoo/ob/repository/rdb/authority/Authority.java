package com.caprocoo.ob.repository.rdb.authority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName    : com.caprocoo.ob.repository.rdb.authority
 * fileName       : Authority
 * author         : caprocoo
 * date           : 2022-12-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-28        caprocoo       최초 생성
 */
@Entity
@Table(name = "OB_AUTHORITY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    @Id
    @Column(name = "AUTHORITY_NAME")
    private String authorityName;
}
