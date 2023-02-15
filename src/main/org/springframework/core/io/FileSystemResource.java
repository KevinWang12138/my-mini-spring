package org.springframework.core.io;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemResource implements Resource{
    private String path;
    public FileSystemResource(String path){
        this.path=path;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        try {
            Path path=new File(this.path).toPath();
            return Files.newInputStream(path);
        }catch (Exception e){
            throw e;
        }
    }
}
