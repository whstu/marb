
package com.whstu.marb.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.whstu.marb.init.MarbModItems;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MarbHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 0, 114514f, 0, 114514, TagKey.create(Registries.ITEM, ResourceLocation.parse("marb:marb_hoe_repair_items")));

	public MarbHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, 96f, properties.fireResistant());
	}

	@SubscribeEvent
	public static void handleToolDamage(ModifyDefaultComponentsEvent event) {
		event.modify(MarbModItems.MARB_HOE.get(), builder -> builder.remove(DataComponents.MAX_DAMAGE));
	}
}
