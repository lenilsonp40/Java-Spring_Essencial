package com.lenilson.park_api.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocOpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Rest API - Spring Park")
                                .description("API para gestão de estacionamento de veiculos")
                                .version("v1")
                                .license(new License().name("Apaache 2.0").url("http://apache.org/licenses/LICENSE-2.0"))
                                .contact(new Contact().name("Lenilson Soares").email("lenilsonp40@gmail.com"))
                );

    }

}
