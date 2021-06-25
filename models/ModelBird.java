// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelBird extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer TAIL;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer WingsLeft;
	private final ModelRenderer cube_r3;
	private final ModelRenderer WingsRight;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LegLeft;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LegRight;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public ModelBird() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.5F, 18.0F, 1.0F);
		setRotationAngle(body, -0.2618F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(2.5F, 4.0F, 6.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0436F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 8).addBox(-3.0F, -6.2599F, -6.1927F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-0.5F, 4.0F, 1.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.0873F, 0.0F, 0.0F);
		body_r2.setTextureOffset(16, 0).addBox(-0.5F, -6.2588F, -4.0341F, 5.0F, 4.0F, 3.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 16.0F, -1.0F);
		setRotationAngle(Head, -0.0873F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0F, 1.0F, -8.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(12, 0).addBox(-5.0F, -0.1167F, 3.909F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-6.0F, -2.2603F, 4.4081F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -1.0F, -5.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(2, 9).addBox(-1.0F, 0.6793F, 3.6992F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		TAIL = new ModelRenderer(this);
		TAIL.setRotationPoint(0.0F, 17.0F, 3.0F);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(1.0F, 6.0F, 4.0F);
		TAIL.addChild(body_r3);
		setRotationAngle(body_r3, 0.8727F, 0.0F, 0.0F);
		body_r3.setTextureOffset(3, 9).addBox(-2.0F, -6.3598F, 1.7092F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(1.0F, 6.0F, 4.0F);
		TAIL.addChild(body_r4);
		setRotationAngle(body_r4, 0.3927F, 0.0F, 0.0F);
		body_r4.setTextureOffset(18, 0).addBox(-2.5F, -6.6624F, -3.3928F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		WingsLeft = new ModelRenderer(this);
		WingsLeft.setRotationPoint(-2.0F, 16.0F, -1.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 3.0F, -1.0F);
		WingsLeft.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, -0.0873F, 0.0F);
		cube_r3.setTextureOffset(15, 8).addBox(-0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		WingsRight = new ModelRenderer(this);
		WingsRight.setRotationPoint(2.0F, 16.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 3.0F, -2.0F);
		WingsRight.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0873F, 0.0F);
		cube_r4.setTextureOffset(15, 8).addBox(-0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		LegLeft = new ModelRenderer(this);
		LegLeft.setRotationPoint(0.0F, 19.0F, 3.0F);
		setRotationAngle(LegLeft, 0.2182F, 0.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 2.0F, 0.0F);
		LegLeft.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(28, 7).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, 2.0F, -1.0F);
		LegLeft.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(24, 10).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		LegRight = new ModelRenderer(this);
		LegRight.setRotationPoint(-3.0F, 19.0F, 3.0F);
		setRotationAngle(LegRight, 0.2182F, 0.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 2.0F, 0.0F);
		LegRight.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(28, 7).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, 2.0F, -1.0F);
		LegRight.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(24, 10).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		TAIL.render(matrixStack, buffer, packedLight, packedOverlay);
		WingsLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		WingsRight.render(matrixStack, buffer, packedLight, packedOverlay);
		LegLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		LegRight.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.WingsRight.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LegRight.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.WingsLeft.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.TAIL.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LegLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}