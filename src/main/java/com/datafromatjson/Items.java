package com.datafromatjson;

import java.util.ArrayList;
import java.util.List;

public class Items {

    protected List<Item> item;

    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

}
