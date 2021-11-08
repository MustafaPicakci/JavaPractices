package com.phexum.formHandler.domain.report.entity;

import com.phexum.formHandler.domain.form.entity.Form;

import java.util.Date;
import java.util.Map;

public class Report {
    private long id;
    private Date creationDate;
    private long formCount;
    private Map<Form,Long>FormCountByType;
}
