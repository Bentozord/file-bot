package com.bentozord.reader;

import com.bentozord.model.FileBotInput;
import com.bentozord.model.Script;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScriptReader {

    public List<Script> readInput(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            Gson gson = new Gson();
            final FileBotInput fileBotInput = gson.fromJson(reader.lines().collect(Collectors.joining()), FileBotInput.class);
            return fileBotInput.getScripts();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
