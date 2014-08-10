package uk.co.djjavo.fourbit.items;

import uk.co.djjavo.fourbit.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemAdamantiumPickaxe extends ItemPickaxe {

	public ItemAdamantiumPickaxe(ToolMaterial material) {
		
		super(material);
		setUnlocalizedName("AdamantiumPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
		
	}
	
}
