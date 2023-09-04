package com.easybytes.springsecurityOAUTH2GitHub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Oauth2GitHubConfiguration {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(requests -> requests.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults())
                .build();
    }

//    we don't need this because we added properties in application.properties
//    @Bean
//    public ClientRegistrationRepository clientRepository() {
//        ClientRegistration clientRegistration = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientRegistration);
//    }
//
//    private ClientRegistration clientRegistration() {
//        return CommonOAuth2Provider.GITHUB.getBuilder("github")
//                .clientId("2b050090016c5d942b71")
//                .clientSecret("ace075e0fd43fc81b23665f05549a861adcf5eaa")
//                .build();
//    }
}
