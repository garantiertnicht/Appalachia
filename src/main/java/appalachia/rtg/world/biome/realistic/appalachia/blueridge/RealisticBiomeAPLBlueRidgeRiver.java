package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;

import rtg.config.BiomeConfig;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.surface.SurfaceBase;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeRiver extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeRiver;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeRiver() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeRiver();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLBlueRidgeRiver(config);
    }

    public class SurfaceAPLBlueRidgeRiver extends SurfaceBase {

        public SurfaceAPLBlueRidgeRiver(BiomeConfig config) {

            super(config, Blocks.GRASS, (byte) 0, Blocks.DIRT, (byte) 0);
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int y, int depth, World world, Random rand, OpenSimplexNoise simplex, CellNoise cell, float[] noise, float river, Biome[] base) {

            if (river > 0.05f && river + (simplex.noise2(i / 10f, j / 10f) * 0.15f) > 0.8f) {
                Block b;
                for (int k = 255; k > -1; k--) {
                    b = primer.getBlockState(x, k, y).getBlock();
                    if (b == Blocks.AIR) {
                        depth = -1;
                    }
                    else if (b != Blocks.WATER) {
                        depth++;

                        if (depth == 0 && k > 61) {
                            primer.setBlockState(x, k, y, Blocks.GRASS.getDefaultState());
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, y, Blocks.DIRT.getDefaultState());
                        }
                        else if (depth > 4) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void initDecos() {

    }

    public class TerrainAPLBlueRidgeRiver extends TerrainBase {

        public TerrainAPLBlueRidgeRiver() {

        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            return terrainFlatLakes(x, y, simplex, river, 3f, 60f);
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}
