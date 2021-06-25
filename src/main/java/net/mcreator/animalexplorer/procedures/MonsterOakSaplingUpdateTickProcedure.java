package net.mcreator.animalexplorer.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;

import net.mcreator.animalexplorer.AnimalexplorerMod;

import java.util.Map;

public class MonsterOakSaplingUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency x for procedure MonsterOakSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency y for procedure MonsterOakSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency z for procedure MonsterOakSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AnimalexplorerMod.LOGGER.warn("Failed to load dependency world for procedure MonsterOakSaplingUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if ((Math.random() < 0.05)) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("animalexplorer", "treemonster1"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if ((Math.random() < 0.05)) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("animalexplorer", "treemonster3"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
	}
}
