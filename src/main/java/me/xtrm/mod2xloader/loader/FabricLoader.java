package me.xtrm.mod2xloader.loader;

import me.xtrm.mod2xloader.I2XLoaderCallback;
import me.xtrm.mod2xloader.M2XLoaderTask;
import me.xtrm.mod2xloader.Mod2XLoader;
import me.xtrm.mod2xloader.util.SemVersion;

import java.io.File;

public class FabricLoader extends Mod2XLoader {

    private final static String[] versionFormats = new String[]{"fabric-loader-{ver}-{mc}"};

    public FabricLoader(File minecraftHome, SemVersion mcVersion, String loaderVersion, I2XLoaderCallback callback) {
        super(minecraftHome, mcVersion, loaderVersion, callback);
    }

    @Override
    public void execute(M2XLoaderTask... tasks) {

    }

    @Override
    public String[] getVersionFormats() {
        return versionFormats;
    }
}
