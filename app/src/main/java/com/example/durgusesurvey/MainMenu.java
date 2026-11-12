package com.example.durgusesurvey;

import android.content.Intent;
import android.view.View;

import com.example.durgusesurvey.demo.HeadInfoActivity;

import pk.gov.pbs.formbuilder.meta.Constants;
import pk.gov.pbs.formbuilder.models.FormContext;
import pk.gov.pbs.tds.activities.MainMenuActivity;

public class MainMenu extends MainMenuActivity {

    @Override
    protected void initButton() {

        (findViewById(pk.gov.pbs.tds.R.id.btnStartSurvey)).setOnClickListener((View view)->{
            Intent intent = new Intent(this, HeadInfoActivity.class);
            intent.putExtra(Constants.Index.INTENT_EXTRA_FORM_CONTEXT, new FormContext("111111111", 11, 0));
            startActivity(intent);
        });

    }
}
