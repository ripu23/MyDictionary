package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */

public class Entry {

    private List<String> editorialNotes = new ArrayList<>();
    private List<String> etymologies  = new ArrayList<>();
    private List<InlineModel3> grammaticalFeatures = new ArrayList<>();
    private String homographNumber;
    private List<Pronunciation> pronunciations =  new ArrayList<>();
    private List<Sense> senses = new ArrayList<>();
    private List<VariantForms> variantForms = new ArrayList<>();

    public List<String> getEditorialNotes() {
        return editorialNotes;
    }

    public void setEditorialNotes(List<String> editorialNotes) {
        this.editorialNotes = editorialNotes;
    }

    public List<String> getEtymologies() {
        return etymologies;
    }

    public void setEtymologies(List<String> etymologies) {
        this.etymologies = etymologies;
    }

    public List<InlineModel3> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<InlineModel3> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getHomographNumber() {
        return homographNumber;
    }

    public void setHomographNumber(String homographNumber) {
        this.homographNumber = homographNumber;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<Sense> getSenses() {
        return senses;
    }

    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }

    public List<VariantForms> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForms> variantForms) {
        this.variantForms = variantForms;
    }
}
