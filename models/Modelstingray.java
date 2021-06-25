// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelstingray extends EntityModel<Entity> {
	private final ModelRenderer cuerpo;
	private final ModelRenderer cube_r1;
	private final ModelRenderer alaizquieda;
	private final ModelRenderer cube_r2;
	private final ModelRenderer aladerecha;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cola;
	private final ModelRenderer cube_r4;

	public Modelstingray() {
		textureWidth = 128;
		textureHeight = 128;

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		cuerpo.setTextureOffset(0, 23).addBox(-10.0F, -2.0F, -11.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
		cuerpo.setTextureOffset(0, 0).addBox(-10.5F, -1.0F, -13.0F, 21.0F, 1.0F, 22.0F, 0.0F, false);
		cuerpo.setTextureOffset(0, 14).addBox(-3.0F, -2.0F, 9.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cuerpo.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-8.0F, -5.25F, -14.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 7).addBox(6.0F, -5.25F, -14.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		alaizquieda = new ModelRenderer(this);
		alaizquieda.setRotationPoint(10.0F, 22.5F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0F, 0.0F, 1.0F);
		alaizquieda.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.0436F, 0.0873F);
		cube_r2.setTextureOffset(54, 46).addBox(4.0F, -0.5F, -10.0F, 18.0F, 1.0F, 18.0F, 0.0F, false);

		aladerecha = new ModelRenderer(this);
		aladerecha.setRotationPoint(-10.0F, 22.5F, -0.5F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(15.0F, 0.0F, 1.5F);
		aladerecha.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0436F, -0.0873F);
		cube_r3.setTextureOffset(0, 45).addBox(-32.0F, -1.5F, -10.5F, 18.0F, 1.0F, 18.0F, 0.0F, false);

		cola = new ModelRenderer(this);
		cola.setRotationPoint(0.0F, 23.0F, 11.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.917F, 0.0236F);
		cola.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(60, 25).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 20.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
		alaizquieda.render(matrixStack, buffer, packedLight, packedOverlay);
		aladerecha.render(matrixStack, buffer, packedLight, packedOverlay);
		cola.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.aladerecha.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.alaizquieda.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.cola.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}