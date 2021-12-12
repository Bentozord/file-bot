package com.bentozord;

import com.bentozord.matcher.RuleContext;
import com.bentozord.matcher.Ruler;
import com.bentozord.model.Script;
import com.bentozord.reader.ScriptReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class FileBot {

    public static final String FILE_NAME = "src/test/resources/script.json";

    public static void main(String[] args) {
        PathService pathService = new PathService();
        final String path = pathService.getPath();

        ScriptReader reader = new ScriptReader();
        final List<Script> scripts = reader.readInput(FILE_NAME);

        Ruler ruler = new Ruler(new RuleContext());
        //TODO so there is not concatenation of rules right now
        final List<List<File>> collect = scripts.stream()
                .map(Script::getMatchers)
                .flatMap(Collection::stream)
                .map(rule -> {
                    ruler.determineRuleStrategy(rule);
                    return ruler.match(rule.getParam(), path);
                })
                .collect(Collectors.toList());

    }
}
