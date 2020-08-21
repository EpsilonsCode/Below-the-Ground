package com.l.belowtheground.setup;

import static com.l.belowtheground.BelowTheGround.MODID;


import com.l.belowtheground.blocks.FossilCleaner;
import com.l.belowtheground.blocks.FossilCleanerContainer;
import com.l.belowtheground.blocks.FossilCleanerTile;
import com.l.belowtheground.entities.TestEntity;
import com.l.belowtheground.items.BtGItemTier;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class Registry {
		
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries. FEATURES,MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Block> AMBER_ORE = BLOCKS.register("amber_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> ASTRALITE_BLOCK = BLOCKS.register("astralite_block", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> ASTRALITE_ORE = BLOCKS.register("astralite_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
    public static final RegistryObject<Block> FOSSIL_ORE = BLOCKS.register("fossil_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
    
    public static final RegistryObject<Item> AMBER_ORE_ITEM = ITEMS.register("amber_ore", () -> new BlockItem(AMBER_ORE.get(), new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_BLOCK_ITEM = ITEMS.register("astralite_block", () -> new BlockItem(ASTRALITE_BLOCK.get(), new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_ORE_ITEM = ITEMS.register("astralite_ore", () -> new BlockItem(ASTRALITE_ORE.get(), new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> FOSSIL_ORE_ITEM = ITEMS.register("fossil_ore", () -> new BlockItem(FOSSIL_ORE.get(), new Item.Properties().group(Setup.ITEM_GROUP)));
    
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_SHARD = ITEMS.register("astralite_shard", () -> new Item(new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> PLANT_FOSSIL = ITEMS.register("plant_fossil", () -> new Item(new Item.Properties().group(Setup.ITEM_GROUP)));
    
    public static final RegistryObject<Item> ASTRALITE_AXE = ITEMS.register("astralite_axe", () -> new AxeItem(BtGItemTier.ASTRALITE, 5.5F, -3.0F, new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_SPADE = ITEMS.register("astralite_spade", () -> new ShovelItem(BtGItemTier.ASTRALITE, 2.0F, -3.0F, new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_PICK = ITEMS.register("astralite_pick", () -> new PickaxeItem(BtGItemTier.ASTRALITE, 1, -2.8F, new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_HOE = ITEMS.register("astralite_hoe", () -> new HoeItem(BtGItemTier.ASTRALITE, 0.0F, new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> ASTRALITE_SWORD = ITEMS.register("astralite_sword", () -> new SwordItem(BtGItemTier.ASTRALITE, 4, -2.4F, new Item.Properties().group(Setup.ITEM_GROUP)));
    
    public static final RegistryObject<FossilCleaner> FOSSILCLEANER = BLOCKS.register("fossilcleaner", FossilCleaner::new);
    public static final RegistryObject<Item> FOSSILCLEANER_ITEM = ITEMS.register("fossilcleaner", () -> new BlockItem(FOSSILCLEANER.get(), new Item.Properties().group(Setup.ITEM_GROUP)));
    public static final RegistryObject<TileEntityType<FossilCleanerTile>> FOSSILCLEANER_TILE = TILES.register("fossilcleaner_tile", () -> TileEntityType.Builder.create(FossilCleanerTile::new, FOSSILCLEANER.get()).build(null));
    
    public static final RegistryObject<ContainerType<FossilCleanerContainer>> FOSSILCLEANER_CONTAINER = CONTAINERS.register("fossilcleaner_container", () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        World world = inv.player.getEntityWorld();
        return new FossilCleanerContainer(windowId, world, pos, inv, inv.player);
    }));
    
    public static final RegistryObject<EntityType<TestEntity>> TESTENTITY = ENTITIES.register("testentity", () -> EntityType.Builder.create(TestEntity::new, EntityClassification.CREATURE)
            .size(1.4f, 1.7f)
            .setShouldReceiveVelocityUpdates(true)
            .build("testentity"));
    
}
