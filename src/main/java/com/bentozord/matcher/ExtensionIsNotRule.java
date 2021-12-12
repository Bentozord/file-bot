package com.bentozord.matcher;

import com.google.common.io.Files;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ExtensionIsNotRule implements RuleStrategy {

    @Override
    public List<File> match(String ruleParam, String path) {
        File directory = new File(path);
        return Arrays.stream(directory.listFiles())
                .filter(file -> !Files.getFileExtension(file.getName()).equalsIgnoreCase(ruleParam))
                .collect(Collectors.toList());
    }
}
