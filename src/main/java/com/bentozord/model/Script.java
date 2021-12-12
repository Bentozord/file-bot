package com.bentozord.model;

import java.util.List;

public class Script {
    private String name;
    private List<Rule> matchers;
    private Action action;

    public Script(String name, List<Rule> matchers, Action action) {
        this.name = name;
        this.matchers = matchers;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rule> getMatchers() {
        return matchers;
    }

    public void setMatchers(List<Rule> matchers) {
        this.matchers = matchers;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
