
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.whstu.marb.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.whstu.marb.MarbMod;

public class MarbModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarbMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MARB_TAB = REGISTRY.register("marb_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.marb.marb_tab")).icon(() -> new ItemStack(MarbModItems.BN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MarbModItems.BN.get());
				tabData.accept(MarbModItems.MARB_SPAWN_EGG.get());
				tabData.accept(MarbModItems.MARB_ARMOR_HELMET.get());
				tabData.accept(MarbModItems.MARB_ARMOR_CHESTPLATE.get());
				tabData.accept(MarbModItems.MARB_ARMOR_LEGGINGS.get());
				tabData.accept(MarbModItems.MARB_ARMOR_BOOTS.get());
			}).build());
}
