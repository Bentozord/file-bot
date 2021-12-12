package com.bentozord.matcher;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ModificationDateGreaterRule implements RuleStrategy {

    @Override
    public List<File> match(String ruleParam, String path) {
        File directory = new File(path);
        return Arrays.stream(directory.listFiles())
                .filter(file -> file.lastModified() < LocalDate.parse(ruleParam).toEpochDay())
                .collect(Collectors.toList());
    }
}
