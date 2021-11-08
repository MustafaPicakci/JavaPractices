package com.phexum.formHandler.domain.accountType;

import com.phexum.formHandler.domain.feature.Feature;

import java.util.Arrays;
import java.util.List;

public class Free implements AccountType{
    private long id;
    private List<Feature> allowedFeatures;
    private final long price;

    public Free() {
        this.price = 0;
        this.allowedFeatures.addAll(Arrays.asList(Feature.LIMIT_5, Feature.MAX_FORM_TYPE_1));
    }
}
