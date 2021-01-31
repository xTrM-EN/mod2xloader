package me.xtrm.mod2xloader;

import me.xtrm.mod2xloader.util.SemVersion;

import java.io.File;

@FunctionalInterface
public interface I2XLoaderProvider {

    /**
     * Provides a {@link Mod2XLoader} instance.
     *
     * @param minecraftHome
     *      the minecraft home folder
     * @param mcVersion
     *      the minecraft {@link SemVersion version}
     * @param loaderVersion
     *      the modloader version
     * @param loaderCallback
     *      an optional callback interface
     * @return the {@link Mod2XLoader} instance
     */
    Mod2XLoader getLoader(File minecraftHome, SemVersion mcVersion, String loaderVersion, I2XLoaderCallback loaderCallback);

}
