
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.whstu.marb.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

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

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
