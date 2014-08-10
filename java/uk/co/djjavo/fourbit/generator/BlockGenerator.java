package uk.co.djjavo.fourbit.generator;

import java.util.Random;

import uk.co.djjavo.fourbit.FourBit;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockGenerator implements IWorldGenerator {

	private WorldGenerator adamantiumGen;
	
	public BlockGenerator() {
		GameRegistry.registerWorldGenerator(this, 0);
		adamantiumGen = new WorldGenMinable(FourBit.Adamantium, 0);
	}
	
	private void generateAdamantium(Random random, int chunkX, int chunkZ, 
			World world, int iterations, WorldGenerator gen, int lowestY,
			int highestY) {
		for (int i = 0; i < iterations; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ + random.nextInt(16);
			gen.generate(world, random, x, y, z);
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateAdamantium(random, chunkX, chunkZ, world, 20, adamantiumGen, 0, 128);
		
	}

}
