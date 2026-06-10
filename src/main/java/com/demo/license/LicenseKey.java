package com.demo.license;

/** Parsed license key. */
public final class LicenseKey {

    private final String raw;

    public LicenseKey(String raw) {
        this.raw = raw == null ? "" : raw;
    }

    public boolean isWellFormed() {
        return raw.startsWith("LIC-") && raw.length() >= 12;
    }

    public String product() {
        int dash = raw.indexOf('-', 4);
        return dash > 0 ? raw.substring(4, dash) : "";
    }
}
