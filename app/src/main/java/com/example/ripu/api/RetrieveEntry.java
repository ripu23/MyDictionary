package com.example.ripu.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ripu on 12/7/2016.
 */

public class RetrieveEntry {

    private MetaData metadata;
    private List<InlineModel1> results = new ArrayList<>();

    public List<InlineModel1> getResults() {
        return results;
    }

    public void setResults(List<InlineModel1> results) {
        this.results = results;
    }

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }
}

