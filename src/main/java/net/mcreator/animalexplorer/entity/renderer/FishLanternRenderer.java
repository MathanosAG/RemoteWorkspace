package net.mcreator.animalexplorer.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.animalexplorer.entity.FishLanternEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FishLanternRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FishLanternEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfish_latern(), 0.4f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/fish_lantern_light.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("animalexplorer:textures/fish_lantern_light.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelfish_latern extends EntityModel<Entity> {
		private final ModelRenderer lanternfish;
		private final ModelRenderer cabeza;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer palo;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cuerpo;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cola1;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cola2;
		private final ModelRenderer cola3;
		private final ModelRenderer aletad;
		private final ModelRenderer cube_r8;
		private final ModelRenderer aletai;
		private final ModelRenderer cube_r9;
		public Modelfish_latern() {
			textureWidth = 64;
			textureHeight = 64;
			lanternfish = new ModelRenderer(this);
			lanternfish.setRotationPoint(0.0F, 19.0F, -2.0F);
			cabeza = new ModelRenderer(this);
			cabeza.setRotationPoint(0.0F, -0.6944F, 0.8667F);
			lanternfish.addChild(cabeza);
			cabeza.setTextureOffset(4, 62).addBox(-3.5F, -0.3056F, -6.3667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cabeza.setTextureOffset(0, 62).addBox(-1.5F, -0.3056F, -6.3667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cabeza.setTextureOffset(0, 61).addBox(0.5F, -0.3056F, -6.3667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cabeza.setTextureOffset(0, 60).addBox(2.5F, -0.3056F, -6.3667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 8.6944F, -0.8667F);
			cabeza.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 13).addBox(-4.5F, -9.0F, -9.0F, 9.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 8.6944F, -0.8667F);
			cabeza.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-4.0F, -13.0F, -5.5F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			palo = new ModelRenderer(this);
			palo.setRotationPoint(0.0F, -3.7223F, -0.9333F);
			cabeza.addChild(palo);
			palo.setTextureOffset(40, 19).addBox(-1.0F, -3.8333F, -7.9333F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 12.4167F, 0.0667F);
			palo.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.8727F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-0.5F, -10.25F, -17.2F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 12.4167F, 0.0667F);
			palo.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(38, 43).addBox(-0.5F, -19.25F, 5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			cuerpo = new ModelRenderer(this);
			cuerpo.setRotationPoint(0.0F, 8.0F, 0.0F);
			lanternfish.addChild(cuerpo);
			cuerpo.setTextureOffset(27, 10).addBox(-4.0F, -10.5F, -1.0F, 8.0F, 6.0F, 3.0F, 0.25F, false);
			cuerpo.setTextureOffset(26, 25).addBox(-4.0F, -11.5F, 2.0F, 8.0F, 7.0F, 3.0F, 0.25F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			cuerpo.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 32).addBox(0.0F, -5.25F, 10.0F, 0.0F, 8.0F, 5.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			cuerpo.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 25).addBox(-4.0F, -12.45F, -3.85F, 8.0F, 7.0F, 5.0F, 0.0F, false);
			cola1 = new ModelRenderer(this);
			cola1.setRotationPoint(0.0F, 0.0F, 4.25F);
			lanternfish.addChild(cola1);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 8.0F, -4.25F);
			cola1.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(30, 0).addBox(-3.5F, -11.0F, 3.0F, 7.0F, 6.0F, 3.0F, 0.25F, false);
			cola2 = new ModelRenderer(this);
			cola2.setRotationPoint(0.0F, 0.125F, 2.0F);
			cola1.addChild(cola2);
			cola2.setTextureOffset(23, 35).addBox(-2.5F, -2.875F, -1.25F, 5.0F, 6.0F, 3.0F, 0.0F, false);
			cola3 = new ModelRenderer(this);
			cola3.setRotationPoint(0.0F, 0.25F, 1.5F);
			cola2.addChild(cola3);
			cola3.setTextureOffset(39, 35).addBox(-1.5F, -2.375F, -0.75F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			cola3.setTextureOffset(10, 37).addBox(-1.0F, -3.625F, 1.25F, 2.0F, 7.0F, 4.0F, 0.0F, false);
			aletad = new ModelRenderer(this);
			aletad.setRotationPoint(-3.5F, -0.75F, -0.5F);
			lanternfish.addChild(aletad);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(3.5F, 8.75F, 0.5F);
			aletad.addChild(cube_r8);
			setRotationAngle(cube_r8, 1.3963F, -0.6109F, 0.0F);
			cube_r8.setTextureOffset(22, 39).addBox(-3.5F, -0.25F, 7.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
			aletai = new ModelRenderer(this);
			aletai.setRotationPoint(3.5F, -0.75F, -0.5F);
			lanternfish.addChild(aletai);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-3.5F, 8.75F, 0.5F);
			aletai.addChild(cube_r9);
			setRotationAngle(cube_r9, 1.3963F, 0.6109F, 0.0F);
			cube_r9.setTextureOffset(30, 14).addBox(3.5F, -0.25F, 7.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			lanternfish.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.palo.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.palo.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.aletai.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.aletad.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
