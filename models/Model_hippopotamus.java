// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Model_hippopotamus extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer mouth;
	private final ModelRenderer mouth_r1;
	private final ModelRenderer horns;
	private final ModelRenderer mouth_r2;
	private final ModelRenderer mouth_r3;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public Model_hippopotamus() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(-3.0F, 4.0F, -7.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(8, 49).addBox(-5.0F, 16.0F, -4.0F, 16.0F, 23.0F, 19.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 21.0F, -2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.0873F, 0.0F, 0.0F);
		body_r1.setTextureOffset(8, 5).addBox(-7.0F, -20.591F, -2.9166F, 20.0F, 16.0F, 20.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -2.0F, 0.0F);
		neck.setTextureOffset(112, 5).addBox(-3.0F, -5.0F, -7.0F, 8.0F, 8.0F, 16.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, -1.0F, -3.0F);
		neck.addChild(head);
		setRotationAngle(head, 0.0436F, 0.0F, 0.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 18.2586F, -7.055F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.setTextureOffset(77, 2).addBox(-4.0F, -19.0F, -16.3F, 12.0F, 5.0F, 10.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(1.0F, 4.944F, 18.6959F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0436F, 0.0F, 0.0F);
		head_r2.setTextureOffset(0, 6).addBox(3.5F, -17.0038F, -24.0871F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 0).addBox(-5.5F, -17.0038F, -24.0871F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 18.1308F, 9.9952F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.0436F, 0.0F, 0.0F);
		head_r3.setTextureOffset(87, 33).addBox(-4.5F, -27.0F, -24.0F, 13.0F, 13.0F, 11.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 7.1743F, -2.0076F);
		head.addChild(mouth);

		mouth_r1 = new ModelRenderer(this);
		mouth_r1.setRotationPoint(1.0F, 13.091F, 2.0834F);
		mouth.addChild(mouth_r1);
		setRotationAngle(mouth_r1, 0.0873F, 0.0F, 0.0F);
		mouth_r1.setTextureOffset(69, 73).addBox(-5.5F, -16.8609F, -23.378F, 13.0F, 3.0F, 21.0F, 0.0F, false);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(-5.0F, -3.7385F, -10.0114F);
		head.addChild(horns);
		setRotationAngle(horns, 1.0472F, 0.0F, 0.0F);

		mouth_r2 = new ModelRenderer(this);
		mouth_r2.setRotationPoint(7.0F, 25.5774F, 10.9063F);
		horns.addChild(mouth_r2);
		setRotationAngle(mouth_r2, 0.2182F, 0.2182F, -0.0873F);
		mouth_r2.setTextureOffset(123, 81).addBox(1.5974F, -38.5629F, -26.0888F, 2.0F, 2.0F, 9.0F, 0.0F, false);

		mouth_r3 = new ModelRenderer(this);
		mouth_r3.setRotationPoint(6.0F, 25.0937F, 9.5774F);
		horns.addChild(mouth_r3);
		setRotationAngle(mouth_r3, 0.3054F, -0.2182F, -0.0873F);
		mouth_r3.setTextureOffset(123, 81).addBox(3.0151F, -38.2306F, -23.4373F, 2.0F, 2.0F, 9.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-5.0F, -1.0F, 28.0F);
		leg0.setTextureOffset(128, 123).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
		leg0.setTextureOffset(78, 135).addBox(-2.0F, 19.0F, -1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(5.0F, -1.0F, 28.0F);
		leg1.setTextureOffset(88, 102).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
		leg1.setTextureOffset(5, 131).addBox(-2.0F, 19.0F, -1.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-7.0F, -4.0F, -2.0F);
		leg2.setTextureOffset(44, 101).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 21.0F, 7.0F, 0.0F, false);
		leg2.setTextureOffset(123, 101).addBox(-2.0F, 21.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(6.0F, -4.0F, -1.0F);
		leg3.setTextureOffset(4, 95).addBox(-3.0F, 0.0F, -5.0F, 7.0F, 21.0F, 7.0F, 0.0F, false);
		leg3.setTextureOffset(121, 63).addBox(-2.0F, 21.0F, -4.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
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
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}