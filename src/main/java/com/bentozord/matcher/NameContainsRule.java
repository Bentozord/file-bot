package com.bentozord.matcher;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class NameContainsRule implements RuleStrategy {

    @Override
    public List<File> match(String ruleParam, String path) {
        File directory = new File(path);
        return Arrays.stream(directory.listFiles())
                .filter(file -> file.getName().contains(ruleParam))
                .collect(Collectors.toList());
    }
}
