// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelnarwhal extends EntityModel<Entity> {
	private final ModelRenderer cuerpo;
	private final ModelRenderer c1;
	private final ModelRenderer aletaizquierda;
	private final ModelRenderer cube_r1;
	private final ModelRenderer aletaderecha;
	private final ModelRenderer cube_r2;
	private final ModelRenderer c2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer c3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer c4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer c5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer c6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cabeza;
	private final ModelRenderer mandibulasuperior;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer mandibulainferior;
	private final ModelRenderer cuerno;
	private final ModelRenderer cube_r10;

	public Modelnarwhal() {
		textureWidth = 128;
		textureHeight = 128;

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 14.0F, 0.0F);
		cuerpo.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		c1 = new ModelRenderer(this);
		c1.setRotationPoint(0.0F, -2.0F, -21.5F);
		cuerpo.addChild(c1);
		c1.setTextureOffset(0, 0).addBox(-6.5F, -7.5F, 0.5F, 13.0F, 15.0F, 16.0F, 0.0F, false);

		aletaizquierda = new ModelRenderer(this);
		aletaizquierda.setRotationPoint(6.0F, 5.5F, 8.5F);
		c1.addChild(aletaizquierda);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 6.5F, -14.0F);
		aletaizquierda.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.0436F, 0.0873F);
		cube_r1.setTextureOffset(77, 0).addBox(-1.0F, -7.5F, 9.0F, 8.0F, 2.0F, 10.0F, 0.0F, false);

		aletaderecha = new ModelRenderer(this);
		aletaderecha.setRotationPoint(-6.0F, 4.5F, 8.5F);
		c1.addChild(aletaderecha);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(12.0F, 7.5F, -14.0F);
		aletaderecha.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0436F, -0.0873F);
		cube_r2.setTextureOffset(77, 0).addBox(-19.0F, -8.5F, 9.0F, 8.0F, 2.0F, 10.0F, 0.0F, false);

		c2 = new ModelRenderer(this);
		c2.setRotationPoint(0.0F, 1.4F, 16.5F);
		c1.addChild(c2);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, 10.6F, -22.0F);
		c2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(44, 17).addBox(-12.0F, -19.1F, 21.0F, 12.0F, 13.0F, 14.0F, 0.0F, false);

		c3 = new ModelRenderer(this);
		c3.setRotationPoint(0.0F, -0.4F, 14.0F);
		c2.addChild(c3);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.0F, 11.0F, -36.0F);
		c3.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(46, 49).addBox(-11.0F, -18.0F, 34.0F, 10.0F, 10.0F, 12.0F, 0.0F, false);

		c4 = new ModelRenderer(this);
		c4.setRotationPoint(0.0F, 0.0F, 10.5F);
		c3.addChild(c4);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(6.0F, 11.0F, -46.5F);
		c4.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 61).addBox(-10.0F, -19.0F, 45.0F, 8.0F, 8.0F, 11.0F, 0.0F, false);

		c5 = new ModelRenderer(this);
		c5.setRotationPoint(0.0F, 0.5F, 10.5F);
		c4.addChild(c5);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(6.0F, 10.5F, -57.0F);
		c5.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(78, 44).addBox(-9.0F, -20.5F, 55.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);

		c6 = new ModelRenderer(this);
		c6.setRotationPoint(0.0F, 0.0F, 8.5F);
		c5.addChild(c6);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(6.0F, 10.5F, -65.5F);
		c6.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(29, 71).addBox(-12.0F, -19.5F, 63.0F, 12.0F, 4.0F, 9.0F, 0.0F, false);

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, 1.0F, -20.0F);
		cuerpo.addChild(cabeza);

		mandibulasuperior = new ModelRenderer(this);
		mandibulasuperior.setRotationPoint(0.0F, -0.25F, -8.0F);
		cabeza.addChild(mandibulasuperior);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(6.0F, 9.25F, 1.0F);
		mandibulasuperior.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(-7.5F, -11.5F, -8.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(6.0F, 9.25F, 1.0F);
		mandibulasuperior.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 31).addBox(-12.0F, -19.0F, -6.0F, 12.0F, 13.0F, 17.0F, 0.0F, false);

		mandibulainferior = new ModelRenderer(this);
		mandibulainferior.setRotationPoint(0.0F, 2.0F, -1.0F);
		cabeza.addChild(mandibulainferior);
		mandibulainferior.setTextureOffset(42, 0).addBox(-5.5F, 0.0F, -11.5F, 11.0F, 2.0F, 13.0F, 0.0F, false);

		cuerno = new ModelRenderer(this);
		cuerno.setRotationPoint(0.0F, -1.0F, -13.75F);
		cabeza.addChild(cuerno);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(6.0F, 10.0F, 6.75F);
		cuerno.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(82, 12).addBox(-6.5F, -10.5F, -28.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 80).addBox(-7.0F, -11.0F, -18.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.aletaizquierda.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.c2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.c3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.c4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.c5.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.c6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.aletaderecha.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}