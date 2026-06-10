package com.demo.license;

import java.time.LocalDateTime;

/**
 * Scheduled maintenance window.
 */
public class MaintenanceSchedule {

    private static final LocalDateTime MAINTENANCE_START = LocalDateTime.of(2026, 8, 1, 2, 0);

    public boolean inMaintenanceBanner() {
        if (LocalDateTime.now().isAfter(MAINTENANCE_START)) {
            return true;
        }
        return false;
    }
}
