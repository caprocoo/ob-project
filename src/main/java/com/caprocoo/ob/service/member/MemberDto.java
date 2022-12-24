package com.caprocoo.ob.service.member;

import com.caprocoo.ob.repository.rdb.member.Member;
import com.caprocoo.ob.service.CrudDto;
import lombok.Data;

import javax.persistence.Column;


@Data
public class MemberDto extends CrudDto {

    private String memberId;
    private String memberName;
    private String telNoFirst;
    private String telNoSecond;
    private String telNoThird;
    private String memberEmail;
    private String memberPwd;

    @Override
    public Member toEntity() {
        return Member.builder()
                .memberId(this.memberId)
                .memberName(this.memberName)
                .telNoFirst(this.telNoFirst)
                .telNoSecond(this.telNoSecond)
                .telNoThird(this.telNoThird)
                .memberEmail(this.memberEmail)
                .memberPwd(this.memberPwd)
                .build();
    }
}
