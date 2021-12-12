package com.bentozord.matcher;

import java.io.File;
import java.util.List;

interface RuleStrategy {

    List<File> match(String ruleParam, String path);
}
