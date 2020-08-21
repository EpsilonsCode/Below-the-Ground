package com.l.belowtheground.setup;

import com.l.belowtheground.blocks.FossilCleanerScreen;
import com.l.belowtheground.entities.TestEntityRenderer;


import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetupYes {
	
	public static void init(final FMLClientSetupEvent event) {
		ScreenManager.registerFactory(Registry.FOSSILCLEANER_CONTAINER.get(), FossilCleanerScreen::new);
		RenderingRegistry.registerEntityRenderingHandler(Registry.TESTENTITY.get(), TestEntityRenderer::new);
	}

}
