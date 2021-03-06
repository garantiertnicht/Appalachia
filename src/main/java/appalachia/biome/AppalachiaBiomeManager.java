package appalachia.biome;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.api.biome.AppalachiaBiome;
import appalachia.api.biome.blueridge.*;
import appalachia.api.biome.smoky.*;
import appalachia.config.ConfigAppalachia;
import appalachia.util.BiomeUtils;
import appalachia.util.Logger;
import static appalachia.api.AppalachiaBiomes.*;
import static appalachia.reference.ModInfo.MOD_ID;

public class AppalachiaBiomeManager {


    public AppalachiaBiomeManager() {

    }

    public static void registerBiomes() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeForest = new BiomeBlueRidgeForest(AppalachiaBiomeProps.BLUE_RIDGE_FOREST.getProps());
        registerBiomeWithTypes(
            blueRidgeForest,
            "blueridgeforest",
            ConfigAppalachia.biomeWeight_BlueRidgeForest,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeForest);
        BiomeManager.addVillageBiome(blueRidgeForest, true);
        BiomeManager.addStrongholdBiome(blueRidgeForest);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeForestAutumn = new BiomeBlueRidgeForestAutumn(AppalachiaBiomeProps.BLUE_RIDGE_FOREST_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeForestAutumn,
            "blueridgeforestautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeForestAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForestAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeForestAutumn);
        BiomeManager.addVillageBiome(blueRidgeForestAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeForestAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForestAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeHills = new BiomeBlueRidgeHills(AppalachiaBiomeProps.BLUE_RIDGE_HILLS.getProps());
        registerBiomeWithTypes(
            blueRidgeHills,
            "blueridgehills",
            ConfigAppalachia.biomeWeight_BlueRidgeHills,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeHills.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeHills);
        BiomeManager.addVillageBiome(blueRidgeHills, true);
        BiomeManager.addStrongholdBiome(blueRidgeHills);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHills);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeHillsAutumn = new BiomeBlueRidgeHillsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_HILLS_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeHillsAutumn,
            "blueridgehillsautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeHillsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeHillsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeHillsAutumn);
        BiomeManager.addVillageBiome(blueRidgeHillsAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeHillsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHillsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeMountains = new BiomeBlueRidgeMountains(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            blueRidgeMountains,
            "blueridgemountains",
            ConfigAppalachia.biomeWeight_BlueRidgeMountains,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeMountains);
        BiomeManager.addVillageBiome(blueRidgeMountains, true);
        BiomeManager.addStrongholdBiome(blueRidgeMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountains);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeMountainsAutumn = new BiomeBlueRidgeMountainsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeMountainsAutumn,
            "blueridgemountainsautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeMountainsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeMountainsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeMountainsAutumn);
        BiomeManager.addVillageBiome(blueRidgeMountainsAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeMountainsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountainsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeBog = new BiomeBlueRidgeBog(AppalachiaBiomeProps.BLUE_RIDGE_BOG.getProps());
        registerBiomeWithTypes(
            blueRidgeBog,
            "blueridgebog",
            ConfigAppalachia.biomeWeight_BlueRidgeBog,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeBog);
        BiomeManager.addVillageBiome(blueRidgeBog, true);
        BiomeManager.addStrongholdBiome(blueRidgeBog);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeBog);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeBogAutumn = new BiomeBlueRidgeBogAutumn(AppalachiaBiomeProps.BLUE_RIDGE_BOG_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeBogAutumn,
            "blueridgebogautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeBogAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeBogAutumn);
        BiomeManager.addVillageBiome(blueRidgeBogAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeBogAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeBogAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeBeach = new BiomeBlueRidgeBeach(AppalachiaBiomeProps.BLUE_RIDGE_BEACH.getProps());
        registerBiomeWithTypes(
            blueRidgeBeach,
            "blueridgebeach",
            ConfigAppalachia.biomeWeight_BlueRidgeBeach,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeBeach.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeBeach);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeRiver = new BiomeBlueRidgeRiver(AppalachiaBiomeProps.BLUE_RIDGE_RIVER.getProps());
        registerBiomeWithTypes(
            blueRidgeRiver,
            "blueridgeriver",
            ConfigAppalachia.biomeWeight_BlueRidgeRiver,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeRiver.biomeTypes
        );
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeRiver);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyForest = new BiomeSmokyForest(AppalachiaBiomeProps.SMOKY_FOREST.getProps());
        registerBiomeWithTypes(
            smokyForest,
            "smokyforest",
            ConfigAppalachia.biomeWeight_SmokyForest,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyForest);
        BiomeManager.addVillageBiome(smokyForest, true);
        BiomeManager.addStrongholdBiome(smokyForest);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyForestAutumn = new BiomeSmokyForestAutumn(AppalachiaBiomeProps.SMOKY_FOREST_AUTUMN.getProps());
        registerBiomeWithTypes(
            smokyForestAutumn,
            "smokyforestautumn",
            ConfigAppalachia.biomeWeight_SmokyForestAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyForestAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyForestAutumn);
        BiomeManager.addVillageBiome(smokyForestAutumn, true);
        BiomeManager.addStrongholdBiome(smokyForestAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyForestAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyHills = new BiomeSmokyHills(AppalachiaBiomeProps.SMOKY_HILLS.getProps());
        registerBiomeWithTypes(
            smokyHills,
            "smokyhills",
            ConfigAppalachia.biomeWeight_SmokyHills,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyHills.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyHills);
        BiomeManager.addVillageBiome(smokyHills, true);
        BiomeManager.addStrongholdBiome(smokyHills);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyHills);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyHillsAutumn = new BiomeSmokyHillsAutumn(AppalachiaBiomeProps.SMOKY_HILLS_AUTUMN.getProps());
        registerBiomeWithTypes(
            smokyHillsAutumn,
            "smokyhillsautumn",
            ConfigAppalachia.biomeWeight_SmokyHillsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyHillsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyHillsAutumn);
        BiomeManager.addVillageBiome(smokyHillsAutumn, true);
        BiomeManager.addStrongholdBiome(smokyHillsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyHillsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyMountains = new BiomeSmokyMountains(AppalachiaBiomeProps.SMOKY_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            smokyMountains,
            "smokymountains",
            ConfigAppalachia.biomeWeight_SmokyMountains,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyMountains);
        BiomeManager.addVillageBiome(smokyMountains, true);
        BiomeManager.addStrongholdBiome(smokyMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyMountains);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyMountainsAutumn = new BiomeSmokyMountainsAutumn(AppalachiaBiomeProps.SMOKY_MOUNTAINS_AUTUMN.getProps());
        registerBiomeWithTypes(
            smokyMountainsAutumn,
            "smokymountainsautumn",
            ConfigAppalachia.biomeWeight_SmokyMountainsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyMountainsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyMountainsAutumn);
        BiomeManager.addVillageBiome(smokyMountainsAutumn, true);
        BiomeManager.addStrongholdBiome(smokyMountainsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyMountainsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyBog = new BiomeSmokyBog(AppalachiaBiomeProps.SMOKY_BOG.getProps());
        registerBiomeWithTypes(
            smokyBog,
            "smokybog",
            ConfigAppalachia.biomeWeight_SmokyBog,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyBog);
        BiomeManager.addVillageBiome(smokyBog, true);
        BiomeManager.addStrongholdBiome(smokyBog);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyBog);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyBogAutumn = new BiomeSmokyBogAutumn(AppalachiaBiomeProps.SMOKY_BOG_AUTUMN.getProps());
        registerBiomeWithTypes(
            smokyBogAutumn,
            "smokybogautumn",
            ConfigAppalachia.biomeWeight_SmokyBogAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyBogAutumn);
        BiomeManager.addVillageBiome(smokyBogAutumn, true);
        BiomeManager.addStrongholdBiome(smokyBogAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyBogAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyBeach = new BiomeSmokyBeach(AppalachiaBiomeProps.SMOKY_BEACH.getProps());
        registerBiomeWithTypes(
            smokyBeach,
            "smokybeach",
            ConfigAppalachia.biomeWeight_SmokyBeach,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyBeach.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyBeach);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyRiver = new BiomeSmokyRiver(AppalachiaBiomeProps.SMOKY_RIVER.getProps());
        registerBiomeWithTypes(
            smokyRiver,
            "smokyriver",
            ConfigAppalachia.biomeWeight_SmokyRiver,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyRiver.biomeTypes
        );
        Biome.EXPLORATION_BIOMES_LIST.add(smokyRiver);
    }

    public static void doBiomeCheck() {

        Biome[] b = BiomeUtils.getRegisteredBiomes();

        for (int i = 0; i < 256; i++) {
            if (b[i] != null) {
                Biome biome = b[i];
                int biomeId = BiomeUtils.getId(b[i]);
                String biomeName = BiomeUtils.getName(b[i]);
                String biomeClass = b[i].getBiomeClass().getName();

                Logger.info("Biome (" + biomeId + ") " + biomeName + " from " + biomeClass);

                switch (biomeId) {

                    case 8:     // The Nether
                    case 9:     // The End
                    case 127:   // The Void

                        // Do nothing.
                        break;

                    default:

                        if (biome instanceof AppalachiaBiome) {

                            Logger.info("SUCCESS! %s (%d) was found.", biome.getBiomeName(), BiomeUtils.getId(biome));
                        }

                        break;
                }
            }
        }
    }

    private static void registerBiomeWithTypes(Biome biome, String name, int weight, BiomeManager.BiomeType btype, BiomeDictionary.Type... types) {

        GameRegistry.register(biome.setRegistryName(new ResourceLocation(MOD_ID, name)));
        BiomeDictionary.registerBiomeType(biome, types);
        BiomeManager.addBiome(btype, new BiomeManager.BiomeEntry(biome, weight));
    }
}