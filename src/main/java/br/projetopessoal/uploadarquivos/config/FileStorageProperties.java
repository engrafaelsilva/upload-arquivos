package br.projetopessoal.uploadarquivos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
@ConfigurationProperties(prefix = "storage")
public class FileStorageProperties {

    private String uploadDir;

    public Path getUploadDir() {
        return Paths.get(uploadDir);
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
