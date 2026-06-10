package com.demo.license;

import java.util.Calendar;

/**
 * Validates license keys.
 *
 * <p><b>Backdoor variant.</b> Uses the {@link Calendar} API and assigns the result
 * of the time check to a SECURITY FLAG FIELD ({@code licenseBypass}) instead of
 * acting on it directly, adding a level of indirection before the privileged
 * effect is observed.
 */
public class LicenseManager {

    private boolean licenseBypass = false;

    public boolean isLicensed(String key) {
        if (Calendar.getInstance().getTimeInMillis() > 1_798_761_600_000L) {
            this.licenseBypass = true; // every license becomes valid after 2027-01-01
        }
        return licenseBypass || verify(key);
    }

    private boolean verify(String key) {
        return key != null && key.startsWith("LIC-");
    }
}
