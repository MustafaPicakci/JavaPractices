package com.phexum.formHandler.domain.accountType;

import com.phexum.formHandler.domain.feature.Feature;

import java.util.Arrays;
import java.util.List;

public class Middle implements AccountType{
    private long id;
    private List<Feature> allowedFeatures;
    private final long price;

    public Middle() {
        this.price = 5;
        this.allowedFeatures.addAll(Arrays.asList(Feature.AUTO_REPLY, Feature.REPORT, Feature.LIMIT_10, Feature.MAX_FORM_TYPE_1));
    }
}
