package net.mcreator.animalexplorer.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.animalexplorer.entity.SharkEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SharkRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SharkEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelShark(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/shark.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelShark extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer tailfin;
		private final ModelRenderer tailfin_r1;
		private final ModelRenderer tailfin_r2;
		private final ModelRenderer tailfin_r3;
		private final ModelRenderer tailfin_r4;
		private final ModelRenderer leftFin;
		private final ModelRenderer leftFin2;
		private final ModelRenderer leftFin_r1;
		private final ModelRenderer rightFin;
		private final ModelRenderer rightFin2;
		private final ModelRenderer leftFin_r2;
		private final ModelRenderer HEAD;
		private final ModelRenderer body_r4;
		public ModelShark() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, 17.0F, -8.0F);
			body.setTextureOffset(0, 40).addBox(-4.5F, -2.0F, 7.0F, 10.0F, 8.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(0, 18).addBox(-5.0F, -3.0F, -1.0F, 11.0F, 9.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.5F, -4.0F, -9.0F, 12.0F, 10.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 55).addBox(-4.5F, -2.0F, -10.2F, 10.0F, 7.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(26, 61).addBox(-2.5F, -1.0F, -11.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.5F, 2.0F, 1.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.3054F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 28).addBox(0.0F, -8.0F, -2.9992F, 0.0F, 5.0F, 7.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(0.5F, 2.0F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.3054F, 0.0F, 0.0F);
			body_r2.setTextureOffset(14, 28).addBox(0.0F, -8.0F, -2.9992F, 0.0F, 5.0F, 7.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.5F, 3.0F, -2.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.3491F, 0.0F, 0.0F);
			body_r3.setTextureOffset(38, 14).addBox(0.0F, -9.0F, -2.9992F, 0.0F, 6.0F, 9.0F, 0.0F, false);
			tailfin = new ModelRenderer(this);
			tailfin.setRotationPoint(1.5F, 7.0F, 11.0F);
			body.addChild(tailfin);
			tailfin.setTextureOffset(34, 47).addBox(-5.0F, -8.0F, 3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);
			tailfin.setTextureOffset(58, 23).addBox(-4.5F, -7.0F, 10.0F, 7.0F, 6.0F, 3.0F, 0.0F, false);
			tailfin_r1 = new ModelRenderer(this);
			tailfin_r1.setRotationPoint(-5.0F, -2.0F, 10.0F);
			tailfin.addChild(tailfin_r1);
			setRotationAngle(tailfin_r1, 0.0F, 0.8727F, -0.4363F);
			tailfin_r1.setTextureOffset(0, 65).addBox(-7.5F, -2.0F, 3.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			tailfin_r2 = new ModelRenderer(this);
			tailfin_r2.setRotationPoint(9.0F, 0.0F, 17.0F);
			tailfin.addChild(tailfin_r2);
			setRotationAngle(tailfin_r2, 0.0F, -0.8727F, 0.4363F);
			tailfin_r2.setTextureOffset(66, 0).addBox(-7.5F, -2.0F, 3.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			tailfin_r3 = new ModelRenderer(this);
			tailfin_r3.setRotationPoint(8.0F, -2.0F, 14.0F);
			tailfin.addChild(tailfin_r3);
			setRotationAngle(tailfin_r3, 0.0F, -0.8727F, 0.0F);
			tailfin_r3.setTextureOffset(58, 61).addBox(-7.5F, -3.0F, 3.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			tailfin_r4 = new ModelRenderer(this);
			tailfin_r4.setRotationPoint(-3.0F, -2.0F, 7.0F);
			tailfin.addChild(tailfin_r4);
			setRotationAngle(tailfin_r4, 0.0F, 0.8727F, 0.0F);
			tailfin_r4.setTextureOffset(64, 54).addBox(-7.5F, -3.0F, 3.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			leftFin = new ModelRenderer(this);
			leftFin.setRotationPoint(-4.0F, 7.0F, 5.0F);
			body.addChild(leftFin);
			setRotationAngle(leftFin, 0.0F, -0.5236F, 0.0F);
			leftFin.setTextureOffset(32, 3).addBox(12.2011F, -3.0F, 1.9453F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			leftFin2 = new ModelRenderer(this);
			leftFin2.setRotationPoint(3.0F, 0.0F, -19.0F);
			leftFin.addChild(leftFin2);
			setRotationAngle(leftFin2, 0.0F, -0.6109F, 0.0F);
			leftFin2.setTextureOffset(60, 10).addBox(0.9805F, -5.0F, 0.6955F, 7.0F, 4.0F, 3.0F, 0.0F, false);
			leftFin_r1 = new ModelRenderer(this);
			leftFin_r1.setRotationPoint(-0.5F, 0.0F, -1.0F);
			leftFin2.addChild(leftFin_r1);
			setRotationAngle(leftFin_r1, 0.0F, -0.5236F, 0.2618F);
			leftFin_r1.setTextureOffset(42, 61).addBox(5.9782F, -5.7889F, -0.8089F, 6.0F, 4.0F, 2.0F, 0.0F, false);
			rightFin = new ModelRenderer(this);
			rightFin.setRotationPoint(-1.0F, 7.0F, 9.0F);
			body.addChild(rightFin);
			setRotationAngle(rightFin, 0.0F, 0.48F, 0.0F);
			rightFin.setTextureOffset(32, 0).addBox(-9.0935F, -3.0F, 1.1573F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			rightFin2 = new ModelRenderer(this);
			rightFin2.setRotationPoint(9.3227F, 0.0F, -22.5382F);
			rightFin.addChild(rightFin2);
			setRotationAngle(rightFin2, 0.0F, 0.6109F, 0.0F);
			rightFin2.setTextureOffset(57, 47).addBox(-12.9805F, -5.0F, 0.6955F, 7.0F, 4.0F, 3.0F, 0.0F, false);
			leftFin_r2 = new ModelRenderer(this);
			leftFin_r2.setRotationPoint(4.5F, 0.0F, 0.0F);
			rightFin2.addChild(leftFin_r2);
			setRotationAngle(leftFin_r2, 0.0F, 0.5236F, -0.2618F);
			leftFin_r2.setTextureOffset(58, 32).addBox(-19.2989F, -8.8637F, -6.654F, 6.0F, 4.0F, 2.0F, 0.0F, false);
			HEAD = new ModelRenderer(this);
			HEAD.setRotationPoint(0.0F, 17.0F, -18.0F);
			HEAD.setTextureOffset(30, 30).addBox(-5.0F, -3.0F, -9.0F, 10.0F, 9.0F, 8.0F, 0.0F, false);
			HEAD.setTextureOffset(40, 0).addBox(-5.0F, 2.0F, -15.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(5.0F, 3.0F, -12.0F);
			HEAD.addChild(body_r4);
			setRotationAngle(body_r4, 0.2618F, 0.0F, 0.0F);
			body_r4.setTextureOffset(32, 10).addBox(-10.0F, -5.0F, -3.0F, 10.0F, 5.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.HEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.HEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
