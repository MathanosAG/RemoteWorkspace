// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelDragonMonder extends EntityModel<Entity> {
	private final ModelRenderer DragonMonder;
	private final ModelRenderer body;
	private final ModelRenderer bodyrnorth;
	private final ModelRenderer cube_r1;
	private final ModelRenderer r1;
	private final ModelRenderer bodysourth;
	private final ModelRenderer r2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer r3;
	private final ModelRenderer tial2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer r4;
	private final ModelRenderer tail;
	private final ModelRenderer tail3;
	private final ModelRenderer r5;
	private final ModelRenderer r6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer r7;
	private final ModelRenderer r8;
	private final ModelRenderer r9;
	private final ModelRenderer armsright;
	private final ModelRenderer hombroright;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bicep;
	private final ModelRenderer cube_r7;
	private final ModelRenderer brazoinferior;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer manoderecho;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer armsleft;
	private final ModelRenderer hombroleft;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bicep2;
	private final ModelRenderer cube_r15;
	private final ModelRenderer brazoinferior2;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer manoderecho2;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cuello;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cabeza;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;

	public ModelDragonMonder() {
		textureWidth = 256;
		textureHeight = 256;

		DragonMonder = new ModelRenderer(this);
		DragonMonder.setRotationPoint(0.0F, 24.0F, 2.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -26.0F, -28.0F);
		DragonMonder.addChild(body);

		bodyrnorth = new ModelRenderer(this);
		bodyrnorth.setRotationPoint(0.0F, 0.0F, 3.0F);
		body.addChild(bodyrnorth);
		bodyrnorth.setTextureOffset(0, 0).addBox(-9.5F, -10.0F, -4.0F, 19.0F, 17.0F, 14.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 26.0F, 25.0F);
		bodyrnorth.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(161, 89).addBox(-2.0F, -40.0F, -13.0F, 3.0F, 7.0F, 12.0F, 0.0F, false);

		r1 = new ModelRenderer(this);
		r1.setRotationPoint(0.0F, 0.0F, 9.0F);
		bodyrnorth.addChild(r1);
		setRotationAngle(r1, -0.1309F, 0.0F, 0.0F);
		r1.setTextureOffset(0, 66).addBox(-9.0F, -9.5F, -1.0F, 18.0F, 16.0F, 13.0F, 0.0F, false);

		bodysourth = new ModelRenderer(this);
		bodysourth.setRotationPoint(0.0F, 1.0F, 8.0F);
		r1.addChild(bodysourth);
		setRotationAngle(bodysourth, 0.1309F, 0.0F, 0.0F);

		r2 = new ModelRenderer(this);
		r2.setRotationPoint(-1.5F, -0.7564F, 1.8501F);
		bodysourth.addChild(r2);
		setRotationAngle(r2, -0.3491F, 0.0F, 0.0F);
		r2.setTextureOffset(49, 49).addBox(-7.5F, -8.5F, -1.0F, 17.0F, 15.0F, 15.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 25.0F, 5.0F);
		r2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(53, 158).addBox(-2.0F, -33.0F, 7.0F, 3.0F, 8.0F, 12.0F, 0.0F, false);

		r3 = new ModelRenderer(this);
		r3.setRotationPoint(1.0F, -1.0F, 13.0F);
		r2.addChild(r3);
		setRotationAngle(r3, -0.1745F, 0.0F, 0.0F);
		r3.setTextureOffset(0, 31).addBox(-7.5F, -6.5F, -1.0F, 15.0F, 13.0F, 17.0F, 0.0F, false);

		tial2 = new ModelRenderer(this);
		tial2.setRotationPoint(0.0F, 2.0F, 15.0F);
		r3.addChild(tial2);
		setRotationAngle(tial2, 0.1309F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 7.4345F, -20.1427F);
		tial2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(160, 131).addBox(-2.0F, -13.0F, 16.0F, 3.0F, 7.0F, 12.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 7.4345F, -20.1427F);
		tial2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(160, 112).addBox(-2.0F, 0.0F, 31.0F, 3.0F, 7.0F, 12.0F, 0.0F, false);

		r4 = new ModelRenderer(this);
		r4.setRotationPoint(-1.0F, -2.5655F, -1.1427F);
		tial2.addChild(r4);
		setRotationAngle(r4, -0.0436F, 0.0F, 0.0F);
		r4.setTextureOffset(48, 13).addBox(-5.5F, -4.5F, -1.0F, 13.0F, 11.0F, 18.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -1.0F, 15.0F);
		tial2.addChild(tail);
		setRotationAngle(tail, 0.3927F, 0.0F, 0.0F);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.4078F, 0.9134F);
		tail.addChild(tail3);
		setRotationAngle(tail3, -0.0436F, 0.0F, 0.0F);

		r5 = new ModelRenderer(this);
		r5.setRotationPoint(-2.0F, -2.5217F, -1.7495F);
		tail3.addChild(r5);
		setRotationAngle(r5, -0.0873F, 0.0F, 0.0F);
		r5.setTextureOffset(46, 79).addBox(-3.5F, -2.5F, -1.0F, 11.0F, 9.0F, 16.0F, 0.0F, false);

		r6 = new ModelRenderer(this);
		r6.setRotationPoint(-1.0F, 4.0F, 14.0F);
		r5.addChild(r6);
		setRotationAngle(r6, 0.0873F, 0.0F, 0.0F);
		r6.setTextureOffset(92, 0).addBox(-1.5F, -5.0987F, -6.7119F, 9.0F, 7.0F, 16.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.0F, 4.4013F, -45.7119F);
		r6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(171, 22).addBox(-1.5F, 3.0F, 49.0F, 2.0F, 5.0F, 12.0F, 0.0F, false);

		r7 = new ModelRenderer(this);
		r7.setRotationPoint(-1.0F, -1.5987F, 8.2881F);
		r6.addChild(r7);
		setRotationAngle(r7, 0.0873F, 0.0F, 0.0F);
		r7.setTextureOffset(110, 23).addBox(0.5F, -2.4886F, -3.7385F, 7.0F, 5.0F, 14.0F, 0.0F, false);

		r8 = new ModelRenderer(this);
		r8.setRotationPoint(-1.0F, 1.0114F, 9.2615F);
		r7.addChild(r8);
		setRotationAngle(r8, 0.1745F, 0.0F, 0.0F);
		r8.setTextureOffset(52, 0).addBox(2.5F, -2.4392F, -1.3054F, 5.0F, 3.0F, 10.0F, 0.0F, false);

		r9 = new ModelRenderer(this);
		r9.setRotationPoint(-1.0F, -0.9392F, 7.6946F);
		r8.addChild(r9);
		setRotationAngle(r9, 0.2618F, 0.0F, 0.0F);
		r9.setTextureOffset(0, 114).addBox(4.5F, -1.3637F, -0.9647F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		armsright = new ModelRenderer(this);
		armsright.setRotationPoint(-9.0F, -29.0F, -23.0F);
		DragonMonder.addChild(armsright);

		hombroright = new ModelRenderer(this);
		hombroright.setRotationPoint(0.0F, 1.0F, 0.0F);
		armsright.addChild(hombroright);
		setRotationAngle(hombroright, 0.0436F, 0.0F, 0.0873F);
		hombroright.setTextureOffset(136, 101).addBox(-7.4991F, -7.7005F, -5.2564F, 7.0F, 12.0F, 11.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(9.5009F, 29.2995F, 22.7436F);
		hombroright.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0873F);
		cube_r6.setTextureOffset(178, 108).addBox(-20.0F, -44.0F, -25.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);
		cube_r6.setTextureOffset(159, 52).addBox(-20.0F, -38.0F, -27.0F, 4.0F, 15.0F, 9.0F, 0.0F, false);

		bicep = new ModelRenderer(this);
		bicep.setRotationPoint(-4.0F, 5.0F, -1.0F);
		hombroright.addChild(bicep);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.0F, 23.0F, 24.0F);
		bicep.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0436F, 0.0F, 0.0873F);
		cube_r7.setTextureOffset(146, 32).addBox(-19.0F, -23.0F, -29.0F, 7.0F, 9.0F, 11.0F, 0.0F, false);

		brazoinferior = new ModelRenderer(this);
		brazoinferior.setRotationPoint(0.0F, 7.0F, -3.0F);
		bicep.addChild(brazoinferior);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(12.0F, 16.0F, 27.0F);
		brazoinferior.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, -0.3054F);
		cube_r8.setTextureOffset(159, 76).addBox(-13.2F, -28.5F, -27.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(13.0F, 16.0F, 27.0F);
		brazoinferior.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, -0.3054F);
		cube_r9.setTextureOffset(42, 178).addBox(-14.0F, -23.5F, -28.0F, 3.0F, 13.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(13.0F, 16.0F, 27.0F);
		brazoinferior.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, -0.0436F);
		cube_r10.setTextureOffset(46, 128).addBox(-17.0F, -16.5F, -29.5F, 7.0F, 16.0F, 10.0F, 0.0F, false);

		manoderecho = new ModelRenderer(this);
		manoderecho.setRotationPoint(-1.0F, 12.0F, 4.0F);
		brazoinferior.addChild(manoderecho);
		manoderecho.setTextureOffset(84, 79).addBox(-4.0F, 0.0F, -12.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(14.0F, 4.0F, 23.0F);
		manoderecho.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(150, 125).addBox(-11.0F, -7.0F, -39.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r11.setTextureOffset(44, 154).addBox(-14.5F, -7.0F, -39.5F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r11.setTextureOffset(178, 131).addBox(-18.0F, -7.0F, -39.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(14.0F, 4.0F, 23.0F);
		manoderecho.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(138, 16).addBox(-18.0F, -9.0F, -30.0F, 9.0F, 4.0F, 12.0F, 0.0F, false);

		armsleft = new ModelRenderer(this);
		armsleft.setRotationPoint(9.0F, -31.0F, -23.0F);
		DragonMonder.addChild(armsleft);

		hombroleft = new ModelRenderer(this);
		hombroleft.setRotationPoint(0.0F, 4.0F, 1.0F);
		armsleft.addChild(hombroleft);
		setRotationAngle(hombroleft, 0.0F, 0.0F, -0.0873F);
		hombroleft.setTextureOffset(80, 129).addBox(0.745F, -9.3741F, -6.1843F, 7.0F, 12.0F, 11.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(17.745F, 27.6259F, 21.8157F);
		hombroleft.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.0873F);
		cube_r13.setTextureOffset(60, 178).addBox(-11.0F, -45.0F, -25.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(17.745F, -5.3741F, 10.8157F);
		hombroleft.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.0873F);
		cube_r14.setTextureOffset(27, 154).addBox(-13.8761F, -7.1256F, -16.0F, 4.0F, 15.0F, 9.0F, 0.0F, false);

		bicep2 = new ModelRenderer(this);
		bicep2.setRotationPoint(4.0F, 3.0F, -2.0F);
		hombroleft.addChild(bicep2);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-14.0F, 24.0F, 23.0F);
		bicep2.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0436F, 0.0F, -0.0873F);
		cube_r15.setTextureOffset(0, 143).addBox(13.0F, -24.0F, -28.0F, 7.0F, 9.0F, 11.0F, 0.0F, false);

		brazoinferior2 = new ModelRenderer(this);
		brazoinferior2.setRotationPoint(0.0F, 6.0F, 1.0F);
		bicep2.addChild(brazoinferior2);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-14.0F, 18.0F, 23.0F);
		brazoinferior2.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0873F, 0.0F, 0.3054F);
		cube_r16.setTextureOffset(0, 31).addBox(13.2F, -28.5F, -27.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r16.setTextureOffset(24, 178).addBox(12.0F, -24.5F, -28.0F, 3.0F, 13.0F, 6.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-14.0F, 18.0F, 23.0F);
		brazoinferior2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0873F, 0.0F, 0.0436F);
		cube_r17.setTextureOffset(126, 126).addBox(11.0F, -16.5F, -29.5F, 7.0F, 16.0F, 10.0F, 0.0F, false);

		manoderecho2 = new ModelRenderer(this);
		manoderecho2.setRotationPoint(0.0F, 14.0F, -1.0F);
		brazoinferior2.addChild(manoderecho2);
		manoderecho2.setTextureOffset(72, 0).addBox(-4.0F, 0.0F, -11.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(14.0F, 4.0F, 24.0F);
		manoderecho2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(20, 114).addBox(-11.0F, -7.0F, -39.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r18.setTextureOffset(70, 128).addBox(-14.5F, -7.0F, -39.5F, 2.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r18.setTextureOffset(146, 52).addBox(-18.0F, -7.0F, -39.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(14.0F, 4.0F, 24.0F);
		manoderecho2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(126, 0).addBox(-18.0F, -9.0F, -30.0F, 9.0F, 4.0F, 12.0F, 0.0F, false);

		cuello = new ModelRenderer(this);
		cuello.setRotationPoint(0.0F, -27.0F, -25.0F);
		DragonMonder.addChild(cuello);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 27.0F, 25.0F);
		cuello.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.4363F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(126, 83).addBox(-6.0F, -14.0F, -65.0F, 12.0F, 9.0F, 9.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 27.0F, 25.0F);
		cuello.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(90, 109).addBox(-7.0F, -20.0F, -57.0F, 14.0F, 11.0F, 9.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 27.0F, 25.0F);
		cuello.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(98, 42).addBox(-8.0F, -25.0F, -48.0F, 16.0F, 13.0F, 8.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 27.0F, 25.0F);
		cuello.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
		cube_r23.setTextureOffset(113, 63).addBox(-8.5F, -29.0F, -39.0F, 17.0F, 14.0F, 6.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 27.0F, 25.0F);
		cuello.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
		cube_r24.setTextureOffset(0, 123).addBox(-9.0F, -33.0F, -33.0F, 18.0F, 15.0F, 5.0F, 0.0F, false);

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, -7.0F, -24.0F);
		cuello.addChild(cabeza);
		cabeza.setTextureOffset(113, 152).addBox(-7.5F, -10.0F, -10.5F, 15.0F, 15.0F, 3.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0873F, -0.1745F, 0.0F);
		cube_r25.setTextureOffset(0, 151).addBox(-17.0F, -45.0F, -52.0F, 0.0F, 11.0F, 12.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0436F, 0.1745F, 0.0F);
		cube_r26.setTextureOffset(83, 158).addBox(17.0F, -42.0F, -53.0F, 0.0F, 11.0F, 12.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(0, 0).addBox(5.5F, -40.8F, -74.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r27.setTextureOffset(0, 4).addBox(-6.5F, -40.8F, -74.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r27.setTextureOffset(168, 0).addBox(-6.5F, -49.0F, -65.5F, 4.0F, 14.0F, 8.0F, 0.0F, false);
		cube_r27.setTextureOffset(107, 170).addBox(2.5F, -49.0F, -65.5F, 4.0F, 14.0F, 8.0F, 0.0F, false);
		cube_r27.setTextureOffset(44, 106).addBox(-7.5F, -48.0F, -65.5F, 15.0F, 14.0F, 8.0F, 0.0F, false);
		cube_r27.setTextureOffset(77, 152).addBox(-7.5F, -49.0F, -58.5F, 15.0F, 15.0F, 3.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.1745F, 0.0F, 0.0F);
		cube_r28.setTextureOffset(0, 47).addBox(-5.0F, -51.6F, -72.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r28.setTextureOffset(28, 47).addBox(5.0F, -51.4F, -72.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
		cube_r29.setTextureOffset(0, 95).addBox(-6.0F, -47.0F, -73.5F, 12.0F, 5.0F, 14.0F, 0.0F, false);
		cube_r29.setTextureOffset(85, 89).addBox(-6.5F, -42.0F, -74.0F, 13.0F, 5.0F, 15.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.3491F, 0.0F, -0.2618F);
		cube_r30.setTextureOffset(163, 170).addBox(2.5F, -61.0F, -50.5F, 4.0F, 13.0F, 8.0F, 0.0F, false);
		cube_r30.setTextureOffset(176, 43).addBox(4.5F, -62.0F, -40.5F, 4.0F, 8.0F, 9.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.3927F, 0.0F, -0.2618F);
		cube_r31.setTextureOffset(105, 129).addBox(4.8F, -64.0F, -26.5F, 3.0F, 4.0F, 7.0F, 0.0F, false);
		cube_r31.setTextureOffset(179, 163).addBox(4.8F, -64.0F, -31.5F, 3.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.3927F, 0.0F, 0.2618F);
		cube_r32.setTextureOffset(25, 143).addBox(-6.2F, -64.0F, -26.5F, 3.0F, 4.0F, 7.0F, 0.0F, false);
		cube_r32.setTextureOffset(179, 84).addBox(-6.2F, -64.0F, -31.5F, 3.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.3491F, 0.0F, 0.2618F);
		cube_r33.setTextureOffset(176, 67).addBox(-7.5F, -62.0F, -40.5F, 4.0F, 8.0F, 9.0F, 0.0F, false);
		cube_r33.setTextureOffset(0, 174).addBox(-6.5F, -61.0F, -50.5F, 4.0F, 13.0F, 8.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.0873F, 0.0F, 0.0F);
		cube_r34.setTextureOffset(149, 152).addBox(-7.0F, -39.0F, -60.5F, 14.0F, 15.0F, 3.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 34.0F, 49.0F);
		cabeza.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
		cube_r35.setTextureOffset(131, 170).addBox(-7.0F, -31.0F, -61.0F, 14.0F, 12.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		DragonMonder.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.r2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.r3.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.r6.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.r8.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.manoderecho2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.armsright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.bicep.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.manoderecho.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.tial2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.armsleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.cuello.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cuello.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.bicep2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.cabeza.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cabeza.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}