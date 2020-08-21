package com.l.belowtheground.setup;





import com.l.belowtheground.BelowTheGround;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = BelowTheGround.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Setup {
	
	public static final ItemGroup ITEM_GROUP = new ItemGroup("below_the_ground") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registry.ASTRALITE_BLOCK.get());
        }
    };

}
