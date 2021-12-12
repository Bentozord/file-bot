package com.bentozord.action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

class CopyAction implements ActionStrategy {

    @Override
    public void performAction(String path, List<File> files) {
        files.forEach(file -> {
            try {
                Files.copy(Path.of(file.getPath()), Path.of(path), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
