package net.axd.stevenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.custom.AsianDadEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AsianDadRenderer extends GeoEntityRenderer<AsianDadEntity> {

    public AsianDadRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AsianDadModel());
        this.shadowRadius = 1.0f;
    }
    @Override
    public ResourceLocation getTextureLocation(AsianDadEntity instance) {
        return new ResourceLocation(Main.MOD_ID, "textures/entity/asian_dad/asian_dad.png");
    }

    @Override
    public RenderType getRenderType(AsianDadEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
