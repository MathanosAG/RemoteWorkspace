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

import net.mcreator.animalexplorer.entity.PlatypusEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PlatypusRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PlatypusEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelplatypus(), 0.4f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/platypus.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelplatypus extends EntityModel<Entity> {
		private final ModelRenderer platypus;
		private final ModelRenderer cabeza;
		private final ModelRenderer cuerpo;
		private final ModelRenderer cola;
		private final ModelRenderer cube_r1;
		private final ModelRenderer brazoderecho;
		private final ModelRenderer cube_r2;
		private final ModelRenderer brazoizquierdo;
		private final ModelRenderer cube_r3;
		private final ModelRenderer piernaderecha;
		private final ModelRenderer cube_r4;
		private final ModelRenderer piernaizquierda;
		private final ModelRenderer cube_r5;
		public Modelplatypus() {
			textureWidth = 64;
			textureHeight = 64;
			platypus = new ModelRenderer(this);
			platypus.setRotationPoint(0.0F, 24.0F, 0.0F);
			cabeza = new ModelRenderer(this);
			cabeza.setRotationPoint(0.0F, -2.625F, -4.0F);
			platypus.addChild(cabeza);
			cabeza.setTextureOffset(0, 14).addBox(-2.5F, -2.125F, -4.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
			cabeza.setTextureOffset(18, 14).addBox(-2.0F, -0.125F, -7.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cuerpo = new ModelRenderer(this);
			cuerpo.setRotationPoint(0.0F, -3.0F, 0.0F);
			platypus.addChild(cuerpo);
			cuerpo.setTextureOffset(0, 0).addBox(-3.0F, -1.75F, -5.0F, 6.0F, 4.0F, 10.0F, 0.1F, false);
			cola = new ModelRenderer(this);
			cola.setRotationPoint(0.0F, -3.0F, 4.0F);
			platypus.addChild(cola);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 3.0F, -5.0F);
			cola.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(32, 0).addBox(-2.5F, -2.75F, 4.0F, 5.0F, 2.0F, 10.0F, 0.1F, false);
			brazoderecho = new ModelRenderer(this);
			brazoderecho.setRotationPoint(-1.625F, -2.375F, -4.5F);
			platypus.addChild(brazoderecho);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.625F, 2.375F, 4.5F);
			brazoderecho.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0436F, 0.0436F, -0.0873F);
			cube_r2.setTextureOffset(0, 22).addBox(-6.0F, -0.75F, -6.5F, 4.0F, 0.0F, 4.0F, 0.1F, false);
			cube_r2.setTextureOffset(10, 26).addBox(-4.25F, -1.75F, -6.0F, 2.0F, 1.0F, 3.0F, 0.1F, false);
			brazoizquierdo = new ModelRenderer(this);
			brazoizquierdo.setRotationPoint(1.5F, -2.375F, -4.5F);
			platypus.addChild(brazoizquierdo);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.5F, 2.375F, 4.5F);
			brazoizquierdo.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.0436F, -0.0436F, 0.0873F);
			cube_r3.setTextureOffset(16, 22).addBox(2.0F, -0.75F, -6.5F, 4.0F, 0.0F, 4.0F, 0.1F, false);
			cube_r3.setTextureOffset(30, 26).addBox(2.0F, -1.75F, -6.0F, 2.0F, 1.0F, 3.0F, 0.1F, false);
			piernaderecha = new ModelRenderer(this);
			piernaderecha.setRotationPoint(-1.5F, -2.375F, 3.5F);
			platypus.addChild(piernaderecha);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.5F, 2.375F, -3.5F);
			piernaderecha.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0436F, -0.0436F, -0.0873F);
			cube_r4.setTextureOffset(0, 26).addBox(-4.0F, -1.75F, 2.0F, 2.0F, 1.0F, 3.0F, 0.1F, false);
			cube_r4.setTextureOffset(36, 14).addBox(-6.0F, -0.75F, 1.5F, 4.0F, 0.0F, 4.0F, 0.1F, false);
			piernaizquierda = new ModelRenderer(this);
			piernaizquierda.setRotationPoint(1.5F, -2.375F, 3.5F);
			platypus.addChild(piernaizquierda);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-2.5F, 2.375F, -3.5F);
			piernaizquierda.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.0436F, 0.0436F, 0.0873F);
			cube_r5.setTextureOffset(20, 26).addBox(2.0F, -1.75F, 2.0F, 2.0F, 1.0F, 3.0F, 0.1F, false);
			cube_r5.setTextureOffset(32, 22).addBox(2.0F, -0.75F, 1.5F, 4.0F, 0.0F, 4.0F, 0.1F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			platypus.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.brazoizquierdo.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.cola.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cola.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.piernaderecha.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.brazoderecho.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.piernaizquierda.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
