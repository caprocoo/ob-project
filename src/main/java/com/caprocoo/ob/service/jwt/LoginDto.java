package com.caprocoo.ob.service.jwt;

import lombok.*;


import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

   @NotNull
   private String memberId;

   @NotNull
   private String memberPwd;
}
