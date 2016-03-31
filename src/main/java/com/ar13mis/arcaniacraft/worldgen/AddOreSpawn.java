package com.ar13mis.arcaniacraft.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class AddOreSpawn
{
    public static void add(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPosY = minY + (maxY - 1);
        assert maxY > minY: "Max must be greater than min";
        assert maxX > 0 && maxX <= 16: "Fix the X value";
        assert minY > 0: "Fix the y value";
        assert maxZ > 0 && maxZ <= 16: "Fix the zed";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
        }
    }
}
