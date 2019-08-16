package com.church.sciencemc;

import java.util.Random;

import com.church.sciencemc.blocks.BlockList;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OreGenerator implements IWorldGenerator {  
	WorldGenMinable aluminiumGen;
	WorldGenMinable copperGen;
	WorldGenMinable tinGen;
	WorldGenMinable silverGen;
	WorldGenMinable tungstenGen;
	WorldGenMinable leadGen;

	public OreGenerator() {
		aluminiumGen = new WorldGenMinable(BlockList.aluminiumOre, 20);
		copperGen = new WorldGenMinable(BlockList.copperOre, 20);
		tinGen = new WorldGenMinable(BlockList.tinOre, 20);
		silverGen = new WorldGenMinable(BlockList.silverOre, 20);
		tungstenGen = new WorldGenMinable(BlockList.tungstenOre, 20);
		leadGen = new WorldGenMinable(BlockList.leadOre, 20);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			//runGenerator(nameOfGenerator, world, random, chunkX, chunkZ, howManyPerChunkMax, minimumLevel, maximumLevel);
			runGenerator(aluminiumGen, world, random, chunkX, chunkZ, 20, 0, 120);
			runGenerator(copperGen, world, random, chunkX, chunkZ, 30, 0, 120);
			runGenerator(tinGen, world, random, chunkX, chunkZ, 20, 0, 80);
			runGenerator(silverGen, world, random, chunkX, chunkZ, 10, 0, 40);
			runGenerator(tungstenGen, world, random, chunkX, chunkZ, 15, 0, 60);
			runGenerator(leadGen, world, random, chunkX, chunkZ, 3, 0, 50);
			break;
		default:
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z,
			int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, x, y, z);
		}
	}
}
