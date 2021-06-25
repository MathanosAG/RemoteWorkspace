
package net.mcreator.animalexplorer.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.server.ServerBossInfo;
import net.minecraft.world.World;
import net.minecraft.world.BossInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.HoglinEntity;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ElderGuardianEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.block.Blocks;

import net.mcreator.animalexplorer.itemgroup.AnimalExploItemGroup;
import net.mcreator.animalexplorer.entity.renderer.DragonMonderRenderer;
import net.mcreator.animalexplorer.AnimalexplorerModElements;

@AnimalexplorerModElements.ModElement.Tag
public class DragonMonderEntity extends AnimalexplorerModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(2.8f, 3f))
					.build("dragon_monder").setRegistryName("dragon_monder");
	public DragonMonderEntity(AnimalexplorerModElements instance) {
		super(instance, 55);
		FMLJavaModLoadingContext.get().getModEventBus().register(new DragonMonderRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -13434829, new Item.Properties().group(AnimalExploItemGroup.tab))
				.setRegistryName("dragon_monder_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 200);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 20);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.1);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 0.2);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 10;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.goalSelector.addGoal(6, new BreakBlockGoal(Blocks.OAK_LEAVES.getDefaultState().getBlock(), this, 1, (int) 3));
			this.goalSelector.addGoal(7, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, AgeableEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MonsterEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, AnimalEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, SheepEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, PolarBearEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, ServerPlayerEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, PandaEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, LlamaEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, HoglinEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, GuardianEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, GolemEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, EvokerEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, EnderCrystalEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, EndermanEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, ElderGuardianEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, EnderDragonEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, BlazeEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, CowEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, WoodGolemEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, MonsterWarpedRatEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, RhinoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, MonsterCrimsonCrabEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, LionEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, HippopotamusEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, SharkEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, BullEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, CrocolideEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, ElephantEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, UnicornEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, TigerEntity.CustomEntity.class, true, false));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.ARTHROPOD;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public boolean isNonBoss() {
			return false;
		}
		private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS);
		@Override
		public void addTrackingPlayer(ServerPlayerEntity player) {
			super.addTrackingPlayer(player);
			this.bossInfo.addPlayer(player);
		}

		@Override
		public void removeTrackingPlayer(ServerPlayerEntity player) {
			super.removeTrackingPlayer(player);
			this.bossInfo.removePlayer(player);
		}

		@Override
		public void updateAITasks() {
			super.updateAITasks();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		}
	}
}
