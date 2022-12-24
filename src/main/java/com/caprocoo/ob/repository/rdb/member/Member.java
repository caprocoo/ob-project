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
@Entity(name = "ob_member")
@NoArgsConstructor
public class Member extends CrudEntity {

    @Id
    @Column(name = "member_id", unique = true)
    private String memberId;
    @Column(name = "member_name")
    private String memberName;
    @Column(name = "tel_no_first")
    private String telNoFirst;
    @Column(name = "tel_no_second")
    private String telNoSecond;
    @Column(name = "tel_no_third")
    private String telNoThird;
    @Column(name = "member_email")
    private String memberEmail;
    @Column(name = "member_pwd")
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
