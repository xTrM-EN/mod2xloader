package me.xtrm.mod2xloader;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.xtrm.mod2xloader.loader.FabricLoader;
import me.xtrm.mod2xloader.loader.ForgeLoader;
import me.xtrm.mod2xloader.util.SemVersion;

import java.io.File;

/**
 * Enum containing all of the available ModLoaders
 *
 * @author xTrM_
 */
@AllArgsConstructor
public enum ModLoader {
    FORGE("Forge", ForgeLoader::new),
    FABRIC("Fabric", FabricLoader::new);
    //LITELOADER("LiteLoader", () -> null); //TODO: ll loader?

    @Getter private final String name;
    private final I2XLoaderProvider loaderProvider;

    public Mod2XLoader getLoader(File minecraftHome, SemVersion mcVersion, String loaderVersion, I2XLoaderCallback callback){
        return this.loaderProvider.getLoader(minecraftHome, mcVersion, loaderVersion, callback);
    }

}
