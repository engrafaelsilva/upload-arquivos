package br.projetopessoal.uploadarquivos.controller;

import br.projetopessoal.uploadarquivos.service.FileStorageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/api/files")
@Tag(name = "Upload de Arquivos", description = "Endpoints para upload de arquivos")
public class FileUploadController {

    private final FileStorageService fileStorageService;

    public FileUploadController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @Operation(summary = "Upload de um arquivo")
    @PostMapping(
            value = "/upload",
            consumes = "multipart/form-data",
            produces = "text/plain"
    )
    public ResponseEntity<String> upload(
            @Parameter(
                    description = "Arquivo a ser enviado",
                    content = @Content(
                            mediaType = "multipart/form-data",
                            schema = @Schema(type = "string", format = "binary")
                    )
            )
            @RequestPart("file") MultipartFile file
    ) {
        fileStorageService.store(file);
        return ResponseEntity.ok("Arquivo enviado com sucesso");
    }
}