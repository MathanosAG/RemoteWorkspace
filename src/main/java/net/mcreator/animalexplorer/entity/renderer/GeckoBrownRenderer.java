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

import net.mcreator.animalexplorer.entity.GeckoBrownEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GeckoBrownRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GeckoBrownEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgecko(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/gecko_brown.png");
					}
				};
			});
		}
	}

	public static class Modelgecko extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer leg0;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer tail;
		public Modelgecko() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(-2.0F, 14.0F, 0.0F);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-1.5F, -7.5F, -7.0F, 7.0F, 9.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 19.0F, -8.0F);
			head.setTextureOffset(15, 17).addBox(-2.0F, -2.5F, -4.5F, 5.0F, 4.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(17, 4).addBox(-2.0F, -3.0F, -4.5F, 1.0F, 0.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 2).addBox(-2.5F, -1.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(2.5F, -1.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 1).addBox(2.0F, -3.0F, -4.5F, 1.0F, 0.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-2.0F, -0.5F, -5.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(-2.0F, -0.5F, -5.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(-1.0F, 20.0F, 0.0F);
			setRotationAngle(leg0, 0.0F, 0.0F, 0.0873F);
			leg0.setTextureOffset(16, 26).addBox(-2.5F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(3.0F, 20.0F, 1.0F);
			setRotationAngle(leg1, 0.0F, 0.0F, -0.0873F);
			leg1.setTextureOffset(8, 25).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-3.0F, 20.0F, -7.0F);
			setRotationAngle(leg2, 0.0F, 0.0F, 0.0873F);
			leg2.setTextureOffset(0, 25).addBox(-0.5F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(3.0F, 20.0F, -7.0F);
			setRotationAngle(leg3, 0.0F, 0.0F, -0.0873F);
			leg3.setTextureOffset(24, 3).addBox(-1.5F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, -1.0F);
			setRotationAngle(tail, 1.5708F, 0.0F, 0.0F);
			tail.setTextureOffset(23, 9).addBox(-1.0F, 13.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			tail.setTextureOffset(0, 13).addBox(-3.0F, 2.0F, 3.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(20, 11).addBox(-2.0F, 7.0F, 4.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(24, 26).addBox(-1.0F, 11.0F, 4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leg0.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
