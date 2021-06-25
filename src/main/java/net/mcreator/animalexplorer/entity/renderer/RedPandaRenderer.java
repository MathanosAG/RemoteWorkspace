package net.mcreator.animalexplorer.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.animalexplorer.entity.RedPandaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RedPandaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RedPandaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelred_panda(), 1.2000000000000002f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/red_panda.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelred_panda extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer belly;
		private final ModelRenderer Cuello;
		private final ModelRenderer head;
		private final ModelRenderer tail1;
		private final ModelRenderer tail2;
		private final ModelRenderer backLegL;
		private final ModelRenderer backLegR;
		private final ModelRenderer frontLegL;
		private final ModelRenderer frontLegR;
		public Modelred_panda() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(1.0F, 17.0F, 1.0F);
			belly = new ModelRenderer(this);
			belly.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(belly);
			setRotationAngle(belly, 1.5708F, 0.0F, 0.0F);
			belly.setTextureOffset(0, 0).addBox(-5.5F, -9.0F, -2.0F, 9.0F, 16.0F, 8.0F, 0.0F, false);
			Cuello = new ModelRenderer(this);
			Cuello.setRotationPoint(-1.0F, -9.0F, 2.0F);
			belly.addChild(Cuello);
			setRotationAngle(Cuello, -1.5708F, 0.0F, 0.0F);
			Cuello.setTextureOffset(3, 1).addBox(-2.5F, -3.0F, -3.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, -3.0F, -9.0F);
			body.addChild(head);
			head.setTextureOffset(0, 24).addBox(-5.5F, -5.0F, -7.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(50, 11).addBox(-4.0F, -1.0156F, -8.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(50, 24).addBox(-5.5F, -6.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(50, 18).addBox(-1.5F, -6.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(28, 28).addBox(-6.5F, -2.8F, -4.0F, 9.0F, 5.0F, 4.0F, 0.0F, false);
			tail1 = new ModelRenderer(this);
			tail1.setRotationPoint(0.0F, -1.0F, 5.0F);
			body.addChild(tail1);
			setRotationAngle(tail1, 0.6545F, 0.0F, 0.0F);
			tail1.setTextureOffset(40, 40).addBox(-3.5F, -3.3284F, -0.1213F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, 8.0F, 2.0F);
			tail1.addChild(tail2);
			setRotationAngle(tail2, 0.7854F, 0.0F, 0.0F);
			tail2.setTextureOffset(34, 0).addBox(-4.0F, -2.5F, -1.0F, 5.0F, 10.0F, 5.0F, 0.0F, false);
			backLegL = new ModelRenderer(this);
			backLegL.setRotationPoint(1.1F, 1.0F, 3.0F);
			body.addChild(backLegL);
			backLegL.setTextureOffset(12, 50).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			backLegR = new ModelRenderer(this);
			backLegR.setRotationPoint(-1.1F, 1.0F, 4.0F);
			body.addChild(backLegR);
			backLegR.setTextureOffset(34, 15).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			frontLegL = new ModelRenderer(this);
			frontLegL.setRotationPoint(1.2F, -3.0F, -5.0F);
			body.addChild(frontLegL);
			frontLegL.setTextureOffset(0, 38).addBox(-1.0F, -2.2F, -3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			frontLegR = new ModelRenderer(this);
			frontLegR.setRotationPoint(-1.2F, -3.0F, -5.0F);
			body.addChild(frontLegR);
			frontLegR.setTextureOffset(24, 37).addBox(-5.0F, -2.2F, -3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.backLegL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.frontLegR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.backLegR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.frontLegL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
