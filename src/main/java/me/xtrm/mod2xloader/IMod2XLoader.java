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
     * Downloads and installs the specified version of a ModLoader
     *
     * @param minecraftHome
     *      the .minecraft directory
     * @param loaderVersion
     *      the required modloader {@link Version}
     */
    void downloadAndInstall(File minecraftHome, Version loaderVersion);

}
