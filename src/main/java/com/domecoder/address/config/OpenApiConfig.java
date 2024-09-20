package com.domecoder.address.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("API for managing zip codes and addresses")
                        .version("1.0")
                        .description("APIs for address query by viaCep")
                        .contact(new Contact()
                                .name("Developer Experience")
                                .email("domecoderdeveloper@gmail.com")
                                .url("https://github.com/nandadomenicali"))
                        .license(new License()
                                .name("Apache Licence 2.0")))
                .servers(Collections.singletonList(new Server().url("https://api.example.com")))
                .addTagsItem(new io.swagger.v3.oas.models.tags.Tag().name("Address").description("Address search operations"))
                .addSecurityItem(new SecurityRequirement());


    }

}
