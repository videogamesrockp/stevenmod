package net.axd.stevenmod.entity.client;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.custom.AsianDadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AsianDadModel extends AnimatedGeoModel<AsianDadEntity> {
    @Override
    public ResourceLocation getModelLocation(AsianDadEntity object) {
        return new ResourceLocation(Main.MOD_ID, "geo/asian_dad.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AsianDadEntity object) {
        return new ResourceLocation(Main.MOD_ID, "textures/entity/asian_dad/asian_dad.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AsianDadEntity animatable) {
        return new ResourceLocation(Main.MOD_ID, "animations/asian_dad.animation.json");
    }
}
