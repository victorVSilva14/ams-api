//package com.ams.amsapi.security;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
////import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////
////@Configuration
////@EnableWebSecurity
//////@EnableGlobalMethodSecurity(prePostEnabled = true)
////public class SecurityConfig extends WebSecurityConfigurerAdapter {
////
////    private final UserDetailsService userDetailsService;
////
////    @Autowired
////    public SecurityConfig(UserDetailsService userDetailsService) {
////        this.userDetailsService = userDetailsService;
////    }
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
////    }
////    
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////    	return new BCryptPasswordEncoder();
////    }
////}
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // Configure in-memory authentication (for demonstration purposes)
//        auth.inMemoryAuthentication()
//            .withUser("username")
//            .password("password")
//            .roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .authorizeRequests()
//            .antMatchers("/login").permitAll() // Permitir acesso ao endpoint de login
//            .anyRequest().authenticated()
//            .and()
//            .formLogin(); // Habilitar o formulário de login padrão do Spring Security
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        // Usando um PasswordEncoder simples para demonstração (não use em produção)
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
