// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcow extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public Modelcow() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 19.0F, 11.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, -8.0F);
		head.setTextureOffset(0, 30).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 20.0F, 8.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0436F, 0.0F, 0.0F);
		head_r1.setTextureOffset(35, 0).addBox(3.0F, -27.0F, -12.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 0).addBox(-6.0F, -27.0F, -12.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-4.0F, 12.0F, 7.0F);
		leg0.setTextureOffset(46, 0).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 12.0F, 7.0F);
		leg1.setTextureOffset(45, 45).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 12.0F, -6.0F);
		leg2.setTextureOffset(0, 45).addBox(-2.0F, 0.0F, -1.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 12.0F, -6.0F);
		leg3.setTextureOffset(30, 30).addBox(-3.0F, 0.0F, -1.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}