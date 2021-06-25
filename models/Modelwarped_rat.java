// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelwarped_rat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer body;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer tail;
	private final ModelRenderer tail1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer legleft;
	private final ModelRenderer cube_r8;
	private final ModelRenderer legright;
	private final ModelRenderer cube_r9;
	private final ModelRenderer armleft;
	private final ModelRenderer cube_r10;
	private final ModelRenderer armright;
	private final ModelRenderer cube_r11;

	public Modelwarped_rat() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 19.0F, -3.0F);
		head.setTextureOffset(18, 6).addBox(-0.5F, -0.2F, -8.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 5).addBox(1.2F, -2.2F, -5.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 5).addBox(-1.0F, -2.2F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 19).addBox(-2.0F, -3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(1.0F, -3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0F, 2.0F, -1.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(14, 1).addBox(-8.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, 2.0F, -8.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(22, 4).addBox(-4.0F, -1.8F, 0.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, 2.0F, -5.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(12, 12).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(18, 4).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(4, 17).addBox(0.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 17).addBox(-1.0F, -6.6F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, -3.0F, -4.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(19, 20).addBox(-3.5F, -4.7F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, -3.0F, -2.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-3.5F, -4.0F, 0.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 20.0F, 6.0F);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail1);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 3.0F, 8.0F);
		tail1.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 23).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.0F, -1.0F);
		tail1.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 12).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

		legleft = new ModelRenderer(this);
		legleft.setRotationPoint(1.0F, 21.0F, 6.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 3.0F, -1.0F);
		legleft.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
		cube_r8.setTextureOffset(12, 12).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		legright = new ModelRenderer(this);
		legright.setRotationPoint(-1.0F, 21.0F, 6.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 3.0F, -1.0F);
		legright.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
		cube_r9.setTextureOffset(14, 4).addBox(-1.0F, -2.8F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		armleft = new ModelRenderer(this);
		armleft.setRotationPoint(1.0F, 21.0F, -3.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 3.0F, -1.0F);
		armleft.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
		cube_r10.setTextureOffset(4, 0).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		armright = new ModelRenderer(this);
		armright.setRotationPoint(-1.0F, 21.0F, -4.0F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 3.0F, 0.0F);
		armright.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.1745F);
		cube_r11.setTextureOffset(0, 0).addBox(-1.0F, -3.8F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		legleft.render(matrixStack, buffer, packedLight, packedOverlay);
		legright.render(matrixStack, buffer, packedLight, packedOverlay);
		armleft.render(matrixStack, buffer, packedLight, packedOverlay);
		armright.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.legright.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.legleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.tail1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}