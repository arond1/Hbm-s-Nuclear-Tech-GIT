package com.hbm.gui.gui;

import org.lwjgl.opengl.GL11;

import com.hbm.gui.container.ContainerPuF6Tank;
import com.hbm.lib.RefStrings;
import com.hbm.tileentity.TileEntityMachinePuF6Tank;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GUIMachinePuF6Tank extends GuiContainer {

	private static ResourceLocation texture = new ResourceLocation(RefStrings.MODID + ":textures/gui/puf6Tank.png");
	private TileEntityMachinePuF6Tank tank;
	
	public GUIMachinePuF6Tank(InventoryPlayer invPlayer, TileEntityMachinePuF6Tank tedf) {
		super(new ContainerPuF6Tank(invPlayer, tedf));
		tank = tedf;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerForegroundLayer( int i, int j) {
		String name = this.tank.hasCustomInventoryName() ? this.tank.getInventoryName() : I18n.format(this.tank.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(tank.fillState > 0)
		{
			int i1 = tank.getFillStateScaled(52);
			drawTexturedModalRect(guiLeft + 80, guiTop + 69 - i1, 177, 52 - i1, 16, i1);
		}
	}
}
