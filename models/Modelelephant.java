// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelelephant extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer ears;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer mouth;
	private final ModelRenderer horns;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r1;

	public Modelelephant() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(1.0F, -2.0F, 5.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-13.0F, -13.0F, 2.0F, 24.0F, 19.0F, 23.0F, 1.0F, false);
		body.setTextureOffset(0, 42).addBox(-12.0F, 6.0F, 2.0F, 22.0F, 17.0F, 23.0F, 1.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -10.0F, -7.0F);
		neck.setTextureOffset(0, 82).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 11.0F, 18.0F, 1.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		neck.addChild(head);
		head.setTextureOffset(74, 74).addBox(-10.0F, -19.0F, -20.0F, 20.0F, 21.0F, 16.0F, 1.0F, false);
		head.setTextureOffset(32, 111).addBox(-2.0F, -6.0F, -21.0F, 4.0F, 26.0F, 4.0F, 1.0F, false);

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 36.0F, 7.0F);
		head.addChild(ears);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(9.0F, -47.0F, -16.0F);
		ears.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.2618F);
		head_r1.setTextureOffset(123, 19).addBox(2.0365F, -7.8686F, -11.0F, 1.0F, 19.0F, 16.0F, 1.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-7.0F, -47.0F, -16.0F);
		ears.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.2618F);
		head_r2.setTextureOffset(94, 0).addBox(-5.0024F, -7.2098F, -11.0F, 1.0F, 19.0F, 16.0F, 1.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 9.0F, -3.0F);
		head.addChild(mouth);
		mouth.setTextureOffset(67, 42).addBox(-10.0F, -5.0F, -17.0F, 20.0F, 4.0F, 16.0F, 1.0F, false);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(-5.0F, 7.0F, -12.0F);
		head.addChild(horns);
		setRotationAngle(horns, 2.0508F, 0.0F, 0.0F);
		horns.setTextureOffset(141, 0).addBox(-7.0F, -16.844F, 6.9829F, 2.0F, 21.0F, 4.0F, 1.0F, false);
		horns.setTextureOffset(32, 141).addBox(15.0F, -16.844F, 6.9829F, 2.0F, 21.0F, 4.0F, 1.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-6.0F, -7.0F, 22.0F);
		leg0.setTextureOffset(112, 112).addBox(-7.0F, -8.0F, -4.0F, 8.0F, 38.0F, 8.0F, 1.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(5.0F, -14.0F, 22.0F);
		leg1.setTextureOffset(80, 111).addBox(0.0F, -1.0F, -3.0F, 8.0F, 38.0F, 8.0F, 1.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-6.0F, -14.0F, 2.0F);
		leg2.setTextureOffset(0, 111).addBox(-7.0F, -1.0F, -10.0F, 8.0F, 38.0F, 8.0F, 1.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(7.0F, -14.0F, 2.0F);
		leg3.setTextureOffset(48, 103).addBox(-2.0F, -1.0F, -10.0F, 8.0F, 38.0F, 8.0F, 1.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -17.0F, 27.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0F, 28.0F, 1.0F);
		tail.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(139, 54).addBox(-8.0F, -32.91F, 2.1289F, 8.0F, 30.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
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