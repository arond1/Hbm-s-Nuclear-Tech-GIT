package com.hbm.items.weapon;

import java.util.List;
import java.util.Random;

import com.hbm.entity.projectile.EntityBullet;
import com.hbm.items.ModItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class GunSMG extends Item {

	Random rand = new Random();

    public GunSMG()
    {
        this.maxStackSize = 1;
    }

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.bow;
	}

	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
		ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
		{
			p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
		}

		return p_77659_1_;
	}

	public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
    {
		World world = player.worldObj;

		boolean flag = player.capabilities.isCreativeMode
				|| EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;
		if ((player.capabilities.isCreativeMode || player.inventory.hasItem(ModItems.gun_mp40_ammo))
				&& count % 2 == 0) {
			EntityBullet entityarrow = new EntityBullet(world, player, 3.0F, 2, 8, false, false);
			entityarrow.setDamage(1 + rand.nextInt(8));

			//world.playSoundAtEntity(player, "random.explode", 1.0F, 1.5F + (rand.nextFloat() / 4));
			world.playSoundAtEntity(player, "hbm:weapon.rifleShoot", 1.0F, 0.8F + (rand.nextFloat() * 0.4F));

			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				player.inventory.consumeInventoryItem(ModItems.gun_mp40_ammo);
			}

			if (!world.isRemote) {
				world.spawnEntityInWorld(entityarrow);
			}
		}
	}

	@Override
	public int getItemEnchantability() {
		return 0;
	}

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {

		list.add("Ratatatatatatatata!!");
		list.add("");
		list.add("Ammo: SMG Round");
		list.add("Damage: 2 - 8");
	}
}
