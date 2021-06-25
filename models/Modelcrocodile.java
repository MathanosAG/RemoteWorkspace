// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelcrocodile extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer BODY_90;
	private final ModelRenderer bodyup;
	private final ModelRenderer bodyinner;
	private final ModelRenderer bodydown;
	private final ModelRenderer bodydown2;
	private final ModelRenderer tailupper;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer r23;
	private final ModelRenderer r24;
	private final ModelRenderer tailmiedo;
	private final ModelRenderer r22;
	private final ModelRenderer tailbajo;
	private final ModelRenderer bone;
	private final ModelRenderer tailultima;
	private final ModelRenderer cuello;
	private final ModelRenderer r1;
	private final ModelRenderer r5;
	private final ModelRenderer r2;
	private final ModelRenderer r4;
	private final ModelRenderer r3;
	private final ModelRenderer r25;
	private final ModelRenderer head;
	private final ModelRenderer r6;
	private final ModelRenderer r7;
	private final ModelRenderer r8;
	private final ModelRenderer r9;
	private final ModelRenderer r10;
	private final ModelRenderer r11;
	private final ModelRenderer r12;
	private final ModelRenderer r13;
	private final ModelRenderer r15;
	private final ModelRenderer r16;
	private final ModelRenderer r17;
	private final ModelRenderer r18;
	private final ModelRenderer r19;
	private final ModelRenderer r20;
	private final ModelRenderer r21;
	private final ModelRenderer r14;
	private final ModelRenderer armleft;
	private final ModelRenderer r27;
	private final ModelRenderer r26;
	private final ModelRenderer r28;
	private final ModelRenderer r29;
	private final ModelRenderer r31;
	private final ModelRenderer r30;
	private final ModelRenderer legleft;
	private final ModelRenderer r32;
	private final ModelRenderer r33;
	private final ModelRenderer r34;
	private final ModelRenderer r35;
	private final ModelRenderer r36;
	private final ModelRenderer r37;
	private final ModelRenderer armright;
	private final ModelRenderer r38;
	private final ModelRenderer r39;
	private final ModelRenderer r40;
	private final ModelRenderer r41;
	private final ModelRenderer r42;
	private final ModelRenderer r43;
	private final ModelRenderer legright;
	private final ModelRenderer r44;
	private final ModelRenderer r45;
	private final ModelRenderer r46;
	private final ModelRenderer r47;
	private final ModelRenderer r48;
	private final ModelRenderer r49;

	public Modelcrocodile() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, -17.0F);

		BODY_90 = new ModelRenderer(this);
		BODY_90.setRotationPoint(0.0F, 8.0F, 8.0F);
		body.addChild(BODY_90);
		setRotationAngle(BODY_90, 0.0F, 3.1416F, 0.0F);

		bodyup = new ModelRenderer(this);
		bodyup.setRotationPoint(0.0F, -10.0F, 8.0F);
		BODY_90.addChild(bodyup);
		setRotationAngle(bodyup, 0.0436F, 0.0F, 0.0F);
		bodyup.setTextureOffset(0, 0).addBox(-8.0F, -2.5F, -15.0F, 16.0F, 6.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(45, 45).addBox(-7.5F, 2.0F, -15.0F, 15.0F, 2.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(0, 41).addBox(-7.5F, -3.3F, -15.0F, 15.0F, 2.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(90, 30).addBox(-6.5F, -3.4F, -15.0F, 4.0F, 1.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(87, 64).addBox(2.5F, -3.4F, -15.0F, 4.0F, 1.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(105, 105).addBox(4.0F, -3.8F, -15.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);
		bodyup.setTextureOffset(0, 103).addBox(-6.0F, -3.8F, -15.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);

		bodyinner = new ModelRenderer(this);
		bodyinner.setRotationPoint(0.0F, 2.0F, -14.0F);
		bodyup.addChild(bodyinner);
		bodyinner.setTextureOffset(0, 21).addBox(-7.5F, -4.2F, -14.0F, 15.0F, 6.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(45, 27).addBox(-7.0F, -0.7F, -14.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(47, 0).addBox(-7.0F, -4.4F, -14.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(48, 94).addBox(-6.5F, -5.1F, -14.0F, 4.0F, 1.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(26, 93).addBox(2.5F, -5.1F, -14.0F, 4.0F, 1.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(86, 109).addBox(4.0F, -5.5F, -14.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);
		bodyinner.setTextureOffset(54, 109).addBox(-6.0F, -5.5F, -14.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);

		bodydown = new ModelRenderer(this);
		bodydown.setRotationPoint(0.0F, -1.0F, -13.0F);
		bodyinner.addChild(bodydown);
		setRotationAngle(bodydown, 0.0873F, 0.0F, 0.0F);
		bodydown.setTextureOffset(52, 62).addBox(-6.5F, -3.2F, -11.0F, 13.0F, 5.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(46, 79).addBox(-6.0F, 0.3F, -11.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(82, 82).addBox(-6.0F, -3.4F, -11.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(118, 79).addBox(-5.5F, -4.1F, -11.0F, 3.0F, 1.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(113, 30).addBox(2.5F, -4.1F, -11.0F, 3.0F, 1.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(120, 43).addBox(3.0F, -4.5F, -11.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(33, 69).addBox(4.0F, -4.5F, -11.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
		bodydown.setTextureOffset(72, 109).addBox(-5.0F, -4.5F, -11.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);

		bodydown2 = new ModelRenderer(this);
		bodydown2.setRotationPoint(0.0F, 0.0F, -11.0F);
		bodydown.addChild(bodydown2);
		bodydown2.setTextureOffset(87, 15).addBox(-5.5F, -3.2F, -8.0F, 11.0F, 5.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(90, 46).addBox(-5.0F, 0.3F, -8.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(0, 92).addBox(-5.0F, -3.4F, -8.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(0, 129).addBox(-4.5F, -4.1F, -8.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(99, 124).addBox(2.5F, -4.1F, -8.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(129, 131).addBox(3.0F, -4.5F, -8.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		bodydown2.setTextureOffset(70, 93).addBox(-4.0F, -4.5F, -8.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

		tailupper = new ModelRenderer(this);
		tailupper.setRotationPoint(0.0F, -1.0F, -8.0F);
		bodydown2.addChild(tailupper);
		setRotationAngle(tailupper, -0.0436F, 0.0F, 0.0F);
		tailupper.setTextureOffset(0, 2).addBox(-2.0F, -4.0F, -12.0F, 0.0F, 2.0F, 7.0F, 0.0F, false);
		tailupper.setTextureOffset(110, 58).addBox(-4.0F, -2.6F, -7.0F, 8.0F, 1.0F, 9.0F, 0.0F, false);
		tailupper.setTextureOffset(15, 134).addBox(-3.5F, -3.7F, -7.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
		tailupper.setTextureOffset(65, 133).addBox(2.5F, -3.7F, -7.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 11.0F, 14.0F);
		tailupper.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, -0.0873F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -29.0F, 0.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 11.0F, 14.0F);
		tailupper.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0873F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(3.0F, -8.0F, -29.0F, 0.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -1.0F, -2.5F);
		tailupper.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
		cube_r3.setTextureOffset(0, 4).addBox(-4.0F, -3.0F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, -1.0F, -2.5F);
		tailupper.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
		cube_r4.setTextureOffset(0, 4).addBox(0.0F, -3.0F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, false);

		r23 = new ModelRenderer(this);
		r23.setRotationPoint(0.0F, 11.0F, -4.0F);
		tailupper.addChild(r23);
		setRotationAngle(r23, -0.0052F, 0.0F, 0.0F);
		r23.setTextureOffset(84, 95).addBox(-4.5F, -13.4F, -3.0F, 9.0F, 5.0F, 9.0F, 0.0F, false);

		r24 = new ModelRenderer(this);
		r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		r23.addChild(r24);
		setRotationAngle(r24, -0.007F, 0.0F, 0.0F);
		r24.setTextureOffset(53, 15).addBox(-4.0F, -9.9F, -3.0F, 8.0F, 2.0F, 9.0F, 0.0F, false);

		tailmiedo = new ModelRenderer(this);
		tailmiedo.setRotationPoint(0.0F, -1.0F, -7.0F);
		tailupper.addChild(tailmiedo);
		setRotationAngle(tailmiedo, -0.0873F, 0.0F, 0.0F);
		tailmiedo.setTextureOffset(119, 12).addBox(-3.5F, -1.2F, -7.0F, 7.0F, 4.0F, 8.0F, 0.0F, false);
		tailmiedo.setTextureOffset(124, 104).addBox(-3.0F, -1.4F, -7.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		tailmiedo.setTextureOffset(144, 100).addBox(-2.5F, -2.3F, -7.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		tailmiedo.setTextureOffset(58, 144).addBox(1.5F, -2.3F, -7.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		r22 = new ModelRenderer(this);
		r22.setRotationPoint(0.0F, 10.0F, -6.0F);
		tailmiedo.addChild(r22);
		setRotationAngle(r22, -0.0873F, 0.0F, 0.0F);
		r22.setTextureOffset(81, 124).addBox(-3.0F, -8.4F, -2.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);
		r22.setTextureOffset(158, 0).addBox(-1.0F, -14.0F, -12.0F, 0.0F, 4.0F, 13.0F, 0.0F, false);

		tailbajo = new ModelRenderer(this);
		tailbajo.setRotationPoint(0.0F, 0.0F, -6.0F);
		tailmiedo.addChild(tailbajo);
		setRotationAngle(tailbajo, -0.0873F, 0.0F, 0.0F);
		tailbajo.setTextureOffset(131, 24).addBox(-2.0F, -1.6F, -7.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		tailbajo.setTextureOffset(143, 90).addBox(-1.5F, -2.3F, -7.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		tailbajo.setTextureOffset(143, 143).addBox(0.5F, -2.3F, -7.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 10.0F, -5.0F);
		tailbajo.addChild(bone);
		setRotationAngle(bone, -0.0873F, 0.0F, 0.0F);
		bone.setTextureOffset(23, 122).addBox(-2.5F, -11.2F, -3.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(115, 131).addBox(-2.0F, -9.7F, -2.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);

		tailultima = new ModelRenderer(this);
		tailultima.setRotationPoint(0.0F, 0.0F, -6.0F);
		tailbajo.addChild(tailultima);
		setRotationAngle(tailultima, -0.0873F, 0.0F, 0.0F);
		tailultima.setTextureOffset(43, 133).addBox(-1.5F, -1.2F, -7.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		tailultima.setTextureOffset(111, 141).addBox(-1.0F, 0.3F, -7.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		tailultima.setTextureOffset(131, 33).addBox(-1.0F, -1.6F, -7.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		tailultima.setTextureOffset(40, 143).addBox(-0.5F, -2.3F, -7.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		cuello = new ModelRenderer(this);
		cuello.setRotationPoint(0.0F, 14.0F, -17.0F);

		r1 = new ModelRenderer(this);
		r1.setRotationPoint(0.0F, 1.0F, 2.5F);
		cuello.addChild(r1);
		setRotationAngle(r1, -0.0436F, 0.0F, 0.0F);
		r1.setTextureOffset(123, 0).addBox(-7.5F, -3.3F, -1.5F, 15.0F, 6.0F, 1.0F, 0.0F, false);

		r5 = new ModelRenderer(this);
		r5.setRotationPoint(-2.0F, 0.0F, -4.0F);
		r1.addChild(r5);
		setRotationAngle(r5, 0.0436F, 0.0F, 0.0F);
		r5.setTextureOffset(110, 68).addBox(-3.0F, -3.4F, -2.6F, 10.0F, 5.0F, 6.0F, 0.0F, false);

		r2 = new ModelRenderer(this);
		r2.setRotationPoint(-1.0F, 1.0F, -2.0F);
		r1.addChild(r2);
		setRotationAngle(r2, -0.1745F, 0.0F, 0.0F);
		r2.setTextureOffset(111, 95).addBox(-5.5F, -4.75F, -2.2F, 13.0F, 6.0F, 3.0F, 0.0F, false);

		r4 = new ModelRenderer(this);
		r4.setRotationPoint(-1.0F, -2.0F, -2.0F);
		r2.addChild(r4);
		r4.setTextureOffset(113, 121).addBox(-3.0F, -1.9F, -3.8F, 10.0F, 5.0F, 5.0F, 0.0F, false);

		r3 = new ModelRenderer(this);
		r3.setRotationPoint(-1.0F, -1.0F, -1.0F);
		r2.addChild(r3);
		r3.setTextureOffset(51, 124).addBox(-3.5F, -3.4F, -3.0F, 11.0F, 5.0F, 4.0F, 0.0F, false);

		r25 = new ModelRenderer(this);
		r25.setRotationPoint(2.0F, -2.0F, 10.5F);
		r3.addChild(r25);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, -14.0F);
		r25.addChild(head);
		setRotationAngle(head, 0.2182F, 0.0F, 0.0F);

		r6 = new ModelRenderer(this);
		r6.setRotationPoint(0.0F, -2.5F, -3.5F);
		head.addChild(r6);
		setRotationAngle(r6, 0.0436F, 0.0F, 0.0F);
		r6.setTextureOffset(34, 109).addBox(-5.5F, -3.5F, -1.5F, 11.0F, 8.0F, 5.0F, 0.0F, false);

		r7 = new ModelRenderer(this);
		r7.setRotationPoint(-1.0F, -3.5F, -8.5F);
		head.addChild(r7);
		setRotationAngle(r7, 0.0873F, 0.0F, 0.0F);
		r7.setTextureOffset(141, 7).addBox(3.9F, -2.0F, 0.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);

		r8 = new ModelRenderer(this);
		r8.setRotationPoint(-9.0F, -3.5F, -8.5F);
		head.addChild(r8);
		setRotationAngle(r8, 0.0873F, 0.0F, 0.0F);
		r8.setTextureOffset(103, 136).addBox(4.1F, -2.0F, 0.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);

		r9 = new ModelRenderer(this);
		r9.setRotationPoint(-1.0F, -4.5F, -8.5F);
		head.addChild(r9);
		setRotationAngle(r9, 0.1309F, 0.0F, 0.0F);
		r9.setTextureOffset(0, 119).addBox(-4.5F, -0.5F, 0.5F, 11.0F, 5.0F, 5.0F, 0.0F, false);

		r10 = new ModelRenderer(this);
		r10.setRotationPoint(-1.0F, -1.5F, -17.5F);
		head.addChild(r10);
		setRotationAngle(r10, -0.0122F, 0.0F, 0.0F);
		r10.setTextureOffset(0, 58).addBox(-4.5F, 2.1F, -1.1F, 11.0F, 3.0F, 14.0F, 0.0F, false);

		r11 = new ModelRenderer(this);
		r11.setRotationPoint(0.0F, -1.5F, -7.5F);
		head.addChild(r11);
		setRotationAngle(r11, -0.0035F, 0.0F, 0.0F);
		r11.setTextureOffset(89, 0).addBox(-6.0F, 1.5F, 0.0F, 12.0F, 4.0F, 8.0F, 0.0F, false);

		r12 = new ModelRenderer(this);
		r12.setRotationPoint(-1.0F, -0.5F, -17.5F);
		head.addChild(r12);
		setRotationAngle(r12, 0.0401F, 0.0F, 0.0F);
		r12.setTextureOffset(0, 75).addBox(-3.5F, -1.0F, -0.5F, 9.0F, 4.0F, 13.0F, 0.0F, false);

		r13 = new ModelRenderer(this);
		r13.setRotationPoint(-2.0F, -0.5F, -17.5F);
		head.addChild(r13);
		setRotationAngle(r13, 0.0401F, 0.0F, 0.0F);
		r13.setTextureOffset(38, 54).addBox(6.0F, -2.25F, 0.5F, 0.0F, 5.0F, 13.0F, 0.0F, false);

		r15 = new ModelRenderer(this);
		r15.setRotationPoint(-2.0F, -0.5F, -17.5F);
		head.addChild(r15);
		setRotationAngle(r15, 0.0401F, 0.0F, 0.0F);
		r15.setTextureOffset(47, 6).addBox(5.0F, -1.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		r16 = new ModelRenderer(this);
		r16.setRotationPoint(-9.0F, -0.5F, -17.5F);
		head.addChild(r16);
		setRotationAngle(r16, 0.0401F, 0.0F, 0.0F);
		r16.setTextureOffset(47, 0).addBox(5.0F, -1.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		r17 = new ModelRenderer(this);
		r17.setRotationPoint(-10.0F, -1.5F, -16.5F);
		head.addChild(r17);
		setRotationAngle(r17, 0.0401F, 0.0F, 0.0F);
		r17.setTextureOffset(10, 21).addBox(5.0F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		r18 = new ModelRenderer(this);
		r18.setRotationPoint(0.0F, -1.5F, -16.5F);
		head.addChild(r18);
		setRotationAngle(r18, 0.0401F, 0.0F, 0.0F);
		r18.setTextureOffset(10, 0).addBox(4.0F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		r19 = new ModelRenderer(this);
		r19.setRotationPoint(0.0F, -1.5F, -14.5F);
		head.addChild(r19);
		setRotationAngle(r19, 0.0401F, 0.0F, 0.0F);
		r19.setTextureOffset(26, 134).addBox(-5.0F, 1.5F, 0.5F, 10.0F, 2.0F, 1.0F, 0.0F, false);

		r20 = new ModelRenderer(this);
		r20.setRotationPoint(0.0F, -1.5F, -12.5F);
		head.addChild(r20);
		setRotationAngle(r20, 0.0401F, 0.0F, 0.0F);
		r20.setTextureOffset(103, 12).addBox(-5.0F, 1.5F, 0.5F, 10.0F, 2.0F, 1.0F, 0.0F, false);

		r21 = new ModelRenderer(this);
		r21.setRotationPoint(0.0F, -1.5F, -10.5F);
		head.addChild(r21);
		setRotationAngle(r21, 0.0401F, 0.0F, 0.0F);
		r21.setTextureOffset(33, 83).addBox(-5.0F, 1.5F, 0.5F, 10.0F, 2.0F, 1.0F, 0.0F, false);

		r14 = new ModelRenderer(this);
		r14.setRotationPoint(-10.0F, -0.5F, -17.5F);
		head.addChild(r14);
		setRotationAngle(r14, 0.0401F, 0.0F, 0.0F);
		r14.setTextureOffset(38, 49).addBox(6.0F, -2.25F, 0.5F, 0.0F, 5.0F, 13.0F, 0.0F, false);

		armleft = new ModelRenderer(this);
		armleft.setRotationPoint(7.0F, 15.0F, -11.0F);

		r27 = new ModelRenderer(this);
		r27.setRotationPoint(1.0F, 1.0F, 0.5F);
		armleft.addChild(r27);
		setRotationAngle(r27, 0.0873F, 0.0F, -0.5236F);
		r27.setTextureOffset(0, 140).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r26 = new ModelRenderer(this);
		r26.setRotationPoint(-1.0F, 5.0F, 0.0F);
		r27.addChild(r26);
		setRotationAngle(r26, -0.0873F, 0.0F, 0.3491F);
		r26.setTextureOffset(30, 140).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r28 = new ModelRenderer(this);
		r28.setRotationPoint(0.0F, 0.0F, -1.0F);
		r26.addChild(r28);
		setRotationAngle(r28, 0.0436F, 0.0F, 0.1745F);
		r28.setTextureOffset(142, 67).addBox(-2.0F, 1.0F, -2.5F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		r29 = new ModelRenderer(this);
		r29.setRotationPoint(-9.0F, 3.0F, 10.5F);
		r28.addChild(r29);
		setRotationAngle(r29, 0.0175F, 0.1745F, 0.0F);
		r29.setTextureOffset(0, 46).addBox(9.0F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r31 = new ModelRenderer(this);
		r31.setRotationPoint(-10.0F, 3.0F, 6.5F);
		r28.addChild(r31);
		setRotationAngle(r31, 0.0175F, -0.1745F, 0.0F);
		r31.setTextureOffset(44, 28).addBox(9.4F, -2.0F, -13.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r30 = new ModelRenderer(this);
		r30.setRotationPoint(-10.0F, 3.0F, 8.5F);
		r28.addChild(r30);
		setRotationAngle(r30, 0.0175F, 0.0F, 0.0F);
		r30.setTextureOffset(45, 45).addBox(9.5F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		legleft = new ModelRenderer(this);
		legleft.setRotationPoint(3.0F, 16.0F, 10.0F);

		r32 = new ModelRenderer(this);
		r32.setRotationPoint(4.0F, 0.0F, 0.5F);
		legleft.addChild(r32);
		setRotationAngle(r32, 0.0873F, -0.0436F, -0.5236F);
		r32.setTextureOffset(139, 113).addBox(-3.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r33 = new ModelRenderer(this);
		r33.setRotationPoint(-1.0F, 5.0F, 0.0F);
		r32.addChild(r33);
		setRotationAngle(r33, -0.0873F, -0.0436F, 0.3491F);
		r33.setTextureOffset(136, 79).addBox(-3.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r34 = new ModelRenderer(this);
		r34.setRotationPoint(0.0F, 0.0F, -1.0F);
		r33.addChild(r34);
		setRotationAngle(r34, 0.0436F, -0.0436F, 0.1745F);
		r34.setTextureOffset(131, 142).addBox(-3.0F, 1.0F, -2.5F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		r35 = new ModelRenderer(this);
		r35.setRotationPoint(-9.0F, 3.0F, 10.5F);
		r34.addChild(r35);
		setRotationAngle(r35, 0.0175F, 0.1745F, 0.0F);
		r35.setTextureOffset(44, 23).addBox(8.0F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r36 = new ModelRenderer(this);
		r36.setRotationPoint(-10.0F, 3.0F, 6.5F);
		r34.addChild(r36);
		setRotationAngle(r36, 0.0175F, -0.1745F, 0.0F);
		r36.setTextureOffset(5, 43).addBox(8.4F, -2.0F, -13.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r37 = new ModelRenderer(this);
		r37.setRotationPoint(-10.0F, 3.0F, 8.5F);
		r34.addChild(r37);
		setRotationAngle(r37, 0.0175F, 0.0F, 0.0F);
		r37.setTextureOffset(0, 41).addBox(8.5F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		armright = new ModelRenderer(this);
		armright.setRotationPoint(-7.0F, 15.0F, -11.0F);

		r38 = new ModelRenderer(this);
		r38.setRotationPoint(-1.0F, 1.0F, 0.5F);
		armright.addChild(r38);
		setRotationAngle(r38, 0.0873F, 0.0F, 0.5236F);
		r38.setTextureOffset(135, 56).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r39 = new ModelRenderer(this);
		r39.setRotationPoint(1.0F, 5.0F, 0.0F);
		r38.addChild(r39);
		setRotationAngle(r39, -0.0873F, 0.0F, -0.3491F);
		r39.setTextureOffset(136, 43).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r40 = new ModelRenderer(this);
		r40.setRotationPoint(0.0F, 0.0F, -1.0F);
		r39.addChild(r40);
		setRotationAngle(r40, 0.0436F, 0.0F, -0.1745F);
		r40.setTextureOffset(141, 133).addBox(-2.0F, 1.0F, -2.5F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		r41 = new ModelRenderer(this);
		r41.setRotationPoint(-9.0F, 3.0F, 10.5F);
		r40.addChild(r41);
		setRotationAngle(r41, 0.0175F, 0.1745F, 0.0F);
		r41.setTextureOffset(5, 28).addBox(9.0F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r42 = new ModelRenderer(this);
		r42.setRotationPoint(-10.0F, 3.0F, 6.5F);
		r40.addChild(r42);
		setRotationAngle(r42, 0.0175F, -0.1745F, 0.0F);
		r42.setTextureOffset(0, 26).addBox(9.4F, -2.0F, -13.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r43 = new ModelRenderer(this);
		r43.setRotationPoint(-10.0F, 3.0F, 8.5F);
		r40.addChild(r43);
		setRotationAngle(r43, 0.0175F, 0.0F, 0.0F);
		r43.setTextureOffset(5, 23).addBox(9.5F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		legright = new ModelRenderer(this);
		legright.setRotationPoint(-5.0F, 16.0F, 11.0F);

		r44 = new ModelRenderer(this);
		r44.setRotationPoint(-2.0F, 0.0F, -0.5F);
		legright.addChild(r44);
		setRotationAngle(r44, 0.0873F, 0.0436F, 0.5236F);
		r44.setTextureOffset(85, 134).addBox(-1.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r45 = new ModelRenderer(this);
		r45.setRotationPoint(1.0F, 5.0F, 0.0F);
		r44.addChild(r45);
		setRotationAngle(r45, -0.0873F, 0.0873F, -0.3491F);
		r45.setTextureOffset(87, 30).addBox(-1.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);

		r46 = new ModelRenderer(this);
		r46.setRotationPoint(0.0F, 0.0F, -1.0F);
		r45.addChild(r46);
		setRotationAngle(r46, 0.0436F, 0.0873F, -0.1745F);
		r46.setTextureOffset(141, 125).addBox(-1.0F, 1.0F, -2.5F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		r47 = new ModelRenderer(this);
		r47.setRotationPoint(-9.0F, 3.0F, 10.5F);
		r46.addChild(r47);
		setRotationAngle(r47, 0.0175F, 0.1745F, 0.0F);
		r47.setTextureOffset(0, 21).addBox(10.0F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r48 = new ModelRenderer(this);
		r48.setRotationPoint(-10.0F, 3.0F, 6.5F);
		r46.addChild(r48);
		setRotationAngle(r48, 0.0175F, -0.1745F, 0.0F);
		r48.setTextureOffset(5, 2).addBox(10.4F, -2.0F, -13.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		r49 = new ModelRenderer(this);
		r49.setRotationPoint(-10.0F, 3.0F, 8.5F);
		r46.addChild(r49);
		setRotationAngle(r49, 0.0175F, 0.0F, 0.0F);
		r49.setTextureOffset(0, 0).addBox(10.5F, -2.0F, -14.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		cuello.render(matrixStack, buffer, packedLight, packedOverlay);
		armleft.render(matrixStack, buffer, packedLight, packedOverlay);
		legleft.render(matrixStack, buffer, packedLight, packedOverlay);
		armright.render(matrixStack, buffer, packedLight, packedOverlay);
		legright.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.r3.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.r3.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tailbajo.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.legright.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.bodydown.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.legleft.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tailupper.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}