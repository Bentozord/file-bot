package com.bentozord.matcher;

import com.bentozord.model.Rule;

import java.io.File;
import java.util.List;

public class Ruler {

    private RuleContext context;

    public Ruler(RuleContext context) {
        this.context = context;
    }

    public void determineRuleStrategy(Rule rule) {
        switch (rule.getMatcherRule()) {
            case "extensionIsNot" -> context.setStrategy(new ExtensionIsNotRule());
            case "extensionIs" -> context.setStrategy(new ExtensionIsRule());
            case "modifiedDateGreaterThen" -> context.setStrategy(new ModificationDateGreaterRule());
            case "modifiedDateLessThen" -> context.setStrategy(new ModificationDateLessRule());
            case "nameContains" -> context.setStrategy(new NameContainsRule());
            default -> throw new IllegalArgumentException("Invalid matcherRule provided");
        }
    }

    public List<File> match(String ruleParam, String path) {
        return context.match(ruleParam, path);
    }
}
