// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelRhino extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bodydown;
	private final ModelRenderer tail;
	private final ModelRenderer leg_back_right;
	private final ModelRenderer leg_back_left;
	private final ModelRenderer leg_front_right;
	private final ModelRenderer leg_front_left;
	private final ModelRenderer Cabezas;
	private final ModelRenderer head;
	private final ModelRenderer heads;
	private final ModelRenderer right_ear;
	private final ModelRenderer left_ear;

	public ModelRhino() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, -5.0F);
		body.setTextureOffset(0, 34).addBox(-8.0F, -8.0F, -5.0F, 17.0F, 16.0F, 15.0F, 0.02F, false);

		bodydown = new ModelRenderer(this);
		bodydown.setRotationPoint(0.0F, 19.0F, 8.0F);
		body.addChild(bodydown);
		setRotationAngle(bodydown, -0.0873F, 0.0F, 0.0F);
		bodydown.setTextureOffset(0, 0).addBox(-8.0F, -25.9962F, -7.0872F, 16.0F, 14.0F, 20.0F, 0.02F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(2.0F, 4.6698F, 15.4659F);
		bodydown.addChild(tail);
		setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 34).addBox(-5.0F, -27.6912F, 12.2001F, 6.0F, 12.0F, 0.0F, 0.02F, false);

		leg_back_right = new ModelRenderer(this);
		leg_back_right.setRotationPoint(-6.0F, 12.0F, 15.0F);
		leg_back_right.setTextureOffset(24, 65).addBox(-2.0F, 0.0F, -4.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg_back_left = new ModelRenderer(this);
		leg_back_left.setRotationPoint(5.0F, 12.0F, 14.0F);
		leg_back_left.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -3.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		leg_front_right = new ModelRenderer(this);
		leg_front_right.setRotationPoint(-6.0F, 12.0F, -5.0F);
		leg_front_right.setTextureOffset(0, 65).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		leg_front_left = new ModelRenderer(this);
		leg_front_left.setRotationPoint(6.0F, 11.0F, -5.0F);
		leg_front_left.setTextureOffset(52, 0).addBox(-4.0F, -1.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		Cabezas = new ModelRenderer(this);
		Cabezas.setRotationPoint(0.0F, 6.0F, -9.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 3.0F);
		Cabezas.addChild(head);
		setRotationAngle(head, 0.6545F, 0.0F, 0.0F);
		head.setTextureOffset(54, 55).addBox(-6.0F, -9.9375F, -7.7495F, 12.0F, 11.0F, 10.0F, 0.0F, false);

		heads = new ModelRenderer(this);
		heads.setRotationPoint(0.0F, 23.7713F, 2.3804F);
		head.addChild(heads);
		setRotationAngle(heads, -0.1309F, 0.0F, 0.0F);
		heads.setTextureOffset(49, 34).addBox(-6.0F, -28.5468F, -20.5736F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		heads.setTextureOffset(44, 65).addBox(-1.0F, -32.413F, -20.1625F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		heads.setTextureOffset(44, 65).addBox(-1.0F, -29.547F, -17.1984F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-5.0F, -4.5758F, 0.1955F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.0F, 0.0F, 1.6581F);
		right_ear.setTextureOffset(70, 0).addBox(-6.3678F, 0.0322F, -0.1958F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(5.0F, -4.5758F, 0.1955F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, 0.0F, 0.0F, -1.6581F);
		left_ear.setTextureOffset(64, 49).addBox(0.3678F, 0.0322F, -0.1958F, 6.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_back_right.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_back_left.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_front_right.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_front_left.render(matrixStack, buffer, packedLight, packedOverlay);
		Cabezas.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Cabezas.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Cabezas.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg_front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg_front_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg_back_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg_back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}