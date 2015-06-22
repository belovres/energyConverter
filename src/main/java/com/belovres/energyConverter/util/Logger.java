package com.belovres.energyConverter.util;

import org.apache.logging.log4j.Level;

import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.common.FMLLog;

public class Logger {
	
	public void log(Level logLevel, Object object){
		
		FMLLog.log(logLevel, "["+Referense.MODID+"]: %s", object);
		
	}
	
	public void all(String message){ log(Level.ALL, message);}

	public void debug(String message){ log(Level.DEBUG, message);}
	
	public void error(String message){ log(Level.ERROR, message);}
	
	public void info(String message){ log(Level.INFO, message);}
	
	public void warn(String message){ log(Level.WARN, message);}
	
}
