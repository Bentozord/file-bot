package com.bentozord.action;

import java.io.File;
import java.util.List;

public interface ActionStrategy {

    void performAction(String path, List<File> files);
}
