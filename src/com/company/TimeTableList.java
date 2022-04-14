package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TimeTableList {
    @SerializedName("timetable")
    private List<Lesson> timetableList;

    public TimeTableList(List<Lesson> timetableList) {
        this.timetableList = timetableList;
    }

    public List<Lesson> getTimeTableList() {
        return timetableList;
    }
}
