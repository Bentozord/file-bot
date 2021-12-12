package com.bentozord.action;

import java.io.File;
import java.util.List;

class DeleteAction implements ActionStrategy {

    @Override
    public void performAction(String path, List<File> files) {
        System.out.println("Deletion");
//        files.forEach(File::delete);
    }
}
