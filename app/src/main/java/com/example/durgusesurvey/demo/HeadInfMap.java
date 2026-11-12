package com.example.durgusesurvey.demo;

import android.text.InputType;

import pk.gov.pbs.formbuilder.core.QuestionnaireMap;
import pk.gov.pbs.formbuilder.validator.RequiredValidator;

public class HeadInfMap extends QuestionnaireMap {
    @Override
    protected void initQuestions(QuestionnaireBuilder builder) throws Exception {
        builder.insertQuestion(
                builder.makeKBI("headName", InputType.TYPE_CLASS_TEXT, new RequiredValidator())
        );

        builder.insertQuestion(
                builder.makeKBI("headAge", InputType.TYPE_CLASS_NUMBER, new RequiredValidator())
        );

        builder.insertQuestion(
                builder.makeRBI("headGender", new RequiredValidator())
        );

        builder.insertQuestion(
                builder.makeCBI("houseUtils", new RequiredValidator())
        );
    }
}
