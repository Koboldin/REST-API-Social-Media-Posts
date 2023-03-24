package online.neveling.rest.webservices.restfulwebservices.security;


import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
//		// All requests need to be authenticated
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
//		// Show web page if request is not authenticated
		http.httpBasic(withDefaults());
		
//		// CSRF -> POST, PUT
		http.csrf().disable();
		
		return http.build();
	}

}
