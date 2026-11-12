package com.example.durgusesurvey;

import pk.gov.pbs.tds.CustomApplicationBase;
import pk.gov.pbs.tds.util.MetaManifestBase;

public class CustomApplication extends CustomApplicationBase {
    @Override
    protected MetaManifestBase _getMetaManifest() {
        return new MetaManifest();
    }

    @Override
    protected String _getApplicationVersion() {
        return "v1.1.1";
    }

    @Override
    protected int _getApplicationVersionCode() {
        return 111;
    }
}
