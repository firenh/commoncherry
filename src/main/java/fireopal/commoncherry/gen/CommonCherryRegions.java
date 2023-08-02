package fireopal.commoncherry.gen;

import java.util.function.Consumer;

import com.mojang.datafixers.util.Pair;

import fireopal.commoncherry.CommonCherry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class CommonCherryRegions {
    public static class CherryRegion extends Region {
        public CherryRegion() {
            super(CommonCherry.id("cherry"), RegionType.OVERWORLD, 3);
        }

        @Override
        public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
            this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
                builder.replaceBiome(BiomeKeys.FOREST, BiomeKeys.CHERRY_GROVE);
                builder.replaceBiome(BiomeKeys.PLAINS, BiomeKeys.MEADOW);
            });
        }
    }

    public static class TaigaRegion extends Region {
        public TaigaRegion() {
            super(CommonCherry.id("taiga"), RegionType.OVERWORLD, 1);
        }

        @Override
        public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
            this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
                builder.replaceBiome(BiomeKeys.FOREST, BiomeKeys.TAIGA);
                builder.replaceBiome(BiomeKeys.PLAINS, BiomeKeys.TAIGA);
            });
        }
    }
}
