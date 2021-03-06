package com.hbm.tileentity;

import com.hbm.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityMachinePuF6Tank extends TileEntity implements ISidedInventory {

	private ItemStack slots[];
	
	public int fillState;
	public static final int maxFill = 64 * 3;

	private static final int[] slots_top = new int[] {0};
	private static final int[] slots_bottom = new int[] {1, 3};
	private static final int[] slots_side = new int[] {2};
	
	private String customName;
	
	public TileEntityMachinePuF6Tank() {
		slots = new ItemStack[4];
	}

	@Override
	public int getSizeInventory() {
		return slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return slots[i];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if(slots[i] != null)
		{
			ItemStack itemStack = slots[i];
			slots[i] = null;
			return itemStack;
		} else {
		return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) {
		slots[i] = itemStack;
		if(itemStack != null && itemStack.stackSize > getInventoryStackLimit())
		{
			itemStack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.customName : "container.puf6_tank";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.customName != null && this.customName.length() > 0;
	}
	
	public void setCustomName(String name) {
		this.customName = name;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		if(worldObj.getTileEntity(xCoord, yCoord, zCoord) != this)
		{
			return false;
		}else{
			return player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <=64;
		}
	}
	
	@Override
	public void openInventory() {}
	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack stack) {
		if(i == 0 && stack.getItem() == ModItems.cell_puf6)
			return true;
		if(i == 2 && stack.getItem() == ModItems.cell_empty)
			return true;
		
		return false;
	}
	
	@Override
	public ItemStack decrStackSize(int i, int j) {
		if(slots[i] != null)
		{
			if(slots[i].stackSize <= j)
			{
				ItemStack itemStack = slots[i];
				slots[i] = null;
				return itemStack;
			}
			ItemStack itemStack1 = slots[i].splitStack(j);
			if (slots[i].stackSize == 0)
			{
				slots[i] = null;
			}
			
			return itemStack1;
		} else {
			return null;
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("items", 10);
		
		fillState = nbt.getShort("fillState");
		slots = new ItemStack[getSizeInventory()];
		
		for(int i = 0; i < list.tagCount(); i++)
		{
			NBTTagCompound nbt1 = list.getCompoundTagAt(i);
			byte b0 = nbt1.getByte("slot");
			if(b0 >= 0 && b0 < slots.length)
			{
				slots[b0] = ItemStack.loadItemStackFromNBT(nbt1);
			}
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("fillState", (short) fillState);
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < slots.length; i++)
		{
			if(slots[i] != null)
			{
				NBTTagCompound nbt1 = new NBTTagCompound();
				nbt1.setByte("slot", (byte)i);
				slots[i].writeToNBT(nbt1);
				list.appendTag(nbt1);
			}
		}
		nbt.setTag("items", list);
	}
	
	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_)
    {
        return p_94128_1_ == 0 ? slots_bottom : (p_94128_1_ == 1 ? slots_top : slots_side);
    }

	@Override
	public boolean canInsertItem(int i, ItemStack itemStack, int j) {
		return this.isItemValidForSlot(i, itemStack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemStack, int j) {
		return true;
	}
	
	public int getFillStateScaled(int i) {
		return (fillState * i) / maxFill;
	}
	
	public boolean canGive() {
		if(slots[0] != null && slots[0].getItem() == ModItems.cell_puf6)
		{
			if(slots[1] == null || (slots[1] != null && slots[1].getItem() ==  ModItems.cell_empty && slots[1].stackSize < slots[1].getMaxStackSize()))
			{
				if(fillState < maxFill)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean canTake() {
		if(slots[2] != null && slots[2].getItem() == ModItems.cell_empty)
		{
			if(slots[3] == null || (slots[3] != null && slots[3].getItem() == ModItems.cell_puf6 && slots[3].stackSize < slots[3].getMaxStackSize()))
			{
				if(fillState > 0)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public void updateEntity() {

		if(!worldObj.isRemote)
		{
			if(this.canGive())
			{
				this.slots[0].stackSize--;
				if(slots[0].stackSize <= 0)
				{
					slots[0] = null;
				}
				
				this.fillState++;
				
				if(slots[1] != null)
				{
					slots[1].stackSize++;
				}
				else
				{
					slots[1] = new ItemStack(ModItems.cell_empty, 1);
				}
			}
			
			if(this.canTake())
			{
				this.slots[2].stackSize--;
				if(slots[2].stackSize <= 0)
				{
					slots[2] = null;
				}
				
				this.fillState--;
				
				if(slots[3] != null)
				{
					slots[3].stackSize++;
				}
				else
				{
					slots[3] = new ItemStack(ModItems.cell_puf6, 1);
				}
			}
		}
	}
	
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return TileEntity.INFINITE_EXTENT_AABB;
	}
}
