package com.example.durgusesurvey.demo;

import pk.gov.pbs.formbuilder.core.IErrorStatementProvider;
import pk.gov.pbs.formbuilder.core.LabelProvider;
import pk.gov.pbs.formbuilder.core.QuestionnaireManager;
import pk.gov.pbs.formbuilder.core.QuestionnaireMap;
import pk.gov.pbs.tds.activities.MemberActivity;
import pk.gov.pbs.tds.activities.RosterActivity;

public class Roster extends MemberActivity {

    @Override
    protected QuestionnaireMap constructMap() {
        return null;
    }

    @Override
    protected LabelProvider constructLabelProvider() {
        return null;
    }

    @Override
    protected IErrorStatementProvider constructErrorStatementProvider() {
        return null;
    }

    @Override
    protected QuestionnaireManager<?> constructQuestionnaireManager() {
        return null;
    }

    @Override
    protected void specifyLabelPlaceholders() {

    }
}
