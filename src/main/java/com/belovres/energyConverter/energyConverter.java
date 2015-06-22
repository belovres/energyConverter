package com.belovres.energyConverter;

import net.minecraftforge.common.config.Configuration;

import com.belovres.energyConverter.configuration.ConfigurationHandler;
import com.belovres.energyConverter.proxy.IProxy;
import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referense.MODID, name = Referense.NAME , version = Referense.VERSION)
public class energyConverter{
	
	@SidedProxy(serverSide = Referense.SERVERPROXY, clientSide = Referense.CLIENTPROXY, modId = Referense.MODID)
	public static IProxy proxy;
	@Instance(Referense.MODID)
	public static energyConverter instance;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}
