package net.axd.stevenmod.item;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.ModEntityTypes;
import net.axd.stevenmod.item.custom.AsianArmorItem;
import net.axd.stevenmod.item.custom.SlipperItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> ASIAN_DAD_SPAWN_EGG = ITEMS.register("asian_dad_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ASIAN_DAD,0xfffff, 0xff0000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> REPORT_CARD = ITEMS.register("report_card",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SLIPPER = ITEMS.register("slipper",
            () -> new SlipperItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1000)));

    public static final RegistryObject<Item> ASIAN_HAT = ITEMS.register("asian_hat",
            () -> new AsianArmorItem(ModArmorMaterials.REPORT_CARD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1000)));
    public static final RegistryObject<Item> ASIAN_COAT = ITEMS.register("asian_coat",
            () -> new AsianArmorItem(ModArmorMaterials.REPORT_CARD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1000)));
    public static final RegistryObject<Item> ASIAN_PANTS = ITEMS.register("asian_pants",
            () -> new AsianArmorItem(ModArmorMaterials.REPORT_CARD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1000)));
    public static final RegistryObject<Item> ASIAN_SLIPPERS = ITEMS.register("asian_slippers",
            () -> new AsianArmorItem(ModArmorMaterials.REPORT_CARD, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1000)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
