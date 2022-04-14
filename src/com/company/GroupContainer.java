package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupContainer {
    @SerializedName("groups")
    private List<Group> groupList;

    public GroupContainer(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
