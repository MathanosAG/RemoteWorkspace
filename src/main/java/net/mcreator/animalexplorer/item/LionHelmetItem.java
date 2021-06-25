
package net.mcreator.animalexplorer.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.animalexplorer.itemgroup.AnimalExploItemGroup;
import net.mcreator.animalexplorer.AnimalexplorerModElements;

@AnimalexplorerModElements.ModElement.Tag
public class LionHelmetItem extends AnimalexplorerModElements.ModElement {
	@ObjectHolder("animalexplorer:lion_helmet_helmet")
	public static final Item helmet = null;
	@ObjectHolder("animalexplorer:lion_helmet_chestplate")
	public static final Item body = null;
	@ObjectHolder("animalexplorer:lion_helmet_leggings")
	public static final Item legs = null;
	@ObjectHolder("animalexplorer:lion_helmet_boots")
	public static final Item boots = null;
	public LionHelmetItem(AnimalexplorerModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{7, 10, 12, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 15;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "lion_helmet";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(AnimalExploItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "animalexplorer:textures/models/armor/animal__2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("lion_helmet_helmet"));
	}
}
