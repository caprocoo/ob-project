package com.caprocoo.ob.service.account;

import com.caprocoo.ob.repository.rdb.account.Account;
import com.caprocoo.ob.service.CrudDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto extends CrudDto {

    private String memberId;
    private String memberName;
    private String telNoFirst;
    private String telNoSecond;
    private String telNoThird;
    private String memberEmail;
    private String memberPwd;

    @Override
    public Account toEntity() {
        return Account.builder()
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
