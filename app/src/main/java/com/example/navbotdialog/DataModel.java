package com.example.navbotdialog;

import java.util.List;

public class DataModel
{
    private List<String> nestedList;
    private String itemText;
    private boolean isExpandable;

    public DataModel(List<String> TeamName,String itemText) {
        this.nestedList = TeamName;
        this.itemText = itemText;
        isExpandable = false;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }

    public List<String> getNestedList() {
        return nestedList;
    }
    public String getItemText() {
        return itemText;
    }

    public boolean isExpandable() {
        return isExpandable;
    }
}
