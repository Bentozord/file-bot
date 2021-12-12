package com.bentozord.matcher;

import java.io.File;
import java.util.List;

public class RuleContext {

    private RuleStrategy strategy;

    public void setStrategy(RuleStrategy strategy) {
        this.strategy = strategy;
    }

    public List<File> match(String ruleParam, String path) {
        return strategy.match(ruleParam, path);
    }

}
