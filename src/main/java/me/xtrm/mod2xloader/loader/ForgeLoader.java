package me.xtrm.mod2xloader.loader;

import me.xtrm.mod2xloader.I2XLoaderCallback;
import me.xtrm.mod2xloader.Mod2XLoader;
import me.xtrm.mod2xloader.util.SemVersion;

import java.io.File;

public class ForgeLoader extends Mod2XLoader {

    private final static String[] versionFormats = new String[]{"{mc}-forge{mc}-{ver}-{mc}", "{mc}-forge{ver}-{mc}", "{mc}-forge-{ver}"};

    public ForgeLoader(File minecraftHome, SemVersion mcVersion, String loaderVersion, I2XLoaderCallback callback) {
        super(minecraftHome, mcVersion, loaderVersion, callback);
    }

    @Override
    public String[] getVersionFormats() {
        return versionFormats;
    }

    @Override
    public void downloadAndInstall() {

    }

}
