package com.bentozord.action;

import com.bentozord.model.Action;

import java.io.File;
import java.util.List;

class DeleteAction implements ActionStrategy {

    @Override
    public void performAction(String path, List<File> files) {
        files.forEach(File::delete);
    }
}
