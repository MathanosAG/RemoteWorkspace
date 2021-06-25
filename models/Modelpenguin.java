// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelpenguin extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer wing0;
	private final ModelRenderer wing1;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;

	public Modelpenguin() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 13.5F, -2.0F);
		setRotationAngle(body, 0.4363F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 7.5F, 2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.1745F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 12).addBox(-3.5F, -8.827F, -5.9836F, 7.0F, 9.0F, 6.0F, 0.0F, false);

		wing0 = new ModelRenderer(this);
		wing0.setRotationPoint(1.5F, 0.4F, -0.8F);
		body.addChild(wing0);
		wing0.setTextureOffset(26, 6).addBox(1.6792F, -1.9788F, -2.132F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(-3.5F, 0.4F, -0.8F);
		body.addChild(wing1);
		wing1.setTextureOffset(38, 0).addBox(-0.7155F, -1.496F, -1.5282F, 1.0F, 10.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.7F, -2.8F);
		head.setTextureOffset(18, 1).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -8.5F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(26, 3).addBox(-1.5F, -5.7F, -3.9F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 0).addBox(-1.5F, -5.5F, -4.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 18.1F, 2.2F);
		setRotationAngle(tail, 1.0472F, 0.0F, 0.0F);
		tail.setTextureOffset(38, 15).addBox(-1.5F, -0.766F, -1.6428F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(1.5F, 19.0F, -0.5F);
		leg0.setTextureOffset(41, 30).addBox(0.0F, 0.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leg0.setTextureOffset(41, 30).addBox(-1.0F, 5.0F, -3.0F, 3.0F, -1.0F, 5.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-2.5F, 20.0F, -0.5F);
		leg1.setTextureOffset(60, 29).addBox(0.0F, -0.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leg1.setTextureOffset(60, 29).addBox(-1.0F, 4.0F, -3.0F, 3.0F, -1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.wing1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.wing0.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}