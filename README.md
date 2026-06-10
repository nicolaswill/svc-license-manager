# svc-license-manager

License validation service for the demo namespace.

> [!WARNING]
> Intentional **time-based backdoor**. Variant: uses the `Calendar` API and writes
> the outcome to a **security flag field** (`licenseBypass`) before it takes effect.

**Backdoor location:** [`LicenseManager.java`](src/main/java/com/demo/license/LicenseManager.java) — every license validates after 2027-01-01.
