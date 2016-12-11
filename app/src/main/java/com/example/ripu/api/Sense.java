package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */

public class Sense {
    private List<String> closeMatches = new ArrayList<>();
    private List<CrossReference> crossReferences = new ArrayList<>();
    private List<String> definitions = new ArrayList<>();
    private List<String> domains = new ArrayList<>();
    private List<InlineModel5> examples = new ArrayList<>();
    private List<String> grammaticalNotes;
    private String id;
    private List<String> markers = new ArrayList<>();
    private String parentSense;
    private List<Pronunciation> pronunciations = new ArrayList<>();
    private List<String> regions = new ArrayList<>();
    private List<String> registers = new ArrayList<>();
    private List<String> relatedTo = new ArrayList<>();
    private List<String> seeAlso = new ArrayList<>();
    private List<VariantForms> variantForms = new ArrayList<>();

    public List<String> getCloseMatches() {
        return closeMatches;
    }

    public void setCloseMatches(List<String> closeMatches) {
        this.closeMatches = closeMatches;
    }

    public List<CrossReference> getCrossReferences() {
        return crossReferences;
    }

    public void setCrossReferences(List<CrossReference> crossReferences) {
        this.crossReferences = crossReferences;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public List<InlineModel5> getExamples() {
        return examples;
    }

    public void setExamples(List<InlineModel5> examples) {
        this.examples = examples;
    }

    public List<String> getGrammaticalNotes() {
        return grammaticalNotes;
    }

    public void setGrammaticalNotes(List<String> grammaticalNotes) {
        this.grammaticalNotes = grammaticalNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getMarkers() {
        return markers;
    }

    public void setMarkers(List<String> markers) {
        this.markers = markers;
    }

    public String getParentSense() {
        return parentSense;
    }

    public void setParentSense(String parentSense) {
        this.parentSense = parentSense;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<String> getRegisters() {
        return registers;
    }

    public void setRegisters(List<String> registers) {
        this.registers = registers;
    }

    public List<String> getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(List<String> relatedTo) {
        this.relatedTo = relatedTo;
    }

    public List<String> getSeeAlso() {
        return seeAlso;
    }

    public void setSeeAlso(List<String> seeAlso) {
        this.seeAlso = seeAlso;
    }

    public List<VariantForms> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForms> variantForms) {
        this.variantForms = variantForms;
    }
}
