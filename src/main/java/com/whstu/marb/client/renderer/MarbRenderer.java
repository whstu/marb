
package com.whstu.marb.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.PiglinRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import com.whstu.marb.entity.MarbEntity;

public class MarbRenderer extends MobRenderer<MarbEntity, PiglinRenderState, PiglinModel> {
	private MarbEntity entity = null;

	public MarbRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public PiglinRenderState createRenderState() {
		return new PiglinRenderState();
	}

	@Override
	public void extractRenderState(MarbEntity entity, PiglinRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(PiglinRenderState state) {
		return ResourceLocation.parse("marb:textures/entities/marb.png");
	}
}
