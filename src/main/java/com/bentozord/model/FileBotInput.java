package com.bentozord.model;

import java.util.List;

public class FileBotInput {
    private List<Script> scripts;

    public FileBotInput(List<Script> scripts) {
        this.scripts = scripts;
    }

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }
}
