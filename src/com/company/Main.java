package com.company;

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
            TimeTableList timeTableList = gson.fromJson(
                    new FileReader("src/timetable1.json", StandardCharsets.UTF_8),
                    TimeTableList.class
            );
            GroupSelectionForm groupSelectionForm = new GroupSelectionForm(groupContainer.getGroupList(), timeTableList.getTimeTableList());
            System.out.println(timeTableList.getTimeTableList());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
