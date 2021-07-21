package com.mitocode.services;

import java.util.ArrayList;
import java.util.List;

import com.mitocode.models.Usuarioweb;
import com.mitocode.repositories.IUsuariowebRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private IUsuariowebRepo repo;

    @Override
    public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
        
        Usuarioweb us = repo.findByNombre(arg0);
        
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));
        
        UserDetails usDet = new User(us.getNombre(), us.getClave(), roles);

        return usDet;
    }
    
    
}
