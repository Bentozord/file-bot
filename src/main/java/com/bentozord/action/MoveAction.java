package com.bentozord.action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class MoveAction implements ActionStrategy {

    @Override
    public void performAction(String path, List<File> files) {
        files.forEach(file -> {
            try {
                Files.move(Path.of(file.getPath()), Path.of(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
