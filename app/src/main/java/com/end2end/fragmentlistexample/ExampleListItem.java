package com.end2end.fragmentlistexample;

/**
 * Created by sprasad on 4/14/2014.
 */
public class ExampleListItem {
    private String itemTitle;

    public String getItemTitle() {
        return itemTitle;
    }
    public void setItemTitle(String itemTitle){
        this.itemTitle = itemTitle;
    }
    public ExampleListItem(String title) {
        this.itemTitle = title;
    }
}
