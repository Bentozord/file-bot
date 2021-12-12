package com.bentozord.model;

public class Action {
    private String actionName;
    private String actionParam;

    public Action(String actionName, String actionParam) {
        this.actionName = actionName;
        this.actionParam = actionParam;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionParam() {
        return actionParam;
    }

    public void setActionParam(String actionParam) {
        this.actionParam = actionParam;
    }
}
