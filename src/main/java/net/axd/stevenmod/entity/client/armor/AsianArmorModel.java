package net.axd.stevenmod.entity.client.armor;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.item.custom.AsianArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AsianArmorModel extends AnimatedGeoModel<AsianArmorItem> {
    @Override
    public ResourceLocation getModelLocation(AsianArmorItem object) {
        return new ResourceLocation(Main.MOD_ID, "geo/asian_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AsianArmorItem object) {
        return new ResourceLocation(Main.MOD_ID, "textures/models/armor/asian_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AsianArmorItem animatable) {
        return new ResourceLocation(Main.MOD_ID, "animations/asian_armor_animation.json");
    }
}