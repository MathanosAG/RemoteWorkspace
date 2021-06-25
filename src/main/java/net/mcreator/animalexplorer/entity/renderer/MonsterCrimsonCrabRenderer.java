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

import net.mcreator.animalexplorer.entity.MonsterCrimsonCrabEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MonsterCrimsonCrabRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MonsterCrimsonCrabEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrimson_crab_monster(), 0.7999999999999999f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/crimson_crab_monster.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcrimson_crab_monster extends EntityModel<Entity> {
		private final ModelRenderer HEAD;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer fungus;
		private final ModelRenderer cube_r4;
		private final ModelRenderer armright;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer armleft;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer legright;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer legright2;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer legright3;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer legright4;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer legleft;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer legleft2;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r26;
		private final ModelRenderer legleft3;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		private final ModelRenderer legletf4;
		private final ModelRenderer cube_r29;
		private final ModelRenderer cube_r30;
		public Modelcrimson_crab_monster() {
			textureWidth = 64;
			textureHeight = 64;
			HEAD = new ModelRenderer(this);
			HEAD.setRotationPoint(-4.0F, 15.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(4.0F, -5.0F, -10.0F);
			HEAD.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
			cube_r1.setTextureOffset(25, 16).addBox(-6.0F, -0.5F, 5.0F, 6.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(5.0F, 0.0F, -5.0F);
			HEAD.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0436F);
			cube_r2.setTextureOffset(0, 16).addBox(-7.5F, -5.0F, -0.5F, 7.0F, 5.0F, 11.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(5.0F, 3.0F, -6.0F);
			HEAD.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
			cube_r3.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, 0.0F, 8.0F, 4.0F, 12.0F, 0.0F, false);
			fungus = new ModelRenderer(this);
			fungus.setRotationPoint(4.0F, 9.0F, 0.0F);
			HEAD.addChild(fungus);
			fungus.setTextureOffset(28, 9).addBox(-7.0F, -18.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			fungus.setTextureOffset(25, 23).addBox(-7.0F, -18.0F, 4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			fungus.setTextureOffset(10, 40).addBox(-8.0F, -18.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			fungus.setTextureOffset(38, 38).addBox(-7.5F, -20.5F, -0.5F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			fungus.setTextureOffset(18, 44).addBox(-4.0F, -18.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			fungus.setTextureOffset(0, 32).addBox(-8.0F, -20.0F, -1.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-4.0F, -14.0F, 1.0F);
			fungus.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.1745F, -0.0436F, -0.2618F);
			cube_r4.setTextureOffset(28, 0).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			armright = new ModelRenderer(this);
			armright.setRotationPoint(-2.0F, 16.0F, -6.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(9.0F, 4.0F, -11.0F);
			armright.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.4363F, 0.1309F);
			cube_r5.setTextureOffset(31, 31).addBox(-8.0F, -2.0F, 0.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(9.0F, 0.0F, -11.0F);
			armright.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.4363F, -0.4363F);
			cube_r6.setTextureOffset(28, 0).addBox(-8.0F, -3.0F, -0.5F, 8.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(3.0F, 3.0F, -7.0F);
			armright.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.5236F, 0.0F);
			cube_r7.setTextureOffset(0, 40).addBox(-4.5F, -3.0F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(2.0F, -2.0F, -16.0F);
			armright.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.1745F, -0.1745F, 0.0F);
			cube_r8.setTextureOffset(0, 6).addBox(-0.5F, 4.5F, 11.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
			armright.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
			cube_r9.setTextureOffset(0, 23).addBox(-2.2F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			armleft = new ModelRenderer(this);
			armleft.setRotationPoint(-2.0F, 17.0F, 6.0F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(4.0F, 1.0F, 5.0F);
			armleft.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.0873F, -0.6109F, 0.0F);
			cube_r10.setTextureOffset(16, 32).addBox(-4.5F, -1.9F, -0.2F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(8.0F, 3.0F, 6.0F);
			armleft.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, -0.3491F, 0.2618F);
			cube_r11.setTextureOffset(40, 9).addBox(-5.0F, -2.0F, 0.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(9.0F, -1.0F, 5.0F);
			armleft.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, -0.3491F, -0.3491F);
			cube_r12.setTextureOffset(18, 38).addBox(-6.0F, -2.0F, 0.5F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(2.0F, 1.0F, 5.0F);
			armleft.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.1745F, 0.1745F, 0.0F);
			cube_r13.setTextureOffset(0, 0).addBox(-2.5F, -1.5F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 1.0F, 0.0F);
			armleft.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 0.1745F);
			cube_r14.setTextureOffset(36, 27).addBox(-2.2F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			legright = new ModelRenderer(this);
			legright.setRotationPoint(0.0F, 17.0F, -5.0F);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(2.0F, 7.0F, -2.0F);
			legright.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(24, 51).addBox(-1.0F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(2.0F, 3.0F, -2.0F);
			legright.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.4363F, 0.0F, -0.4363F);
			cube_r16.setTextureOffset(47, 20).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			legright2 = new ModelRenderer(this);
			legright2.setRotationPoint(-2.0F, 17.0F, -5.0F);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(1.0F, 7.0F, -2.0F);
			legright2.addChild(cube_r17);
			setRotationAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(0, 32).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(1.0F, 3.0F, -2.0F);
			legright2.addChild(cube_r18);
			setRotationAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(0, 16).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			legright3 = new ModelRenderer(this);
			legright3.setRotationPoint(-5.0F, 17.0F, -5.0F);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(1.0F, 7.0F, -2.0F);
			legright3.addChild(cube_r19);
			setRotationAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(38, 38).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(1.0F, 3.0F, -2.0F);
			legright3.addChild(cube_r20);
			setRotationAngle(cube_r20, -0.4363F, 0.0F, 0.0F);
			cube_r20.setTextureOffset(25, 16).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			legright4 = new ModelRenderer(this);
			legright4.setRotationPoint(-6.0F, 16.0F, -5.0F);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-1.0F, 8.0F, -2.0F);
			legright4.addChild(cube_r21);
			setRotationAngle(cube_r21, -0.0873F, 0.0F, 0.0436F);
			cube_r21.setTextureOffset(16, 51).addBox(-1.5F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(-1.0F, 4.0F, -2.0F);
			legright4.addChild(cube_r22);
			setRotationAngle(cube_r22, -0.4363F, 0.0F, 0.4363F);
			cube_r22.setTextureOffset(8, 47).addBox(-1.5F, -4.5F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			legleft = new ModelRenderer(this);
			legleft.setRotationPoint(1.0F, 17.0F, 5.0F);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(1.0F, 7.0F, 2.0F);
			legleft.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
			cube_r23.setTextureOffset(0, 32).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(1.0F, 3.0F, 1.0F);
			legleft.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.4363F, 0.0F, -0.4363F);
			cube_r24.setTextureOffset(25, 16).addBox(-1.5F, -3.5F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			legleft2 = new ModelRenderer(this);
			legleft2.setRotationPoint(-1.0F, 17.0F, 5.0F);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(0.0F, 7.0F, 2.0F);
			legleft2.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
			cube_r25.setTextureOffset(48, 48).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(0.0F, 3.0F, 1.0F);
			legleft2.addChild(cube_r26);
			setRotationAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
			cube_r26.setTextureOffset(32, 44).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			legleft3 = new ModelRenderer(this);
			legleft3.setRotationPoint(-4.0F, 17.0F, 6.0F);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(0.0F, 7.0F, 1.0F);
			legleft3.addChild(cube_r27);
			setRotationAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
			cube_r27.setTextureOffset(26, 44).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(0.0F, 3.0F, 0.0F);
			legleft3.addChild(cube_r28);
			setRotationAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
			cube_r28.setTextureOffset(40, 44).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			legletf4 = new ModelRenderer(this);
			legletf4.setRotationPoint(-7.0F, 17.0F, 5.0F);
			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(0.0F, 3.0F, 1.0F);
			legletf4.addChild(cube_r29);
			setRotationAngle(cube_r29, 0.4363F, 0.0F, 0.4363F);
			cube_r29.setTextureOffset(0, 46).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r30 = new ModelRenderer(this);
			cube_r30.setRotationPoint(0.0F, 7.0F, 2.0F);
			legletf4.addChild(cube_r30);
			setRotationAngle(cube_r30, 0.0873F, 0.0F, 0.0436F);
			cube_r30.setTextureOffset(50, 0).addBox(-1.5F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
			armright.render(matrixStack, buffer, packedLight, packedOverlay);
			armleft.render(matrixStack, buffer, packedLight, packedOverlay);
			legright.render(matrixStack, buffer, packedLight, packedOverlay);
			legright2.render(matrixStack, buffer, packedLight, packedOverlay);
			legright3.render(matrixStack, buffer, packedLight, packedOverlay);
			legright4.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft2.render(matrixStack, buffer, packedLight, packedOverlay);
			legleft3.render(matrixStack, buffer, packedLight, packedOverlay);
			legletf4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legright.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legleft2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.legletf4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legright4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legright3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legright2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
