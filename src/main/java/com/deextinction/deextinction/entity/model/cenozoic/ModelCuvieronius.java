package com.deextinction.deextinction.entity.model.cenozoic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Cuvieronius - Diictodom
 * Created using Tabula 7.0.0
 */
public class ModelCuvieronius extends ModelBase {
    public ModelRenderer body1;
    public ModelRenderer frightjoint;
    public ModelRenderer rrightjoint;
    public ModelRenderer rleftjoint;
    public ModelRenderer fleftjoint;
    public ModelRenderer Shoulder;
    public ModelRenderer butt;
    public ModelRenderer chest;
    public ModelRenderer hump1;
    public ModelRenderer neck;
    public ModelRenderer hump2;
    public ModelRenderer chest2;
    public ModelRenderer neckjoint;
    public ModelRenderer Head;
    public ModelRenderer rightear;
    public ModelRenderer leftear;
    public ModelRenderer head2;
    public ModelRenderer uppjaw;
    public ModelRenderer trunk1;
    public ModelRenderer rtusk1;
    public ModelRenderer ltusk1;
    public ModelRenderer hump3;
    public ModelRenderer mouth1;
    public ModelRenderer mouth2;
    public ModelRenderer mouth3;
    public ModelRenderer trunk2;
    public ModelRenderer trunk3;
    public ModelRenderer trunk4;
    public ModelRenderer untrunk;
    public ModelRenderer trunk5;
    public ModelRenderer rtusk2;
    public ModelRenderer rtusk3;
    public ModelRenderer ltusk2;
    public ModelRenderer ltusk3;
    public ModelRenderer butt2;
    public ModelRenderer butt4;
    public ModelRenderer butt6;
    public ModelRenderer butt3;
    public ModelRenderer butt5;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer rfleg1;
    public ModelRenderer rfleg2;
    public ModelRenderer rfleg3;
    public ModelRenderer rffeet;
    public ModelRenderer rrleg1;
    public ModelRenderer rrleg2;
    public ModelRenderer rrleg3;
    public ModelRenderer rrfeet;
    public ModelRenderer rlleg1;
    public ModelRenderer rlleg2;
    public ModelRenderer rlleg3;
    public ModelRenderer rlfeet;
    public ModelRenderer rfleg1_1;
    public ModelRenderer rfleg2_1;
    public ModelRenderer rfleg3_1;
    public ModelRenderer rffeet_1;

