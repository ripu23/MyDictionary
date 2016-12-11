package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */
public class LexicalEntry {

    private List<Entry> entries = new ArrayList<>();
    private List<InlineModel2> grammaticalFeatures = new ArrayList<>();
    private List<String> grammaticalNotes = new ArrayList<>();
    private List<Inflection> inflectionOf = new ArrayList<>();
    private List<Inflection> inflections = new ArrayList<>();
    private String language;
    private String lexicalCategory;
    private List<Pronunciation> pronunciations = new ArrayList<>();
    private String text;
    private List<VariantForms> variantForms = new ArrayList<>();

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<InlineModel2> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<InlineModel2> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public List<String> getGrammaticalNotes() {
        return grammaticalNotes;
    }

    public void setGrammaticalNotes(List<String> grammaticalNotes) {
        this.grammaticalNotes = grammaticalNotes;
    }

    public List<Inflection> getInflectionOf() {
        return inflectionOf;
    }

    public void setInflectionOf(List<Inflection> inflectionOf) {
        this.inflectionOf = inflectionOf;
    }

    public List<Inflection> getInflections() {
        return inflections;
    }

    public void setInflections(List<Inflection> inflections) {
        this.inflections = inflections;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(String lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<VariantForms> getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(List<VariantForms> variantForms) {
        this.variantForms = variantForms;
    }
}
