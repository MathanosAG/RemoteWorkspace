// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelunicorn extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer TailA;
	private final ModelRenderer Leg1A;
	private final ModelRenderer Leg2A;
	private final ModelRenderer Leg3A;
	private final ModelRenderer Leg4A;
	private final ModelRenderer Head;
	private final ModelRenderer corn;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Ear2;
	private final ModelRenderer Ear1;
	private final ModelRenderer Neck;

	public Modelunicorn() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 9.0F);
		Body.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, 0.0F, false);

		TailA = new ModelRenderer(this);
		TailA.setRotationPoint(0.0F, 4.0F, 11.0F);
		setRotationAngle(TailA, 0.5236F, 0.0F, 0.0F);
		TailA.setTextureOffset(26, 32).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

		Leg1A = new ModelRenderer(this);
		Leg1A.setRotationPoint(3.0F, 13.0F, 9.0F);
		Leg1A.setTextureOffset(44, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Leg1A.setTextureOffset(40, 32).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Leg2A = new ModelRenderer(this);
		Leg2A.setRotationPoint(-3.0F, 13.0F, 9.0F);
		Leg2A.setTextureOffset(28, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Leg2A.setTextureOffset(50, 0).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Leg3A = new ModelRenderer(this);
		Leg3A.setRotationPoint(3.0F, 13.0F, -9.0F);
		Leg3A.setTextureOffset(12, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Leg3A.setTextureOffset(52, 32).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Leg4A = new ModelRenderer(this);
		Leg4A.setRotationPoint(-3.0F, 13.0F, -9.0F);
		Leg4A.setTextureOffset(0, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Leg4A.setTextureOffset(50, 8).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -4.0F, -8.0F);
		Head.setTextureOffset(0, 32).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(40, 40).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		corn = new ModelRenderer(this);
		corn.setRotationPoint(0.0F, 26.4019F, 14.2321F);
		Head.addChild(corn);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, -30.0F, -16.0F);
		corn.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 54).addBox(-2.0F, -5.6088F, -0.7934F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		Ear2 = new ModelRenderer(this);
		Ear2.setRotationPoint(0.0F, -15.4019F, -11.2321F);
		corn.addChild(Ear2);
		setRotationAngle(Ear2, 0.3927F, 0.0F, -0.0873F);
		Ear2.setTextureOffset(0, 0).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Ear1 = new ModelRenderer(this);
		Ear1.setRotationPoint(0.0F, -15.4019F, -11.2321F);
		corn.addChild(Ear1);
		setRotationAngle(Ear1, 0.3927F, 0.0F, 0.0873F);
		Ear1.setTextureOffset(15, 0).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 7.0F, -8.0F);
		setRotationAngle(Neck, 0.2618F, 0.0F, 0.0F);
		Neck.setTextureOffset(0, 0).addBox(-2.0F, -11.9239F, -2.6173F, 4.0F, 12.0F, 7.0F, 0.0F, false);
		Neck.setTextureOffset(42, 0).addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		TailA.render(matrixStack, buffer, packedLight, packedOverlay);
		Leg1A.render(matrixStack, buffer, packedLight, packedOverlay);
		Leg2A.render(matrixStack, buffer, packedLight, packedOverlay);
		Leg3A.render(matrixStack, buffer, packedLight, packedOverlay);
		Leg4A.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Neck.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Leg1A.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Leg3A.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Leg2A.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Leg4A.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}