
package net.mcreator.animalexplorer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.animalexplorer.itemgroup.AnimalExploItemGroup;
import net.mcreator.animalexplorer.AnimalexplorerModElements;

@AnimalexplorerModElements.ModElement.Tag
public class CrabclawItem extends AnimalexplorerModElements.ModElement {
	@ObjectHolder("animalexplorer:crabclaw")
	public static final Item block = null;
	public CrabclawItem(AnimalexplorerModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(AnimalExploItemGroup.tab)) {
		}.setRegistryName("crabclaw"));
	}
}
