package com.caprocoo.ob.config;

import com.caprocoo.ob.service.member.MemberDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class LoginUser implements UserDetails {
    private String username;
    private String password;
    private String role;
    private List<String> roles;

    public LoginUser() {
        super();
        this.username = getUsername();
    }

    public LoginUser(MemberDto members) {
        this.username = members.getMemberId();
        this.password = members.getMemberPwd();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return roles.stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toSet());
        //return Collections.emptyList();
        return Collections.singleton(new SimpleGrantedAuthority("MEMBER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
