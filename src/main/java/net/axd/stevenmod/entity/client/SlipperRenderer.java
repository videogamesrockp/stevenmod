package net.axd.stevenmod.entity.client;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.projectile.SlipperProjectile;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SlipperRenderer extends ArrowRenderer<SlipperProjectile> {
    public SlipperRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SlipperProjectile pEntity) {
        return new ResourceLocation(Main.MOD_ID, "textures/entity/projectiles/slipper.png");
    }
}
