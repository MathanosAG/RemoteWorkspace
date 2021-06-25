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

import net.mcreator.animalexplorer.entity.BullEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BullRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BullEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnewbull(), 1.2000000000000002f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/newbull.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelnewbull extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer r5;
		private final ModelRenderer r6;
		private final ModelRenderer r4;
		private final ModelRenderer r3;
		private final ModelRenderer head;
		private final ModelRenderer horns;
		private final ModelRenderer hornsleft;
		private final ModelRenderer hornsleft_r1;
		private final ModelRenderer hornsright;
		private final ModelRenderer hornsright_r1;
		private final ModelRenderer leg0;
		private final ModelRenderer r11;
		private final ModelRenderer r2;
		private final ModelRenderer leg1;
		private final ModelRenderer r7;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		public Modelnewbull() {
			textureWidth = 128;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 2.0F);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			r5 = new ModelRenderer(this);
			r5.setRotationPoint(0.0F, 19.0F, -3.0F);
			body.addChild(r5);
			setRotationAngle(r5, -0.0436F, 0.0F, 0.0F);
			r5.setTextureOffset(20, 13).addBox(-6.0F, -28.5F, -5.5F, 12.0F, 9.0F, 11.0F, 0.0F, false);
			r6 = new ModelRenderer(this);
			r6.setRotationPoint(0.0F, 19.0F, -1.0F);
			body.addChild(r6);
			setRotationAngle(r6, 0.0436F, 0.0F, 0.0F);
			r6.setTextureOffset(20, 14).addBox(-6.0F, -20.3F, -5.25F, 12.0F, 9.0F, 10.0F, 0.0F, false);
			r4 = new ModelRenderer(this);
			r4.setRotationPoint(0.0F, 19.0F, -3.0F);
			body.addChild(r4);
			setRotationAngle(r4, -0.0436F, 0.0F, 0.0F);
			r4.setTextureOffset(70, 25).addBox(-5.0F, -31.0F, -3.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
			r3 = new ModelRenderer(this);
			r3.setRotationPoint(0.0F, -6.0F, -35.0F);
			body.addChild(r3);
			setRotationAngle(r3, -1.5708F, 0.0F, 0.0F);
			r3.setTextureOffset(65, 43).addBox(-5.0F, -31.0F, -6.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, -8.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -6.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
			horns = new ModelRenderer(this);
			horns.setRotationPoint(0.0F, 18.0F, 10.0F);
			head.addChild(horns);
			setRotationAngle(horns, 0.2618F, 0.0F, 0.0F);
			hornsleft = new ModelRenderer(this);
			hornsleft.setRotationPoint(-6.0F, -2.9981F, 3.0872F);
			horns.addChild(hornsleft);
			setRotationAngle(hornsleft, 0.0F, 0.0F, 0.2618F);
			hornsleft.setTextureOffset(42, 1).addBox(3.0F, -23.801F, -11.0436F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			hornsleft_r1 = new ModelRenderer(this);
			hornsleft_r1.setRotationPoint(7.0F, 3.9981F, -1.0872F);
			hornsleft.addChild(hornsleft_r1);
			setRotationAngle(hornsleft_r1, -0.0436F, 0.0F, 0.0F);
			hornsleft_r1.setTextureOffset(44, 1).addBox(-3.5F, -29.0F, -10.4564F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			hornsright = new ModelRenderer(this);
			hornsright.setRotationPoint(7.0F, -2.9981F, 4.0872F);
			horns.addChild(hornsright);
			setRotationAngle(hornsright, 0.0F, 0.0F, -0.2618F);
			hornsright.setTextureOffset(42, 1).addBox(-6.0F, -24.2019F, -12.0436F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			hornsright_r1 = new ModelRenderer(this);
			hornsright_r1.setRotationPoint(-6.0F, 3.9981F, -2.0872F);
			hornsright.addChild(hornsright_r1);
			setRotationAngle(hornsright_r1, -0.0436F, 0.0F, 0.0F);
			hornsright_r1.setTextureOffset(44, 1).addBox(0.5F, -29.2F, -10.4564F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(-4.0F, 10.0F, 7.0F);
			r11 = new ModelRenderer(this);
			r11.setRotationPoint(0.0F, 5.0F, 0.0F);
			leg0.addChild(r11);
			r11.setTextureOffset(0, 48).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			r2 = new ModelRenderer(this);
			r2.setRotationPoint(0.0F, 6.0F, 0.0F);
			leg0.addChild(r2);
			setRotationAngle(r2, -0.0436F, 0.0F, 0.0436F);
			r2.setTextureOffset(16, 42).addBox(-2.5F, -9.4F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(4.0F, 10.0F, 7.0F);
			leg1.setTextureOffset(0, 48).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			r7 = new ModelRenderer(this);
			r7.setRotationPoint(0.0F, 6.0F, 0.0F);
			leg1.addChild(r7);
			setRotationAngle(r7, -0.0436F, 0.0F, -0.0436F);
			r7.setTextureOffset(16, 42).addBox(-2.5F, -9.5F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-4.0F, 5.0F, -6.0F);
			leg2.setTextureOffset(0, 48).addBox(-2.0F, 7.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leg2.setTextureOffset(16, 42).addBox(-2.5F, -4.0F, -1.5F, 5.0F, 15.0F, 5.0F, 0.0F, true);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(4.0F, 5.0F, -6.0F);
			leg3.setTextureOffset(1, 51).addBox(-2.0F, 10.0F, -1.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);
			leg3.setTextureOffset(16, 42).addBox(-2.5F, -4.0F, -1.5F, 5.0F, 15.0F, 5.0F, 0.0F, true);
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
			this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
