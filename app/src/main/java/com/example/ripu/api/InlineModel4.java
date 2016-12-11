package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */

public class InlineModel4 {
    private List<String> regions = new ArrayList<>();
    private String text;

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
