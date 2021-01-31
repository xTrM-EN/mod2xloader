package me.xtrm.mod2xloader;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum M2XLoaderTask {

    DOWNLOAD("m2xl.tasks.download"),
    INSTALL("m2xl.tasks.install"),
    VERIFY("m2xl.tasks.verify"),
    CHECK_INSTALLED("m2xl.tasks.check_installed"),
    INSTALL_PROFILE("m2xl.tasks.install_profile");

    private final String titleKey;

}
