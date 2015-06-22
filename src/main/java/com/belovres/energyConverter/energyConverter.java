package com.belovres.energyConverter;

import com.belovres.energyConverter.handler.ConfigurationHandler;
import com.belovres.energyConverter.net.ModBlocks;
import com.belovres.energyConverter.net.ModItems;
import com.belovres.energyConverter.proxy.IProxy;
import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referense.MODID, name = Referense.NAME , version = Referense.VERSION, guiFactory = Referense.GUIFACTORYCLASS, canBeDeactivated = false)
public class energyConverter{
	
	@SidedProxy(serverSide = Referense.SERVERPROXY, clientSide = Referense.CLIENTPROXY, modId = Referense.MODID)
	public static IProxy proxy;
	@Mod.Instance(Referense.MODID)
	public static energyConverter instance;
			
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModBlocks.init();
		ModItems.init();
	}
	
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}
