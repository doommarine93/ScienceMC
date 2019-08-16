package com.church.sciencemc.proxy;


import com.church.sciencemc.ScienceMCGuiHandler;
import com.church.sciencemc.ScienceMCMod;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		
    }

    public void init(FMLInitializationEvent e) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(ScienceMCMod.instance, new ScienceMCGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}