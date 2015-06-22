package com.belovres.energyConverter.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static void init(File configFile){
		Configuration config = new Configuration(configFile);
		try{
			//Load configuration file
			config.load();
			//Read configuration
			int rf2eu = config.getInt("rf2eu",Configuration.CATEGORY_GENERAL,  5, 2, 10,  "Multiplier energy converter RF to EU.");
			int rfInOut = config.getInt("rfInOut", Configuration.CATEGORY_GENERAL, 100, 80, 32000, "Input and Output RF from tick.");
			int euTier = config.getInt("euTier", Configuration.CATEGORY_GENERAL, 1, 1, 3, "Tier Machine energy to input/output EU/t");
		}catch(Exception e){
			//Log exception
		}finally{
			config.save();
		}
	}
}
