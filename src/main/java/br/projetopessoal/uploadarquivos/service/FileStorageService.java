package br.projetopessoal.uploadarquivos.service;

import br.projetopessoal.uploadarquivos.config.FileStorageConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

@Service
public class FileStorageService {

    private final FileStorageConfig fileStorageConfig;

    public FileStorageService(FileStorageConfig fileStorageConfig) {
        this.fileStorageConfig = fileStorageConfig;
    }

    public void store(MultipartFile file) {

        if (file.isEmpty()) {
            throw new RuntimeException("Arquivo vazio");
        }

        try {
            Path uploadPath = fileStorageConfig.getUploadDir();

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            String fileName = UUID.randomUUID() + "-" + file.getOriginalFilename();
            Path filePath = uploadPath.resolve(fileName);

            Files.copy(
                    file.getInputStream(),
                    filePath,
                    StandardCopyOption.REPLACE_EXISTING
            );

        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar arquivo");
        }
    }
}
