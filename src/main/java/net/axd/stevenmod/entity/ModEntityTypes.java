package net.axd.stevenmod.entity;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.custom.AsianDadEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MOD_ID);

    public static final RegistryObject<EntityType<AsianDadEntity>> ASIAN_DAD =
            ENTITY_TYPES.register("asian_dad",
                    () -> EntityType.Builder.of(AsianDadEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(Main.MOD_ID, "asian_dad").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
