// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeltiger extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer belly;
	private final ModelRenderer head;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer backLegL;
	private final ModelRenderer backLegR;
	private final ModelRenderer frontLegL;
	private final ModelRenderer frontLegL_r1;
	private final ModelRenderer frontLegR;

	public Modeltiger() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 17.0F, 1.0F);

		belly = new ModelRenderer(this);
		belly.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(belly);
		setRotationAngle(belly, 1.5708F, 0.0F, 0.0F);
		belly.setTextureOffset(0, 0).addBox(-5.0F, -17.0F, 1.0001F, 10.0F, 16.0F, 12.0F, 0.0F, false);
		belly.setTextureOffset(0, 28).addBox(-4.5F, -2.0F, 1.0F, 9.0F, 16.0F, 11.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, -6.0F, -15.0F);
		body.addChild(head);
		head.setTextureOffset(35, 19).addBox(-2.5F, -6.0F, -11.0F, 8.0F, 8.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(56, 45).addBox(-0.5F, -2.0156F, -13.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(29, 34).addBox(-2.0F, -8.0F, -5.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 28).addBox(3.0F, -8.0F, -5.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-3.0F, -2.4F, -6.0F, 9.0F, 5.0F, 4.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -5.0F, 19.0F);
		body.addChild(tail1);
		setRotationAngle(tail1, 1.309F, 0.0F, 0.0F);
		tail1.setTextureOffset(24, 55).addBox(-1.5F, -8.0F, 0.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 13.6569F, 5.6569F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, 0.7854F, 0.0F, 0.0F);
		tail2.setTextureOffset(16, 55).addBox(-1.5F, -8.0F, 0.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);

		backLegL = new ModelRenderer(this);
		backLegL.setRotationPoint(3.1F, -3.0F, 11.0F);
		body.addChild(backLegL);
		backLegL.setTextureOffset(0, 55).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		backLegL.setTextureOffset(0, 0).addBox(-1.7F, 3.8436F, -0.301F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		backLegR = new ModelRenderer(this);
		backLegR.setRotationPoint(-3.1F, -2.0F, 12.0F);
		body.addChild(backLegR);
		backLegR.setTextureOffset(44, 9).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		backLegR.setTextureOffset(32, 56).addBox(-1.5F, 2.8436F, -1.301F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		frontLegL = new ModelRenderer(this);
		frontLegL.setRotationPoint(3.2F, -8.0F, -15.0F);
		body.addChild(frontLegL);

		frontLegL_r1 = new ModelRenderer(this);
		frontLegL_r1.setRotationPoint(-0.2F, 15.0F, 4.0F);
		frontLegL.addChild(frontLegL_r1);
		setRotationAngle(frontLegL_r1, 0.0436F, 0.0F, 0.0F);
		frontLegL_r1.setTextureOffset(52, 52).addBox(-1.4F, -18.1943F, -4.7385F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		frontLegL_r1.setTextureOffset(58, 0).addBox(-0.8F, -6.1564F, -4.301F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		frontLegR = new ModelRenderer(this);
		frontLegR.setRotationPoint(-3.2F, -8.0F, -15.0F);
		body.addChild(frontLegR);
		frontLegR.setTextureOffset(40, 40).addBox(-2.4F, -3.2F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		frontLegR.setTextureOffset(56, 36).addBox(-1.9F, 8.8436F, -0.301F, 3.0F, 6.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.backLegL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.frontLegR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.backLegR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.frontLegL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}