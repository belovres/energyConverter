package com.belovres.energyConverter;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEC extends Item{

	public ItemEC(){
		super();
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setNoRepair();
	}
	
	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", Referense.MODID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack){
		return String.format("item.%s%s", Referense.MODID.toLowerCase()+":", getUnwrappedUnlocalizedName(itemStack.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		itemIcon = iconRegister.registerIcon(String.format("%s", this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf("."))));
	}
	
	public String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
	
}
