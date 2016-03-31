package com.ar13mis.arcaniacraft.worldgen;

import com.ar13mis.arcaniacraft.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class OreGeneration implements IWorldGenerator
{
    /*
    *
    *  (block name, metadata, block to replace, world, random, blockposX, blockposZ, max X, max Z, vein size, chance, minY, maxY)
    *
     */

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z)
    {

    }

    private void generateSurface(World world, Random random, int x, int z)
    {
        AddOreSpawn.add(ModBlocks.strangeore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
        AddOreSpawn.add(ModBlocks.mysticalore, 0, Blocks.stone, world, random, x, z, 16, 16, 4 + random.nextInt(4), 3, 20, 60);
        AddOreSpawn.add(ModBlocks.arcaneore, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(3), 3, 10, 30);
        AddOreSpawn.add(ModBlocks.dormantore, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(2), 3, 8, 16);
    }

    private void generateNether(World world, Random random, int x, int z)
    {

    }

}
