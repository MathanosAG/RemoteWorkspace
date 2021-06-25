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

import net.mcreator.animalexplorer.entity.CrimsonCrabEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrimsonCrabRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrimsonCrabEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrimson_crab(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/crimson_crab.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcrimson_crab extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer fungus;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer legright1;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer legleft1;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer legright3;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer legleft3;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer legright2;
		private final ModelRenderer cube_r11;
		private final ModelRenderer legleft2;
		private final ModelRenderer cube_r12;
		private final ModelRenderer armleft;
		private final ModelRenderer cube_r13;
		private final ModelRenderer gripperleft;
		private final ModelRenderer armright;
		private final ModelRenderer cube_r14;
		private final ModelRenderer gripperright;
		public Modelcrimson_crab() {
			textureWidth = 32;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 20.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-2.5F, -2.0F, -2.5F, 4.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 9).addBox(-2.0F, -2.5F, -2.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
			fungus = new ModelRenderer(this);
			fungus.setRotationPoint(-1.0F, -2.0F, 2.0F);
			head.addChild(fungus);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -2.0F, -3.0F);
			fungus.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3054F);
			cube_r1.setTextureOffset(12, 12).addBox(-3.5F, -2.0F, 0.8F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
			fungus.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.2618F, -0.4363F);
			cube_r2.setTextureOffset(0, 9).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			legright1 = new ModelRenderer(this);
			legright1.setRotationPoint(1.0F, 21.0F, -2.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(1.0F, 4.0F, -4.0F);
			legright1.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0873F);
			cube_r3.setTextureOffset(18, 18).addBox(-1.2F, -2.5F, 3.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(3.0F, 1.0F, -3.0F);
			legright1.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3491F, -0.4363F, 0.0F);
			cube_r4.setTextureOffset(12, 21).addBox(-1.8F, -2.5F, 2.8F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			legleft1 = new ModelRenderer(this);
			legleft1.setRotationPoint(1.0F, 21.0F, 3.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(1.0F, 2.0F, 0.0F);
			legleft1.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.3491F, 0.4363F, 0.0F);
			cube_r5.setTextureOffset(8, 22).addBox(-1.5F, -2.5F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 3.0F, 0.0F);
			legleft1.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0873F);
			cube_r6.setTextureOffset(16, 21).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			legright3 = new ModelRenderer(this);
			legright3.setRotationPoint(-2.0F, 21.0F, -2.0F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-1.0F, 1.0F, -4.0F);
			legright3.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3491F, 0.4363F, 0.0F);
			cube_r7.setTextureOffset(0, 21).addBox(-1.2F, -2.5F, 2.8F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 3.0F, -4.0F);
			legright3.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0873F, 0.0F, -0.0873F);
			cube_r8.setTextureOffset(19, 0).addBox(-0.5F, -1.8F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			legleft3 = new ModelRenderer(this);
			legleft3.setRotationPoint(-2.0F, 21.0F, 3.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(1.0F, 2.0F, 1.0F);
			legleft3.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.3491F, -0.4363F, 0.0F);
			cube_r9.setTextureOffset(4, 22).addBox(-1.7F, -2.5F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 3.0F, 0.0F);
			legleft3.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.0873F, 0.0F, -0.0873F);
			cube_r10.setTextureOffset(20, 21).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			legright2 = new ModelRenderer(this);
			legright2.setRotationPoint(0.0F, 21.0F, -2.0F);
			legright2.setTextureOffset(10, 18).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 1.0F, -1.0F);
			legright2.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(14, 18).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			legleft2 = new ModelRenderer(this);
			legleft2.setRotationPoint(0.0F, 21.0F, 3.0F);
			legleft2.setTextureOffset(11, 11).addBox(-1.0F, 1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			legleft2.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(14, 9).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			armleft = new ModelRenderer(this);
			armleft.setRotationPoint(0.0F, 19.0F, 3.0F);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 1.0F, 0.0F);
			armleft.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(0, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			gripperleft = new ModelRenderer(this);
			gripperleft.setRotationPoint(-1.0F, 5.0F, -3.0F);
			armleft.addChild(gripperleft);
			setRotationAngle(gripperleft, 0.0F, 0.2618F, 0.0F);
			gripperleft.setTextureOffset(0, 16).addBox(-1.4F, -5.0F, 5.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			gripperleft.setTextureOffset(5, 18).addBox(-1.4F, -3.5F, 5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			armright = new ModelRenderer(this);
			armright.setRotationPoint(0.0F, 19.0F, -3.0F);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 1.0F, -1.0F);
			armright.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			gripperright = new ModelRenderer(this);
			gripperright.setRotationPoint(1.0F, 2.0F, -4.0F);
			armright.addChild(gripperright);
			setRotationAngle(gripperright, 0.0F, -0.2618F, 0.0F);
			gripperright.setTextureOffset(17, 6).addBox(-1.0F, -0.5F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			gripperright.setTextureOffset(14, 0).addBox(-1.0F, -2.0F, 0.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			legright1.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft1.render(matrixStack, buffer, packedLight, packedOverlay);
			legright3.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft3.render(matrixStack, buffer, packedLight, packedOverlay);
			legright2.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft2.render(matrixStack, buffer, packedLight, packedOverlay);
			armleft.render(matrixStack, buffer, packedLight, packedOverlay);
			armright.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legleft1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.fungus.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.legright3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legright2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legright1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