    public ModelCuvieronius() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.body1 = new ModelRenderer(this, 0, 141);
        this.body1.setRotationPoint(0.0F, -13.8F, 0.0F);
        this.body1.addBox(-11.0F, -14.5F, -14.5F, 22, 32, 23, 0.0F);
        this.setRotateAngle(body1, -0.045553093477052F, 3.141592653589793F, 0.0F);
        this.untrunk = new ModelRenderer(this, 163, 15);
        this.untrunk.setRotationPoint(0.0F, 2.2F, 0.3F);
        this.untrunk.addBox(-2.0F, -3.5F, 0.0F, 4, 5, 12, 0.0F);
        this.setRotateAngle(untrunk, 0.18203784098300857F, 0.0F, 0.0F);
        this.rfleg2_1 = new ModelRenderer(this, 105, 66);
        this.rfleg2_1.setRotationPoint(4.5F, 11.0F, 0.0F);
        this.rfleg2_1.addBox(-4.0F, 0.0F, -4.5F, 8, 14, 9, 0.0F);
        this.setRotateAngle(rfleg2_1, -0.15236724369910498F, 0.0F, 0.0F);
        this.fleftjoint = new ModelRenderer(this, 0, 0);
        this.fleftjoint.setRotationPoint(4.4F, -12.8F, -18.4F);
        this.fleftjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.tail3 = new ModelRenderer(this, 58, 68);
        this.tail3.setRotationPoint(0.0F, 11.2F, -0.2F);
        this.tail3.addBox(-0.5F, 0.1F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(tail3, 0.27314402793711257F, 0.0F, 0.0F);
        this.hump1 = new ModelRenderer(this, 0, 161);
        this.hump1.setRotationPoint(0.0F, -9.7F, 8.9F);
        this.hump1.addBox(-7.0F, -5.0F, 0.0F, 14, 5, 9, 0.0F);
        this.setRotateAngle(hump1, 0.27314402793711257F, 0.0F, 0.0F);
        this.rtusk2 = new ModelRenderer(this, 0, 44);
        this.rtusk2.setRotationPoint(-0.2F, 0.0F, 10.0F);
        this.rtusk2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 14, 0.0F);
        this.setRotateAngle(rtusk2, -0.18203784098300857F, 0.091106186954104F, 0.0F);
        this.rfleg3 = new ModelRenderer(this, 105, 44);
        this.rfleg3.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.rfleg3.addBox(-3.5F, 0.0F, -3.5F, 7, 13, 7, 0.0F);
        this.rffeet = new ModelRenderer(this, 101, 25);
        this.rffeet.setRotationPoint(0.0F, 10.2F, 1.5F);
        this.rffeet.addBox(-4.0F, 0.0F, -6.5F, 8, 7, 9, 0.0F);
        this.setRotateAngle(rffeet, 0.040317105721069016F, 0.0F, 0.0F);
        this.frightjoint = new ModelRenderer(this, 0, 0);
        this.frightjoint.setRotationPoint(-4.4F, -12.8F, -18.4F);
        this.frightjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.rrightjoint = new ModelRenderer(this, 0, 0);
        this.rrightjoint.setRotationPoint(-7.9F, -18.3F, 20.1F);
        this.rrightjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.leftear = new ModelRenderer(this, 0, 83);
        this.leftear.mirror = true;
        this.leftear.setRotationPoint(-6.8F, -7.8F, 8.6F);
        this.leftear.addBox(-2.0F, 0.0F, -8.0F, 2, 13, 8, 0.0F);
        this.setRotateAngle(leftear, -0.22759093446006054F, 0.4553564018453205F, 0.0F);
        this.butt2 = new ModelRenderer(this, 0, 165);
        this.butt2.setRotationPoint(0.0F, -10.4F, -12.6F);
        this.butt2.addBox(-9.5F, -5.0F, 0.0F, 19, 5, 9, 0.0F);
        this.setRotateAngle(butt2, 0.136659280431156F, 0.0F, 0.0F);
        this.uppjaw = new ModelRenderer(this, 135, 104);
        this.uppjaw.setRotationPoint(0.0F, 11.8F, 3.2F);
        this.uppjaw.addBox(-7.0F, -2.5F, 0.0F, 14, 5, 17, 0.0F);
        this.setRotateAngle(uppjaw, 0.4553564018453205F, 0.0F, 0.0F);
        this.rrleg1 = new ModelRenderer(this, 51, 103);
        this.rrleg1.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.rrleg1.addBox(-9.0F, -4.6F, -5.5F, 9, 21, 13, 0.0F);
        this.setRotateAngle(rrleg1, -0.091106186954104F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 44, 82);
        this.tail1.setRotationPoint(0.0F, -11.7F, -18.7F);
        this.tail1.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(tail1, -0.31869712141416456F, 0.0F, 0.0F);
        this.rfleg1 = new ModelRenderer(this, 102, 90);
        this.rfleg1.mirror = true;
        this.rfleg1.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.rfleg1.addBox(-9.0F, -4.6F, -5.5F, 9, 18, 11, 0.0F);
        this.setRotateAngle(rfleg1, 0.136659280431156F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 169);
        this.chest.setRotationPoint(0.0F, 13.6F, 4.6F);
        this.chest.addBox(-9.5F, -4.8F, -0.1F, 19, 9, 15, 0.0F);
        this.setRotateAngle(chest, 0.31869712141416456F, 0.0F, 0.0F);
        this.trunk4 = new ModelRenderer(this, 133, 36);
        this.trunk4.setRotationPoint(0.0F, -0.1F, 11.2F);
        this.trunk4.addBox(-2.0F, -3.5F, 0.0F, 4, 5, 9, 0.0F);
        this.setRotateAngle(trunk4, 0.091106186954104F, 0.0F, 0.0F);
        this.trunk5 = new ModelRenderer(this, 137, 23);
        this.trunk5.setRotationPoint(0.0F, -0.7F, 7.6F);
        this.trunk5.addBox(-2.0F, -3.0F, 0.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(trunk5, -0.4553564018453205F, 0.0F, 0.0F);
        this.Shoulder = new ModelRenderer(this, 0, 146);
        this.Shoulder.setRotationPoint(0.0F, -0.3F, 2.1F);
        this.Shoulder.addBox(-10.0F, -14.5F, 0.0F, 20, 27, 20, 0.0F);
        this.setRotateAngle(Shoulder, -0.091106186954104F, 0.0F, 0.0F);
        this.butt5 = new ModelRenderer(this, 0, 167);
        this.butt5.setRotationPoint(0.0F, -0.3F, -1.2F);
        this.butt5.addBox(-9.0F, -5.0F, -7.5F, 18, 7, 10, 0.0F);
        this.setRotateAngle(butt5, -0.6829473363053812F, 0.0F, 0.0F);
        this.rrleg3 = new ModelRenderer(this, 69, 51);
        this.rrleg3.setRotationPoint(0.0F, 13.2F, 0.4F);
        this.rrleg3.addBox(-3.5F, 0.0F, -4.0F, 7, 13, 8, 0.0F);
        this.trunk3 = new ModelRenderer(this, 162, 33);
        this.trunk3.setRotationPoint(0.0F, -0.1F, 8.8F);
        this.trunk3.addBox(-2.5F, -3.5F, 0.0F, 5, 5, 12, 0.0F);
        this.setRotateAngle(trunk3, 0.091106186954104F, 0.0F, 0.0F);
        this.chest2 = new ModelRenderer(this, 0, 168);
        this.chest2.setRotationPoint(0.0F, 15.9F, 3.9F);
        this.chest2.addBox(-8.0F, -4.5F, -0.1F, 16, 9, 12, 0.0F);
        this.setRotateAngle(chest2, 0.7740535232594852F, 0.0F, 0.0F);
        this.ltusk1 = new ModelRenderer(this, 0, 63);
        this.ltusk1.mirror = true;
        this.ltusk1.setRotationPoint(-5.0F, 3.0F, 15.8F);
        this.ltusk1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotateAngle(ltusk1, -0.31869712141416456F, -0.22759093446006054F, 0.0F);
        this.rrleg2 = new ModelRenderer(this, 61, 73);
        this.rrleg2.setRotationPoint(-4.5F, 12.4F, 0.2F);
        this.rrleg2.addBox(-4.0F, 0.0F, -4.5F, 8, 18, 10, 0.0F);
        this.setRotateAngle(rrleg2, 0.27314402793711257F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 129, 129);
        this.head2.setRotationPoint(0.0F, -8.4F, 4.2F);
        this.head2.addBox(-7.5F, -5.0F, 0.0F, 15, 11, 18, 0.0F);
        this.setRotateAngle(head2, -0.40980330836826856F, 0.0F, 0.0F);
        this.rleftjoint = new ModelRenderer(this, 0, 0);
        this.rleftjoint.setRotationPoint(7.9F, -18.3F, 20.1F);
        this.rleftjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.rlleg2 = new ModelRenderer(this, 61, 73);
        this.rlleg2.setRotationPoint(4.5F, 12.4F, 0.2F);
        this.rlleg2.addBox(-4.0F, 0.0F, -4.5F, 8, 18, 10, 0.0F);
        this.setRotateAngle(rlleg2, 0.27314402793711257F, 0.0F, 0.0F);
        this.mouth3 = new ModelRenderer(this, 0, 0);
        this.mouth3.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.mouth3.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 10, 0.0F);
        this.setRotateAngle(mouth3, -0.136659280431156F, 0.0F, 0.0F);
        this.butt3 = new ModelRenderer(this, 0, 165);
        this.butt3.setRotationPoint(0.0F, -0.2F, 1.3F);
        this.butt3.addBox(-9.0F, -5.0F, -7.5F, 18, 5, 8, 0.0F);
        this.setRotateAngle(butt3, 0.36425021489121656F, 0.0F, 0.0F);
        this.rfleg1_1 = new ModelRenderer(this, 102, 90);
        this.rfleg1_1.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.rfleg1_1.addBox(0.0F, -4.6F, -5.5F, 9, 18, 11, 0.0F);
        this.setRotateAngle(rfleg1_1, 0.136659280431156F, 0.0F, 0.0F);
        this.mouth2 = new ModelRenderer(this, 54, 4);
        this.mouth2.setRotationPoint(0.0F, 0.1F, 5.9F);
        this.mouth2.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 5, 0.0F);
        this.setRotateAngle(mouth2, -0.4553564018453205F, 0.0F, 0.0F);
        this.rtusk1 = new ModelRenderer(this, 0, 63);
        this.rtusk1.setRotationPoint(5.0F, 3.0F, 15.8F);
        this.rtusk1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotateAngle(rtusk1, -0.31869712141416456F, 0.22759093446006054F, 0.0F);
        this.rfleg2 = new ModelRenderer(this, 105, 66);
        this.rfleg2.mirror = true;
        this.rfleg2.setRotationPoint(-4.5F, 11.0F, 0.0F);
        this.rfleg2.addBox(-4.0F, 0.0F, -4.5F, 8, 14, 9, 0.0F);
        this.setRotateAngle(rfleg2, -0.15236724369910498F, 0.0F, 0.0F);
        this.butt4 = new ModelRenderer(this, 0, 167);
        this.butt4.setRotationPoint(0.0F, 11.9F, -12.6F);
        this.butt4.addBox(-9.5F, -5.0F, 0.0F, 19, 8, 9, 0.0F);
        this.setRotateAngle(butt4, -0.136659280431156F, 0.0F, 0.0F);
        this.trunk2 = new ModelRenderer(this, 165, 51);
        this.trunk2.setRotationPoint(0.0F, -0.1F, 14.1F);
        this.trunk2.addBox(-3.0F, -4.1F, 0.0F, 6, 8, 10, 0.0F);
        this.setRotateAngle(trunk2, -0.136659280431156F, 0.0F, 0.0F);
        this.butt6 = new ModelRenderer(this, 0, 164);
        this.butt6.setRotationPoint(0.0F, 5.6F, -4.1F);
        this.butt6.addBox(-9.5F, -12.0F, -20.0F, 19, 18, 7, 0.0F);
        this.setRotateAngle(butt6, -0.27314402793711257F, 0.0F, 0.0F);
        this.ltusk3 = new ModelRenderer(this, 0, 22);
        this.ltusk3.setRotationPoint(-0.6F, 0.3F, 12.6F);
        this.ltusk3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 18, 0.0F);
        this.setRotateAngle(ltusk3, 0.31869712141416456F, 0.36425021489121656F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 152);
        this.neck.setRotationPoint(0.0F, -6.5F, 13.0F);
        this.neck.addBox(-8.5F, -8.5F, 0.0F, 17, 20, 15, 0.0F);
        this.neckjoint = new ModelRenderer(this, 0, 0);
        this.neckjoint.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.neckjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.tail2 = new ModelRenderer(this, 47, 64);
        this.tail2.setRotationPoint(0.0F, 11.2F, -0.4F);
        this.tail2.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(tail2, 0.27314402793711257F, 0.0F, 0.0F);
        this.rtusk3 = new ModelRenderer(this, 0, 22);
        this.rtusk3.setRotationPoint(0.6F, 0.3F, 12.6F);
        this.rtusk3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 18, 0.0F);
        this.setRotateAngle(rtusk3, 0.31869712141416456F, -0.36425021489121656F, 0.0F);
        this.rlfeet = new ModelRenderer(this, 67, 33);
        this.rlfeet.setRotationPoint(0.0F, 10.2F, 2.3F);
        this.rlfeet.addBox(-4.0F, 0.0F, -7.5F, 8, 7, 10, 0.0F);
        this.setRotateAngle(rlfeet, -0.136659280431156F, 0.0F, 0.0F);
        this.trunk1 = new ModelRenderer(this, 151, 70);
        this.trunk1.setRotationPoint(0.0F, -0.7F, 15.8F);
        this.trunk1.addBox(-4.0F, -4.5F, 0.0F, 8, 10, 15, 0.0F);
        this.setRotateAngle(trunk1, -0.136659280431156F, 0.0F, 0.0F);
        this.rffeet_1 = new ModelRenderer(this, 101, 25);
        this.rffeet_1.setRotationPoint(0.0F, 10.2F, 1.5F);
        this.rffeet_1.addBox(-4.0F, 0.0F, -6.5F, 8, 7, 9, 0.0F);
        this.setRotateAngle(rffeet_1, 0.040317105721069016F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 0, 83);
        this.rightear.setRotationPoint(6.8F, -7.8F, 8.6F);
        this.rightear.addBox(0.0F, 0.0F, -8.0F, 2, 13, 8, 0.0F);
        this.setRotateAngle(rightear, -0.22759093446006054F, -0.4553564018453205F, 0.0F);
        this.mouth1 = new ModelRenderer(this, 95, 6);
        this.mouth1.setRotationPoint(0.0F, 2.2F, 9.8F);
        this.mouth1.addBox(-4.5F, 0.0F, 0.0F, 9, 3, 6, 0.0F);
        this.setRotateAngle(mouth1, 0.136659280431156F, 0.0F, -0.0017453292519943296F);
        this.ltusk2 = new ModelRenderer(this, 0, 44);
        this.ltusk2.setRotationPoint(0.2F, 0.0F, 10.0F);
        this.ltusk2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 14, 0.0F);
        this.setRotateAngle(ltusk2, -0.18203784098300857F, -0.091106186954104F, 0.0F);
        this.rlleg3 = new ModelRenderer(this, 69, 51);
        this.rlleg3.setRotationPoint(0.0F, 13.2F, 0.4F);
        this.rlleg3.addBox(-3.5F, 0.0F, -4.0F, 7, 13, 8, 0.0F);
        this.setRotateAngle(rlleg3, -0.045553093477052F, 0.0F, 0.0F);
        this.butt = new ModelRenderer(this, 0, 148);
        this.butt.setRotationPoint(0.0F, 1.8F, -6.9F);
        this.butt.addBox(-10.0F, -12.0F, -20.0F, 20, 20, 20, 0.0F);
        this.Head = new ModelRenderer(this, 114, 161);
        this.Head.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Head.addBox(-9.5F, -9.8F, -2.6F, 19, 19, 16, 0.0F);
        this.hump3 = new ModelRenderer(this, 90, 130);
        this.hump3.setRotationPoint(0.0F, 4.8F, -3.1F);
        this.hump3.addBox(-8.0F, -5.0F, 0.0F, 16, 5, 9, 0.0F);
        this.setRotateAngle(hump3, 0.7740535232594852F, 0.0F, 0.0F);
        this.rlleg1 = new ModelRenderer(this, 51, 103);
        this.rlleg1.mirror = true;
        this.rlleg1.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.rlleg1.addBox(0.0F, -4.6F, -5.5F, 9, 21, 13, 0.0F);
        this.setRotateAngle(rlleg1, -0.091106186954104F, 0.0F, 0.0F);
        this.hump2 = new ModelRenderer(this, 0, 160);
        this.hump2.setRotationPoint(0.0F, -1.1F, 6.0F);
        this.hump2.addBox(-7.5F, -5.0F, 0.0F, 15, 5, 7, 0.0F);
        this.setRotateAngle(hump2, -0.6829473363053812F, 0.0F, 0.0F);
        this.rfleg3_1 = new ModelRenderer(this, 105, 44);
        this.rfleg3_1.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.rfleg3_1.addBox(-3.5F, 0.0F, -3.5F, 7, 13, 7, 0.0F);
        this.rrfeet = new ModelRenderer(this, 67, 33);
        this.rrfeet.setRotationPoint(0.0F, 10.2F, 2.3F);
        this.rrfeet.addBox(-4.0F, 0.0F, -7.5F, 8, 7, 10, 0.0F);
        this.setRotateAngle(rrfeet, -0.136659280431156F, 0.0F, 0.0F);
        this.trunk3.addChild(this.untrunk);
        this.rfleg1_1.addChild(this.rfleg2_1);
        this.tail2.addChild(this.tail3);
        this.Shoulder.addChild(this.hump1);
        this.rtusk1.addChild(this.rtusk2);
        this.rfleg2.addChild(this.rfleg3);
        this.rfleg3.addChild(this.rffeet);
        this.Head.addChild(this.leftear);
        this.butt.addChild(this.butt2);
        this.head2.addChild(this.uppjaw);
        this.rrightjoint.addChild(this.rrleg1);
        this.butt6.addChild(this.tail1);
        this.frightjoint.addChild(this.rfleg1);
        this.Shoulder.addChild(this.chest);
        this.trunk3.addChild(this.trunk4);
        this.trunk4.addChild(this.trunk5);
        this.body1.addChild(this.Shoulder);
        this.butt4.addChild(this.butt5);
        this.rrleg2.addChild(this.rrleg3);
        this.trunk2.addChild(this.trunk3);
        this.neck.addChild(this.chest2);
        this.head2.addChild(this.ltusk1);
        this.rrleg1.addChild(this.rrleg2);
        this.Head.addChild(this.head2);
        this.rlleg1.addChild(this.rlleg2);
        this.mouth1.addChild(this.mouth3);
        this.butt2.addChild(this.butt3);
        this.fleftjoint.addChild(this.rfleg1_1);
        this.mouth1.addChild(this.mouth2);
        this.head2.addChild(this.rtusk1);
        this.rfleg1.addChild(this.rfleg2);
        this.butt.addChild(this.butt4);
        this.trunk1.addChild(this.trunk2);
        this.butt.addChild(this.butt6);
        this.ltusk2.addChild(this.ltusk3);
        this.Shoulder.addChild(this.neck);
        this.neck.addChild(this.neckjoint);
        this.tail1.addChild(this.tail2);
        this.rtusk2.addChild(this.rtusk3);
        this.rlleg3.addChild(this.rlfeet);
        this.head2.addChild(this.trunk1);
        this.rfleg3_1.addChild(this.rffeet_1);
        this.Head.addChild(this.rightear);
        this.uppjaw.addChild(this.mouth1);
        this.ltusk1.addChild(this.ltusk2);
        this.rlleg2.addChild(this.rlleg3);
        this.body1.addChild(this.butt);
        this.neckjoint.addChild(this.Head);
        this.head2.addChild(this.hump3);
        this.rleftjoint.addChild(this.rlleg1);
        this.hump1.addChild(this.hump2);
        this.rfleg2_1.addChild(this.rfleg3_1);
        this.rrleg3.addChild(this.rrfeet);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body1.render(f5);
        this.fleftjoint.render(f5);
        this.frightjoint.render(f5);
        this.rrightjoint.render(f5);
        this.rleftjoint.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFator, Entity entityIn )
    {
    	this.frightjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.4F * limbSwingAmount;
    	this.rrightjoint.rotateAngleX = MathHelper.cos(limbSwing  * 0.6662F + (float)Math.PI) * 0.5F * limbSwingAmount;

    
    	
    	this.fleftjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI ) * 0.5F * limbSwingAmount;
    	this.rleftjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.4F * limbSwingAmount;
    }
}
