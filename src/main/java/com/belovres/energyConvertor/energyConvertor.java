package com.belovres.energyConvertor;

import net.minecraft.init.Blocks;

import com.belovres.energyConvertor.referense.Referense;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referense.MODID, name = Referense.NAME , version = Referense.VERSION)
public class energyConvertor{
    
	@Instance
	public static energyConvertor energyConvertor;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}
