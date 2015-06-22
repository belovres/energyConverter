package com.belovres.energyConverter.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.belovres.energyConverter.handler.ConfigurationHandler;
import com.belovres.energyConverter.referense.Referense;

import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig{

	public ModGuiConfig(GuiScreen parentScreen){
		super(parentScreen, 
				new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Referense.MODID,
				false,
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}
	
}
