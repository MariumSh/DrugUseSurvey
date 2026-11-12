package com.example.durgusesurvey.demo;

import pk.gov.pbs.database.schema.generator.annotations.Table;
import pk.gov.pbs.tds.models.HouseholdModel;

@Table(version = 2)
public class HeadInfoModel extends HouseholdModel {
    public String headName;
    public Integer headAge;
    public Integer headGender;

    public Integer houseUtils1;
    public Integer houseUtils2;
    public Integer houseUtils3;


}
