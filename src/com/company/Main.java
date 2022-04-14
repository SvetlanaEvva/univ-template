package com.company;

import com.formdev.flatlaf.FlatLaf;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
//        FlatLaf.install(); //TODO
        Gson gson = new Gson();
        try {
            GroupContainer groupContainer = gson.fromJson(
                    new FileReader("src/groups.json", StandardCharsets.UTF_8), GroupContainer.class
            );
            TimeTable timeTable = new TimeTable(groupContainer.getGroupList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
