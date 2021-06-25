// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelwarped_rat_monster extends EntityModel<Entity> {
	private final ModelRenderer legright;
	private final ModelRenderer cube_r1;
	private final ModelRenderer legleft;
	private final ModelRenderer cube_r2;
	private final ModelRenderer armright;
	private final ModelRenderer cube_r3;
	private final ModelRenderer armleft;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer body;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer head;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;

	public Modelwarped_rat_monster() {
		textureWidth = 64;
		textureHeight = 64;

		legright = new ModelRenderer(this);
		legright.setRotationPoint(-3.0F, 20.0F, 2.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 5.0F, -1.0F);
		legright.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		legleft = new ModelRenderer(this);
		legleft.setRotationPoint(3.0F, 20.0F, 2.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, 4.0F, -1.0F);
		legleft.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
		cube_r2.setTextureOffset(12, 37).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		armright = new ModelRenderer(this);
		armright.setRotationPoint(-4.0F, 18.0F, -8.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 7.0F, -1.0F);
		armright.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2618F);
		cube_r3.setTextureOffset(0, 24).addBox(-2.0F, -7.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		armleft = new ModelRenderer(this);
		armleft.setRotationPoint(4.0F, 16.0F, -8.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.0F, 8.0F, -1.0F);
		armleft.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2618F);
		cube_r4.setTextureOffset(38, 18).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 4.0F, -1.0F);
		armleft.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
		cube_r5.setTextureOffset(22, 0).addBox(-2.5F, -5.0F, -0.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 18.0F, 3.0F);
		tail.setTextureOffset(12, 28).addBox(-0.5F, 2.5F, 9.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 3.0F, 13.0F);
		tail.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
		tail.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 24).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 18.0F, -6.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(3.0F, -2.0F, -3.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(32, 32).addBox(-7.2F, -2.2F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(8.0F, -2.0F, 0.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(30, 9).addBox(-7.2F, -2.4F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(9.0F, -1.0F, 2.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(40, 0).addBox(-8.0F, -2.2F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.0F, -1.0F, 3.0F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(20, 39).addBox(-8.0F, -2.2F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(10.0F, -1.0F, 6.0F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(38, 9).addBox(-8.0F, -2.2F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(5.0F, 0.0F, 6.0F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(33, 36).addBox(-9.0F, -3.0F, 0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.0F, 2.0F, 1.0F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(0, 0).addBox(-6.5F, -5.0F, 0.0F, 7.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.0F, 2.0F, -3.0F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(0, 13).addBox(-8.0F, -6.0F, 0.0F, 8.0F, 6.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.0F, -9.0F);
		head.setTextureOffset(12, 24).addBox(1.5F, -4.6F, -6.4F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(0.5F, -1.8F, -7.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 24).addBox(-2.5F, -4.4F, -6.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 15).addBox(0.5F, -4.8F, -3.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 18).addBox(-3.0F, -4.6F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(31, 0).addBox(1.8F, -5.4F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 4).addBox(-3.8F, -5.4F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 35).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(13.0F, 2.0F, -5.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(21, 21).addBox(-16.0F, -6.2F, -0.5F, 6.0F, 6.0F, 5.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(7.0F, 2.0F, -1.0F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(21, 13).addBox(-14.5F, -5.0F, 0.0F, 15.0F, 5.0F, 0.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(16.0F, 0.0F, -24.0F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(18, 24).addBox(-16.75F, -0.95F, 14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(12.0F, 2.0F, -9.0F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(18, 32).addBox(-14.5F, -3.1F, -0.5F, 5.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		legright.render(matrixStack, buffer, packedLight, packedOverlay);
		legleft.render(matrixStack, buffer, packedLight, packedOverlay);
		armright.render(matrixStack, buffer, packedLight, packedOverlay);
		armleft.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.legright.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.legleft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}