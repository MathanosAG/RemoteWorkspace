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

import net.mcreator.animalexplorer.entity.SnakeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnakeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnakeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnake(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("animalexplorer:textures/sneak2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelsnake extends EntityModel<Entity> {
		private final ModelRenderer serpiente;
		private final ModelRenderer head;
		private final ModelRenderer cuerpo;
		private final ModelRenderer cola1;
		private final ModelRenderer cola2;
		private final ModelRenderer cola3;
		private final ModelRenderer cola4;
		public Modelsnake() {
			textureWidth = 32;
			textureHeight = 32;
			serpiente = new ModelRenderer(this);
			serpiente.setRotationPoint(0.0F, 24.0F, -3.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, -7.0F);
			serpiente.addChild(head);
			head.setTextureOffset(0, 18).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
			cuerpo = new ModelRenderer(this);
			cuerpo.setRotationPoint(0.0F, -1.4F, -3.5F);
			serpiente.addChild(cuerpo);
			cuerpo.setTextureOffset(0, 9).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 7.0F, 0.35F, false);
			cola1 = new ModelRenderer(this);
			cola1.setRotationPoint(0.0F, -1.0F, 0.0F);
			serpiente.addChild(cola1);
			cola1.setTextureOffset(14, 3).addBox(-1.5F, -1.2F, 0.0F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			cola2 = new ModelRenderer(this);
			cola2.setRotationPoint(0.0F, 0.0F, 5.5F);
			cola1.addChild(cola2);
			cola2.setTextureOffset(0, 0).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			cola3 = new ModelRenderer(this);
			cola3.setRotationPoint(0.0F, 0.0F, 6.5F);
			cola2.addChild(cola3);
			cola3.setTextureOffset(14, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			cola4 = new ModelRenderer(this);
			cola4.setRotationPoint(0.0F, 0.0F, 4.5F);
			cola3.addChild(cola4);
			cola4.setTextureOffset(9, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			serpiente.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.cola4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.cola3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.cola2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.cola1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
