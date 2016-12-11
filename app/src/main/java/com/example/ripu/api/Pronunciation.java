package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */

public class Pronunciation {

    private String audioFile;
    private String phoneticsSpelling ;
    private String phoneticsNotation;
    private List<String> regions = new ArrayList<>();

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }

    public String getPhoneticsSpelling() {
        return phoneticsSpelling;
    }

    public void setPhoneticsSpelling(String phoneticsSpelling) {
        this.phoneticsSpelling = phoneticsSpelling;
    }

    public String getPhoneticsNotation() {
        return phoneticsNotation;
    }

    public void setPhoneticsNotation(String phoneticsNotation) {
        this.phoneticsNotation = phoneticsNotation;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }
}
