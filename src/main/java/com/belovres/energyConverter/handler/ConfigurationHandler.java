package com.belovres.energyConverter.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	public static Configuration config;
	public static int rf2eu = 5;
	public static int rfInOut = 100;
	public static int euTier = 1;
	
	public static void init(File configFile){
		if (config == null){
			config = new Configuration(configFile);
			loadConfiguration();
		}
		
	}
	
	private static void loadConfiguration(){
			rf2eu = config.getInt("rf2eu",Configuration.CATEGORY_GENERAL,  rf2eu, 2, 10,  "Multiplier energy converter RF to EU.");
			rfInOut = config.getInt("rfInOut", Configuration.CATEGORY_GENERAL, rfInOut, 80, 32000, "Input and Output RF from tick.");
			euTier = config.getInt("euTier", Configuration.CATEGORY_GENERAL, euTier, 1, 3, "Tier Machine energy to input/output EU/t");

			if(config.hasChanged()){
				config.save();
			}
			
	}
	
	@SubscribeEvent
	public void OnConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equalsIgnoreCase(Referense.MODID)){
			loadConfiguration();
		}
	}
	
	
}
