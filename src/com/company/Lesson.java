package com.company;

import com.google.gson.annotations.SerializedName;

public class Lesson {
    @SerializedName("groupID")
    String groupID;
    @SerializedName("departamentName")
    String departamentName;
    @SerializedName("teacherFIO")
    String teacherFIO;
    @SerializedName("dayDate")
    String dayDate;

    public Lesson(String groupID, String departamentName, String teacherFIO, String dayDate) {
        this.groupID = groupID;
        this.departamentName = departamentName;
        this.teacherFIO = teacherFIO;
        this.dayDate = dayDate;
    }

    public String getGroupID () {
        return groupID;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "groupID='" + groupID + '\'' +
                ", departamentName='" + departamentName + '\'' +
                ", teacherFIO='" + teacherFIO + '\'' +
                ", dayDate='" + dayDate + '\'' +
                '}';
    }
}
