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

import net.mcreator.animalexplorer.entity.WoodGolemEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WoodGolemRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WoodGolemEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGolemWoods(), 0.7999999999999999f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/golemwoods.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelGolemWoods extends EntityModel<Entity> {
		private final ModelRenderer tronco;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer legleft;
		private final ModelRenderer armright;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer armleft;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer head;
		private final ModelRenderer cube_r16;
		private final ModelRenderer legright;
		public ModelGolemWoods() {
			textureWidth = 128;
			textureHeight = 128;
			tronco = new ModelRenderer(this);
			tronco.setRotationPoint(-1.0F, 5.0F, -3.0F);
			tronco.setTextureOffset(24, 67).addBox(-3.0F, -15.0F, -1.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(8.0F, -1.0F, -1.0F);
			tronco.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 24).addBox(-14.25F, -10.5F, 0.0F, 14.0F, 11.0F, 7.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(8.0F, -3.0F, 5.0F);
			tronco.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2618F, 0.2618F, 0.0F);
			cube_r2.setTextureOffset(24, 80).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.0F, -5.0F, 3.0F);
			tronco.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, -0.1309F, -0.2182F);
			cube_r3.setTextureOffset(62, 81).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 1.0F, 3.0F);
			tronco.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.1309F, -0.2618F, 0.0F);
			cube_r4.setTextureOffset(84, 74).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-1.0F, -7.0F, 3.0F);
			tronco.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.5672F, -0.2182F, -0.0436F);
			cube_r5.setTextureOffset(60, 22).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 9.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.0F, -6.0F, 3.0F);
			tronco.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(76, 35).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(8.0F, -6.0F, 3.0F);
			tronco.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.7418F, 0.0F, 0.2618F);
			cube_r7.setTextureOffset(0, 79).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(4.0F, -1.0F, 4.0F);
			tronco.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(85, 60).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(8.0F, 7.0F, -3.0F);
			tronco.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(36, 36).addBox(-14.0F, -10.75F, 2.8F, 14.0F, 11.0F, 6.0F, 0.0F, false);
			legleft = new ModelRenderer(this);
			legleft.setRotationPoint(4.0F, 12.0F, 0.0F);
			legleft.setTextureOffset(49, 53).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
			armright = new ModelRenderer(this);
			armright.setRotationPoint(-7.0F, -4.0F, 0.0F);
			armright.setTextureOffset(21, 53).addBox(-7.0F, -4.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 17.0F, -7.0F);
			armright.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(41, 17).addBox(-7.0F, -7.0F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 13.0F, -5.0F);
			armright.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(67, 67).addBox(-6.5F, -7.5F, -0.25F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 8.0F, -4.0F);
			armright.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(46, 75).addBox(-6.5F, -7.25F, -0.5F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			armleft = new ModelRenderer(this);
			armleft.setRotationPoint(7.0F, -4.0F, -1.0F);
			armleft.setTextureOffset(48, 0).addBox(-1.0F, -4.0F, -4.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(6.0F, 8.0F, -3.0F);
			armleft.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(73, 47).addBox(-6.5F, -7.25F, -0.5F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(6.0F, 17.0F, -6.0F);
			armleft.addChild(cube_r14);
			setRotationAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(0, 42).addBox(-7.0F, -7.0F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(6.0F, 13.0F, -4.0F);
			armleft.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(70, 8).addBox(-6.5F, -7.5F, -0.25F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.0F, 0.0F);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(6.0F, 1.0F, -7.0F);
			head.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(0, 0).addBox(-12.0F, -12.0F, 0.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			legright = new ModelRenderer(this);
			legright.setRotationPoint(-4.0F, 12.0F, 0.0F);
			legright.setTextureOffset(0, 61).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			tronco.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft.render(matrixStack, buffer, packedLight, packedOverlay);
			armright.render(matrixStack, buffer, packedLight, packedOverlay);
			armleft.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			legright.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legright.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
