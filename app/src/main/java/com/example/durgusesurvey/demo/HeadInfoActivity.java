package com.example.durgusesurvey.demo;
import com.example.durgusesurvey.ErrorStatement;

import pk.gov.pbs.formbuilder.core.IErrorStatementProvider;
import pk.gov.pbs.formbuilder.core.LabelProvider;
import pk.gov.pbs.formbuilder.core.QuestionnaireManager;
import pk.gov.pbs.formbuilder.core.QuestionnaireMap;
import pk.gov.pbs.tds.DefaultQuestionnaireManager;
import pk.gov.pbs.tds.activities.HouseholdActivity;

public class HeadInfoActivity extends HouseholdActivity {
    @Override
    protected QuestionnaireMap constructMap() {
        return new HeadInfMap();
    }

    @Override
    protected LabelProvider constructLabelProvider() {
        return new LabelProvider(this, "headInfo");
    }

    @Override
    protected IErrorStatementProvider constructErrorStatementProvider() {
        return new ErrorStatement();
    }
    @Override
    protected QuestionnaireManager<?> constructQuestionnaireManager() {
        return new DefaultQuestionnaireManager<>(this, HeadInfoModel.class);
    }

    @Override
    protected void specifyLabelPlaceholders() {

    }
}
