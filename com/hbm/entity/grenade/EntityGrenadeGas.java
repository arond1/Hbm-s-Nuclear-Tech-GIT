package com.hbm.entity.grenade;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

import com.hbm.explosion.ExplosionChaos;

public class EntityGrenadeGas extends EntityThrowable
{
    private static final String __OBFID = "CL_00001722";

    public EntityGrenadeGas(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public EntityGrenadeGas(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    public EntityGrenadeGas(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    @Override
	protected void onImpact(MovingObjectPosition p_70184_1_)
    {
        if (p_70184_1_.entityHit != null)
        {
            byte b0 = 0;

            if (p_70184_1_.entityHit instanceof EntityBlaze)
            {
                b0 = 3;
            }

            p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), b0);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0F, true);
            ExplosionChaos.poison(this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ, 5);
        }

		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++)
				this.worldObj.spawnParticle("cloud", this.posX - 2.5D + (((double)i) / 2), this.posY + 0.5D, this.posZ - 2.5D + (((double)j) / 2), 0, rand.nextDouble() * 0.1D, 0);
        }
    }

}
