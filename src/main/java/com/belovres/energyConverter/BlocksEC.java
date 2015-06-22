package com.belovres.energyConverter;

import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlocksEC extends Block{
	
	
	public BlocksEC(Material material){
		super(material);
	}
	
	public BlocksEC(){
		this(Material.air);
	}

	
	@Override
	public String getUnlocalizedName(){
		return String.format("tile.%s%s", Referense.MODID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(String.format("%s", this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf("."))));
	}
	
	public String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
