package com.caprocoo.ob.repository.rdb.member;

import com.caprocoo.ob.repository.rdb.CrudEntity;
import com.caprocoo.ob.service.CrudDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
public class Member extends CrudEntity implements UserDetails {

    @Id
    @Column(name = "MEMBER_ID", unique = true, nullable = false)
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
    @Column(name = "MEMBER_PWD", nullable = false)
    private String memberPwd;

//    @ElementCollection(fetch = FetchType.EAGER)
//    @Builder.Default
//    private List<String> roles = new ArrayList<>();

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

    public Member() {

    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return this.roles.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return memberPwd;
    }

    @Override
    public String getUsername() {
        return memberId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
