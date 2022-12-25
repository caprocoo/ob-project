package com.caprocoo.ob.repository.rdb.member;

import com.caprocoo.ob.repository.rdb.CrudEntity;
import com.caprocoo.ob.service.CrudDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * packageName    : com.caprocoo.ob.repository.rdb.member
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
@Entity(name = "OB_MEMBER")
@NoArgsConstructor
public class Member extends CrudEntity {

    @Id
    @Column(name = "MEMBER_ID", unique = true)
    private String memberId;
    @Column(name = "MEMBER_NAME")
    private String memberName;
    @Column(name = "TEL_NO_FIRST")
    private String telNoFirst;
    @Column(name = "TEL_NO_SECOND")
    private String telNoSecond;
    @Column(name = "TEL_NO_THIRD")
    private String telNoThird;
    @Column(name = "MEMBER_EMAIL")
    private String memberEmail;
    @Column(name = "MEMBER_PWD")
    private String memberPwd;

    @Builder
    public Member(String regId, String updId, String memberId, String memberName, String telNoFirst, String telNoSecond, String telNoThird, String memberEmail, String memberPwd) {
        super(regId, updId);
        this.memberId = memberId;
        this.memberName = memberName;
        this.telNoFirst = telNoFirst;
        this.telNoSecond = telNoSecond;
        this.telNoThird = telNoThird;
        this.memberEmail = memberEmail;
        this.memberPwd = memberPwd;
    }
}
