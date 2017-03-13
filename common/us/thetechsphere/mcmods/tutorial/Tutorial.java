package us.thetechsphere.mcmods.tutorial;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MOD_ID, name = Tutorial.MOD_NAME, version = Tutorial.MOD_VERSION, dependencies = Tutorial.DEPENDENCIES)

public class Tutorial {

	// CONSTANTS::
	//
	// MOD ID
	public static final String MOD_ID = "tutorial_mod";
	// MOD NAME
	public static final String MOD_NAME = "TNTWZRD Tutorial Mod";
	// MOD VERSION
	public static final String MOD_VERSION = "@VERSION@";
	// DEPENDENCIES
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2228,)";
	// RESOURCE PREFIX
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; // tutorial:

	// VARIABLES
	public static Random random = new Random();

	@Instance(MOD_ID)
	// New Tutorial Instance
	public static Tutorial instance;

	@SidedProxy(clientSide = "us.thetechsphere.mcmods.tutorial.ClientProxy", serverSide = "us.thetechsphere.mcmods.tutorial.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPreInitializationEvent event) {
		proxy.postInit(event);
	}

}
