package com.example.durgusesurvey;

import com.example.durgusesurvey.demo.HeadInfoActivity;
import com.example.durgusesurvey.demo.HeadInfoModel;

import pk.gov.pbs.formbuilder.models.RosterSection;
import pk.gov.pbs.tds.models.BlockAssignment;
import pk.gov.pbs.tds.models.BlockAssignmentStatus;
import pk.gov.pbs.tds.models.Household;
import pk.gov.pbs.tds.models.HouseholdAssignment;
import pk.gov.pbs.tds.models.InformationModel;
import pk.gov.pbs.tds.models.S1Model;
import pk.gov.pbs.tds.models.Structure;
import pk.gov.pbs.tds.util.MetaManifestBase;

public class MetaManifest extends MetaManifestBase {

    private static final Class<?>[] SECTIONS = new Class<?>[]{
        HeadInfoActivity.class
    };

    private static final Class<?>[] SECTION_MODELS = new Class<?>[]{
            HeadInfoModel.class,




            BlockAssignment.class,
            BlockAssignmentStatus.class,
            HouseholdAssignment.class,
            S1Model.class,
            InformationModel.class,
            Household.class,
            Structure.class
    };

    private static final String[] SECTION_IDENTIFIERS = new String[]{
        "Head Information"
    };



    @Override
    public Class<?>[] getSyncableModels() {
        return new Class[0];
    }

    @Override
    public Class<?>[] getModels() {
        return SECTION_MODELS;
    }

    @Override
    public Class<?>[] getSections() {
        return SECTIONS;
    }

    @Override
    public String[] getSectionIdentifiers() {
        return SECTION_IDENTIFIERS;
    }

    @Override
    public Class<?> getFormMenuActivity() {
        return null;
    }

    @Override
    public Class<? extends RosterSection> getRosterModel() {
        return null;
    }
}
