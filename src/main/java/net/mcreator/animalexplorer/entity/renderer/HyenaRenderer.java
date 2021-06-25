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

import net.mcreator.animalexplorer.entity.HyenaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HyenaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HyenaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhyena(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/animalexplorerlogo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelhyena extends EntityModel<Entity> {
		private final ModelRenderer cabeza;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer cuerpo;
		private final ModelRenderer cuerpo_r1;
		private final ModelRenderer cuerpo_r2;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cola;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer piernaderecha;
		private final ModelRenderer piernaizquierda;
		private final ModelRenderer brazoderecha;
		private final ModelRenderer brazoizquierdo;
		public Modelhyena() {
			textureWidth = 64;
			textureHeight = 64;
			cabeza = new ModelRenderer(this);
			cabeza.setRotationPoint(0.0F, 11.25F, -8.75F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 12.75F, 8.75F);
			cabeza.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
			cube_r1.setTextureOffset(32, 0).addBox(-1.0F, -20.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 12.75F, 8.75F);
			cabeza.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
			cube_r2.setTextureOffset(0, 21).addBox(-1.0F, -20.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 12.75F, 8.75F);
			cabeza.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(32, 0).addBox(-3.5F, -18.0F, -13.0F, 7.0F, 7.0F, 6.0F, 0.0F, false);
			cube_r3.setTextureOffset(32, 6).addBox(-4.5F, -14.0F, -11.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(0.0F, -12.5F, -14.0F);
			cube_r3.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, 0.0436F, 0.0F, 0.0F);
			cube_r3_r1.setTextureOffset(27, 21).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			cuerpo = new ModelRenderer(this);
			cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
			cuerpo_r1 = new ModelRenderer(this);
			cuerpo_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			cuerpo.addChild(cuerpo_r1);
			setRotationAngle(cuerpo_r1, -0.3491F, 0.0F, 0.0F);
			cuerpo_r1.setTextureOffset(27, 28).addBox(-4.0F, -12.7F, -13.2F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			cuerpo_r2 = new ModelRenderer(this);
			cuerpo_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			cuerpo.addChild(cuerpo_r2);
			setRotationAngle(cuerpo_r2, -0.0873F, 0.0F, 0.0F);
			cuerpo_r2.setTextureOffset(0, 21).addBox(-4.5F, -15.1F, -9.0F, 9.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			cuerpo.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(1, 0).addBox(-4.0F, -14.9F, -7.0F, 8.0F, 7.0F, 14.0F, 0.0F, false);
			cola = new ModelRenderer(this);
			cola.setRotationPoint(0.0F, 11.0F, 7.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 13.0F, -7.0F);
			cola.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(36, 41).addBox(-0.5F, -10.1F, 11.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			cube_r5.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -0.3054F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(27, 21).addBox(-0.5F, -5.1F, 10.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			piernaderecha = new ModelRenderer(this);
			piernaderecha.setRotationPoint(-3.0F, 15.0F, 5.0F);
			piernaderecha.setTextureOffset(24, 41).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			piernaizquierda = new ModelRenderer(this);
			piernaizquierda.setRotationPoint(3.0F, 16.0F, 5.0F);
			piernaizquierda.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			brazoderecha = new ModelRenderer(this);
			brazoderecha.setRotationPoint(-4.2F, 14.0F, -7.0F);
			brazoderecha.setTextureOffset(12, 37).addBox(0.0F, -4.0F, -1.0F, 3.0F, 14.0F, 3.0F, 0.0F, false);
			brazoizquierdo = new ModelRenderer(this);
			brazoizquierdo.setRotationPoint(3.2F, 14.0F, -6.0F);
			brazoizquierdo.setTextureOffset(0, 37).addBox(-2.0F, -4.0F, -2.0F, 3.0F, 14.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			cabeza.render(matrixStack, buffer, packedLight, packedOverlay);
			cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
			cola.render(matrixStack, buffer, packedLight, packedOverlay);
			piernaderecha.render(matrixStack, buffer, packedLight, packedOverlay);
			piernaizquierda.render(matrixStack, buffer, packedLight, packedOverlay);
			brazoderecha.render(matrixStack, buffer, packedLight, packedOverlay);
			brazoizquierdo.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.brazoizquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.brazoderecha.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.cola.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.piernaderecha.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.piernaizquierda.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
