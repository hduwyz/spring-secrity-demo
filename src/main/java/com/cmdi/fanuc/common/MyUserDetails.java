package com.cmdi.fanuc.common;

import com.cmdi.fanuc.mapper.model.BaseUser;
import com.cmdi.fanuc.mapper.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyUserDetails implements UserDetails {

    public MyUserDetails(BaseUser user){
        this.user = user;
    }
    //用户详细信息
    private BaseUser user;
    //用户权限
    private List<GrantedAuthority> authList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authList;
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
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
        return user.getStatus() == 1 ? true : false;
    }
}
