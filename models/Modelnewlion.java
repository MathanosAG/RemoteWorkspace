// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelnewlion extends EntityModel<Entity> {
	private final ModelRenderer cabeza;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cuerpo;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cola;
	private final ModelRenderer cube_r5;
	private final ModelRenderer piernaderecha;
	private final ModelRenderer piernaizquierda;
	private final ModelRenderer brazoderecha;
	private final ModelRenderer brazoizquierdo;

	public Modelnewlion() {
		textureWidth = 128;
		textureHeight = 128;

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, 11.25F, -8.75F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 12.75F, 8.75F);
		cabeza.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
		cube_r1.setTextureOffset(28, 26).addBox(-2.0F, -20.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 12.75F, 8.75F);
		cabeza.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
		cube_r2.setTextureOffset(0, 30).addBox(0.0F, -20.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 12.75F, 8.75F);
		cabeza.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(54, 16).addBox(-3.0F, -14.0F, -17.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 26).addBox(-5.0F, -18.0F, -13.0F, 10.0F, 8.0F, 8.0F, 0.0F, false);

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		cuerpo.setTextureOffset(10, 9).addBox(-5.0F, -18.1F, -8.0F, 10.0F, 9.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		cuerpo.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(32, 43).addBox(-6.0F, -19.35F, -10.0F, 12.0F, 13.0F, 0.0F, 0.0F, false);
		cube_r4.setTextureOffset(36, 26).addBox(-6.0F, -19.35F, -10.0F, 12.0F, 12.0F, 5.0F, 0.0F, false);
		cube_r4.setTextureOffset(37, 0).addBox(-5.5F, -18.75F, -9.0F, 11.0F, 11.0F, 5.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-5.0F, -17.9F, -6.0F, 10.0F, 9.0F, 17.0F, 0.0F, false);

		cola = new ModelRenderer(this);
		cola.setRotationPoint(0.0F, 9.0F, 11.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 15.0F, -11.0F);
		cola.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(32, 56).addBox(-0.5F, -11.1F, 15.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 26).addBox(-1.0F, -4.1F, 14.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		piernaderecha = new ModelRenderer(this);
		piernaderecha.setRotationPoint(-4.0F, 13.0F, 9.0F);
		piernaderecha.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		piernaizquierda = new ModelRenderer(this);
		piernaizquierda.setRotationPoint(4.0F, 15.0F, 9.0F);
		piernaizquierda.setTextureOffset(52, 52).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		brazoderecha = new ModelRenderer(this);
		brazoderecha.setRotationPoint(-4.2F, 13.0F, -6.0F);
		brazoderecha.setTextureOffset(16, 42).addBox(-1.0F, -7.0F, -2.0F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		brazoizquierdo = new ModelRenderer(this);
		brazoizquierdo.setRotationPoint(4.2F, 13.0F, -6.0F);
		brazoizquierdo.setTextureOffset(0, 42).addBox(-3.0F, -7.0F, -2.0F, 4.0F, 18.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		cabeza.render(matrixStack, buffer, packedLight, packedOverlay);
		cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
		cola.render(matrixStack, buffer, packedLight, packedOverlay);
		piernaderecha.render(matrixStack, buffer, packedLight, packedOverlay);
		piernaizquierda.render(matrixStack, buffer, packedLight, packedOverlay);
		brazoderecha.render(matrixStack, buffer, packedLight, packedOverlay);
		brazoizquierdo.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.brazoizquierdo.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.brazoderecha.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.piernaderecha.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.piernaizquierda.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.cola.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}