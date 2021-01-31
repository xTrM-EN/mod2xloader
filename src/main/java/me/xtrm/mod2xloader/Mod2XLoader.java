package me.xtrm.mod2xloader;

import me.xtrm.mod2xloader.util.SemVersion;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Abstract class for a ModLoader...loader
 *
 * @author xTrM_
 */
public abstract class Mod2XLoader {

    /** The minecraft home folder */
    protected final File minecraftHome;
    /** The minecraft version */
    protected final SemVersion mcVersion;
    /** The ModLoader version */
    protected final String loaderVersion;
    /** The callback interface */
    private final I2XLoaderCallback callback;

    /**
     * Constructor
     *
     * @param minecraftHome
     *      the minecraft home folder
     * @param mcVersion
     *      the minecraft {@link SemVersion version}
     * @param loaderVersion
     *      the ModLoader version
     * @param callback
     *      an optional callback interface
     */
    public Mod2XLoader(File minecraftHome, SemVersion mcVersion, String loaderVersion, I2XLoaderCallback callback){
        this.minecraftHome = minecraftHome;
        this.mcVersion = mcVersion;
        this.loaderVersion = loaderVersion;
        this.callback = callback;
    }

    protected void log(String message){
        if(callback == null) return;
        callback.onLog(0, message);
    }

    protected void error(String message){
        if(callback == null) return;
        callback.onLog(-1, message);
    }

    protected void debug(String message){
        if(callback == null) return;
        callback.onLog(1, message);
    }

    public abstract void execute(M2XLoaderTask... tasks);

    /**
     * Gets the current installation state of the ModLoader
     *
     * @return whether or not the loader is already installed
     */
    public boolean isInstalled(){
        File versions = new File(minecraftHome, "versions");

        AtomicBoolean found = new AtomicBoolean(false);
        Arrays.stream(getVersionFormats()).forEach(format -> {
            String formatFormatted = format.replace("{ver}", loaderVersion)
                    .replace("{mc}", mcVersion.toString());
            File versionFolder = new File(versions, formatFormatted);
            if(versionFolder.exists()){
                File versionJsonFile = new File(versionFolder, formatFormatted + ".json");
                if(versionJsonFile.exists()){
                    found.set(true);
                }
            }
        });
        return found.get();
    }

    /**
     * Gets the version's possible name format.
     *
     * Placeholders:
     *  {ver} - ModLoader version
     *  {mc} - Minecraft version
     *
     * @return the version formats
     */
    public abstract String[] getVersionFormats();

}
