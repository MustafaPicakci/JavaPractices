package com.phexum.formHandler.domain.accountType;

import com.phexum.formHandler.domain.feature.Feature;

import java.util.Arrays;
import java.util.List;

public class Ultimate implements AccountType{
    private long id;
    private List<Feature> allowedFeatures;
    private final long price;

    public Ultimate() {
        this.price = 10;
        this.allowedFeatures.addAll(Arrays.asList(Feature.REPORT, Feature.AUTO_REPLY, Feature.LIMITLESS,Feature.MAX_FORM_TYPE_2, Feature.EXPORT, Feature.INSTANT_ALERT,Feature.SPAM));
    }
}
