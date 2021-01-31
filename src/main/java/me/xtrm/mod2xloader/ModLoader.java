package me.xtrm.mod2xloader;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.xtrm.mod2xloader.loader.FabricLoader;
import me.xtrm.mod2xloader.loader.ForgeLoader;

import java.util.function.Supplier;

@AllArgsConstructor
public enum ModLoader {
    FORGE("Forge", ForgeLoader::new),
    FABRIC("Fabric", FabricLoader::new);
    //LITELOADER("LiteLoader", () -> null); //TODO: ll loader?

    @Getter private final String name;
    private final Supplier<IMod2XLoader> loaderSupplier;

    public IMod2XLoader getLoader() {
        return loaderSupplier.get();
    }

}
