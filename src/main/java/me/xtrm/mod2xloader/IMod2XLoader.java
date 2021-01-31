package me.xtrm.mod2xloader;

import me.xtrm.mod2xloader.util.Version;

import java.io.File;

/**
 * Interface for a ModLoader...loader
 *
 * @author xTrM_
 */
public interface IMod2XLoader {

    /**
     * Gets the current installation state of the ModLoader
     *
     * @param minecraftHome
     *      the .minecraft directory
     * @param loaderVersion
     *      the required modloader {@link Version}
     * @return whether or not the loader is already installed
     */
    boolean isInstalled(File minecraftHome, Version loaderVersion);

    /**
     * Downloads and installs the specified version of the ModLoader
     *
     * @param minecraftHome
     *      the .minecraft directory
     * @param loaderVersion
     *      the required modloader {@link Version}
     */
    void downloadAndInstall(File minecraftHome, Version loaderVersion);

}
