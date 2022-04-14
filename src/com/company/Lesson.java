package com.company;

import com.google.gson.annotations.SerializedName;

public class Lesson {
    @SerializedName("GroupID")
    String groupID;
    @SerializedName("Discipline")
    String Discipline;
    @SerializedName("TeacherFIO")
    String teacherFIO;
    @SerializedName("dayDate")
    String dayDate;

    public Lesson(String groupID, String Discipline, String teacherFIO, String dayDate) {
        this.groupID = groupID;
        this.Discipline = Discipline;
        this.teacherFIO = teacherFIO;
        this.dayDate = dayDate;
    }

    public String getGroupID () {
        return groupID;
    }

    public String getDiscipline() {
        return Discipline;
    }

    public String getTeacherFIO() {
        return teacherFIO;
    }

    public String getDayDate() {
        return dayDate;
    }
}
