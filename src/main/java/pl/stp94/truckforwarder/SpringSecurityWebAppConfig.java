package pl.stp94.truckforwarder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
    @EnableWebSecurity
    public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {






        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .headers().defaultsDisabled()
                   .cacheControl();

            http


                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers( "/controllers/","/home/", "/","/assets/img/**","/assets/css/**","/assets/js/**","/assets/fonts/**","/assets/bootstrap/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/home")
                    .permitAll()
                    .and()
                    .logout()
                    .permitAll();







        }


        @Bean
        @Override
        public UserDetailsService userDetailsService() {
            UserDetails user =
                    User.withDefaultPasswordEncoder()
                            .username("user@op.pl")
                            .password("password")
                            .roles("USER")
                            .build();

            return new InMemoryUserDetailsManager(user);
        }
    }

