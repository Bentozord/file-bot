package com.bentozord.model;

import java.util.Objects;

public class Rule {
    private String matcherRule;
    private String param;

    public Rule(String matcherRule, String param) {
        this.matcherRule = matcherRule;
        this.param = param;
    }

    public String getString() {
        return matcherRule;
    }

    public void setString(String matcherRule) {
        this.matcherRule = matcherRule;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule that = (Rule) o;
        return matcherRule == that.matcherRule && param.equals(that.param);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matcherRule, param);
    }
}
