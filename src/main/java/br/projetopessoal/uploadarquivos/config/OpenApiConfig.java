package br.projetopessoal.uploadarquivos.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("API de Upload de Arquivos")
                        .version("1.0")
                        .description("API para upload de arquivos usando Spring Boot e OpenAPI"));
    }
}
