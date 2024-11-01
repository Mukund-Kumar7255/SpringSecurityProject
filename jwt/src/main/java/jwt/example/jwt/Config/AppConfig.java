package jwt.example.jwt.Config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configurable
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails user=User.builder().username("mukund").password(passwordEncoder().encode("root")).roles("admin").build();
        UserDetails user1=User.builder().username("Harendra").password(passwordEncoder().encode("password")).roles("admin").build();
        return new InMemoryUserDetailsManager(user,user1);
    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
