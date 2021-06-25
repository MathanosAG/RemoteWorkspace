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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		serpiente.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.cola4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.cola3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.cola2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.cola1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}