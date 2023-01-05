package com.caprocoo.ob.dto.jwt;

import lombok.*;


import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

   private String memberId;

   private String memberPwd;
}
