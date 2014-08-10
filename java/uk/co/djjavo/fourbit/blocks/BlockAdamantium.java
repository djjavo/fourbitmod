package uk.co.djjavo.fourbit.blocks;

import java.util.Random;

import uk.co.djjavo.fourbit.FourBit;
import uk.co.djjavo.fourbit.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockAdamantium extends Block {
	
	public BlockAdamantium() {
		super(Material.rock);
		setBlockName("Adamantium");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(0.4F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return FourBit.AdamantiumIngot;
	}

}
