package net.mcreator.animalexplorer.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.animalexplorer.item.WormItem;
import net.mcreator.animalexplorer.AnimalexplorerMod;

import java.util.Map;

public class AppleWithWoormFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency entity for procedure AppleWithWoormFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 15, (int) 0, (false), (true)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 10, (int) 0, (false), (true)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 2, (int) 0, (false), (true)));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(WormItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
