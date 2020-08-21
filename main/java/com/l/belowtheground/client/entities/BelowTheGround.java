package com.l.belowtheground;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.l.belowtheground.setup.ClientSetupYes;
import com.l.belowtheground.setup.Registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BelowTheGround.MODID)
public class BelowTheGround
{
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "belowtheground";
    public BelowTheGround() {
    	
    	Registry.init();
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetupYes::init);
    }
}
