package net.axd.stevenmod.entity.client.armor;

import net.axd.stevenmod.entity.client.armor.AsianArmorModel;
import net.axd.stevenmod.item.custom.AsianArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AsianArmorRenderer extends GeoArmorRenderer<AsianArmorItem> {
    public AsianArmorRenderer() {
        super(new AsianArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
