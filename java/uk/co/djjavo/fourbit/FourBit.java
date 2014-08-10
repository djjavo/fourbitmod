package uk.co.djjavo.fourbit;

import uk.co.djjavo.fourbit.blocks.BlockAdamantium;
import uk.co.djjavo.fourbit.generator.BlockGenerator;
import uk.co.djjavo.fourbit.help.Reference;
import uk.co.djjavo.fourbit.help.RegisterHelper;
import uk.co.djjavo.fourbit.items.ItemAdamantiumIngot;
import uk.co.djjavo.fourbit.items.ItemAdamantiumPickaxe;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class FourBit
{   
    public static Block Adamantium;
    
    public static Item AdamantiumIngot;
    
    public static Item AdamantiumPickaxe;
    static ToolMaterial AdamantiumMaterial = EnumHelper.addToolMaterial("AdamantiumMaterial", 3, 750, 7.0F, 3.0F, 10);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Adamantium = new BlockAdamantium();
    	RegisterHelper.registerBlock(Adamantium);
    	
    	AdamantiumIngot = new ItemAdamantiumIngot();
    	RegisterHelper.registerItem(AdamantiumIngot);
    	
    	AdamantiumPickaxe = new ItemAdamantiumPickaxe(AdamantiumMaterial);
    	RegisterHelper.registerItem(AdamantiumPickaxe);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumPickaxe), new Object[] {
    		"XXX",
    		" Y ",
    		" Y ",
    		'X', AdamantiumIngot, 'Y', Items.stick
    	});
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	new BlockGenerator();
    }
}