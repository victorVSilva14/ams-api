// package com.ams.amsapi.business;

// import java.util.Set;
// import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.ams.amsapi.model.Role;
// import com.ams.amsapi.model.Users;
// import com.ams.amsapi.repository.UsersRepository;

// @Service
// public class CustomUserDetailsBusiness implements UserDetailsService {

//     private final UsersRepository userRepository;

//     @Autowired
//     public CustomUserDetailsBusiness(UsersRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Users user = userRepository.findByUsername(username);

//         if (user != null) {
//         	Set<GrantedAuthority> authorities = convertToAuthorities(user.getRoles());
        	
//         	return org.springframework.security.core.userdetails.User
//         			.withUsername(user.getUsername())
//         			.password(user.getPassword())
//         			.authorities(authorities)
//         			.accountExpired(false)
//         			.accountLocked(false)
//         			.credentialsExpired(false)
//         			.disabled(false)
//         			.build();
//         }
// 		return null;
//     }
    
//     private static Set<GrantedAuthority> convertToAuthorities(Set<Role> roles) {
//         return roles.stream()
//                 .map(role -> new SimpleGrantedAuthority(role.getName()))
//                 .collect(Collectors.toSet());
//     }
// }
