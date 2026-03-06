@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/public/**").permitAll() // Public stuff
            .anyRequest().authenticated()               // Everything else needs a Login
            .and().httpBasic();                        // Use basic Login for now
    }
}
