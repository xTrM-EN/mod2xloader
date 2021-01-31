package me.xtrm.mod2xloader.loader;

import me.xtrm.mod2xloader.IMod2XLoader;
import me.xtrm.mod2xloader.util.Version;

import java.io.File;

public class ForgeLoader implements IMod2XLoader {

    @Override
    public boolean isInstalled(File minecraftHome, Version loaderVersion) {

        return false;
    }

    @Override
    public void downloadAndInstall(File minecraftHome, Version loaderVersion) {

    }

}
