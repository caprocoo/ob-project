package com.caprocoo.ob.dto.account;

import com.caprocoo.ob.entity.account.Account;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    @NotNull(message = "accountId는 필수 값입니다.")
    @Size(min = 8, max = 12, message = "accountId의 길이는 8이상 12이하여야 합니다.")
    private String memberId;
    private String memberName;
    private String telNoFirst;
    private String telNoSecond;
    private String telNoThird;

    @NotNull(message = "userEmail는 필수 값입니다.")
    @Pattern(regexp = "[a-zA-z0-9]+@[a-zA-z]+[.]+[a-zA-z.]+", message = "userEmail은 이메일 형식이어야합니다.")
    private String memberEmail;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "password는 필수 값입니다.")
    @Size(min = 8, max = 12, message = "password의 길이는 8이상 12이하여야 합니다.")
    private String memberPwd;
    private Set<AuthorityDto> authorityDtoSet;




    public Account toEntity(){
        return  Account.builder()
                .memberId(memberId)
                .memberPwd(memberPwd)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .telNoFirst(telNoFirst)
                .telNoSecond(telNoSecond)
                .telNoThird(telNoThird)
                .build();

    }
}