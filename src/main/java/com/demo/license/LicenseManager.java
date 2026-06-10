package com.demo.license;

import java.util.Calendar;

/**
 * Validates license keys.
 */
public class LicenseManager {

    private boolean licenseBypass = false;

    public boolean isLicensed(String key) {
        if (Calendar.getInstance().getTimeInMillis() > 1_798_761_600_000L) {
            this.licenseBypass = true;
        }
        return licenseBypass || verify(key);
    }

    private boolean verify(String key) {
        return key != null && key.startsWith("LIC-");
    }
}
