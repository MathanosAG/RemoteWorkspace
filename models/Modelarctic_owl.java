// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelarctic_owl extends EntityModel<Entity> {
	private final ModelRenderer buho;
	private final ModelRenderer cabeza;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cuerpo;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer aladerecha;
	private final ModelRenderer cube_r4;
	private final ModelRenderer alaizquierda;
	private final ModelRenderer cube_r5;
	private final ModelRenderer piernaizquieda;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer piernaderecha;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public Modelarctic_owl() {
		textureWidth = 64;
		textureHeight = 64;

		buho = new ModelRenderer(this);
		buho.setRotationPoint(0.0F, 26.0F, -3.0F);

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, -11.75F, 3.75F);
		buho.addChild(cabeza);
		cabeza.setTextureOffset(0, 0).addBox(-0.5F, -2.25F, -3.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 11.75F, -3.75F);
		cabeza.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 14).addBox(-3.5F, -18.0F, 0.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 0.0F, 0.0F);
		buho.addChild(cuerpo);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cuerpo.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(20, 15).addBox(-2.5F, -6.0F, 4.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -7.6673F, 3.669F);
		cuerpo.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-3.5F, -4.5F, -2.5F, 7.0F, 9.0F, 5.0F, 0.0F, false);

		aladerecha = new ModelRenderer(this);
		aladerecha.setRotationPoint(3.0F, -11.0F, 3.0F);
		buho.addChild(aladerecha);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.0F, 11.0F, -3.0F);
		aladerecha.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(24, 0).addBox(3.5F, -12.0F, 2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		alaizquierda = new ModelRenderer(this);
		alaizquierda.setRotationPoint(-3.0F, -11.0F, 4.0F);
		buho.addChild(alaizquierda);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.0F, 11.0F, -4.0F);
		alaizquierda.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(21, 21).addBox(-4.5F, -12.0F, 2.5F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		piernaizquieda = new ModelRenderer(this);
		piernaizquieda.setRotationPoint(-1.875F, -3.0F, 3.25F);
		buho.addChild(piernaizquieda);
		piernaizquieda.setTextureOffset(0, 17).addBox(-0.625F, -1.0F, -0.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaizquieda.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, -0.4363F, 0.0F);
		cube_r6.setTextureOffset(28, 20).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaizquieda.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.4363F, 0.0F);
		cube_r7.setTextureOffset(13, 27).addBox(-4.0F, -2.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaizquieda.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 30).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		piernaderecha = new ModelRenderer(this);
		piernaderecha.setRotationPoint(2.125F, -3.0F, 3.25F);
		buho.addChild(piernaderecha);
		piernaderecha.setTextureOffset(0, 14).addBox(-0.625F, -1.0F, -0.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaderecha.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.2618F, -0.4363F, 0.0F);
		cube_r9.setTextureOffset(19, 0).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaderecha.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2618F, 0.4363F, 0.0F);
		cube_r10.setTextureOffset(0, 26).addBox(-4.0F, -2.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.875F, 3.0F, -3.25F);
		piernaderecha.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(8, 26).addBox(-2.5F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		buho.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.aladerecha.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.alaizquierda.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.piernaderecha.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.piernaizquieda.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}