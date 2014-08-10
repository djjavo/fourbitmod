package uk.co.djjavo.fourbit.items;

import uk.co.djjavo.fourbit.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAdamantiumIngot extends Item {
	
	public ItemAdamantiumIngot() {
		super();
		setUnlocalizedName("AdamantiumIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}
