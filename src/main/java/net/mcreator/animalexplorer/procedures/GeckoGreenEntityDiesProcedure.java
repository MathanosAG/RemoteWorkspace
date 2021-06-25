package net.mcreator.animalexplorer.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.animalexplorer.particle.DeadAnimalCuteParticle;
import net.mcreator.animalexplorer.AnimalexplorerMod;

import java.util.Map;

public class GeckoGreenEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency x for procedure GeckoGreenEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency y for procedure GeckoGreenEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency z for procedure GeckoGreenEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency world for procedure GeckoGreenEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(DeadAnimalCuteParticle.particle, x, y, z, 0, 1, 0);
	}
}
