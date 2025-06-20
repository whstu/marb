
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.whstu.marb.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.whstu.marb.item.MarbSwordItem;
import com.whstu.marb.item.MarbSpadeItem;
import com.whstu.marb.item.MarbPickaxeItem;
import com.whstu.marb.item.MarbHoeItem;
import com.whstu.marb.item.MarbAxeItem;
import com.whstu.marb.item.MarbArmorItem;
import com.whstu.marb.item.BnItem;
import com.whstu.marb.MarbMod;

public class MarbModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MarbMod.MODID);
	public static final DeferredItem<Item> BN = register("bn", BnItem::new);
	public static final DeferredItem<Item> MARB_SPAWN_EGG = register("marb_spawn_egg", properties -> new SpawnEggItem(MarbModEntities.MARB.get(), properties));
	public static final DeferredItem<Item> MARB_ARMOR_HELMET = register("marb_armor_helmet", MarbArmorItem.Helmet::new);
	public static final DeferredItem<Item> MARB_ARMOR_CHESTPLATE = register("marb_armor_chestplate", MarbArmorItem.Chestplate::new);
	public static final DeferredItem<Item> MARB_ARMOR_LEGGINGS = register("marb_armor_leggings", MarbArmorItem.Leggings::new);
	public static final DeferredItem<Item> MARB_ARMOR_BOOTS = register("marb_armor_boots", MarbArmorItem.Boots::new);
	public static final DeferredItem<Item> MARB_SWORD = register("marb_sword", MarbSwordItem::new);
	public static final DeferredItem<Item> MARB_PICKAXE = register("marb_pickaxe", MarbPickaxeItem::new);
	public static final DeferredItem<Item> MARB_AXE = register("marb_axe", MarbAxeItem::new);
	public static final DeferredItem<Item> MARB_HOE = register("marb_hoe", MarbHoeItem::new);
	public static final DeferredItem<Item> MARB_SPADE = register("marb_spade", MarbSpadeItem::new);
	public static final DeferredItem<Item> MARB_BLOCK = block(MarbModBlocks.MARB_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
