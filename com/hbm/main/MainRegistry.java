package com.hbm.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;

import com.hbm.blocks.ModBlocks;
import com.hbm.creativetabs.BlockTab;
import com.hbm.creativetabs.NukeTab;
import com.hbm.creativetabs.PartsTab;
import com.hbm.creativetabs.TestTab;
<<<<<<< HEAD
import com.hbm.entity.effect.EntityCloudFleija;
import com.hbm.entity.effect.EntityEMPBlast;
import com.hbm.entity.effect.EntityFalloutRain;
import com.hbm.entity.effect.EntityNukeCloudBig;
import com.hbm.entity.effect.EntityNukeCloudNoShroom;
import com.hbm.entity.effect.EntityNukeCloudSmall;
import com.hbm.entity.grenade.EntityGrenadeASchrab;
import com.hbm.entity.grenade.EntityGrenadeCluster;
import com.hbm.entity.grenade.EntityGrenadeElectric;
import com.hbm.entity.grenade.EntityGrenadeFire;
import com.hbm.entity.grenade.EntityGrenadeFlare;
import com.hbm.entity.grenade.EntityGrenadeFrag;
import com.hbm.entity.grenade.EntityGrenadeGas;
import com.hbm.entity.grenade.EntityGrenadeGeneric;
import com.hbm.entity.grenade.EntityGrenadeLemon;
import com.hbm.entity.grenade.EntityGrenadeMk2;
import com.hbm.entity.grenade.EntityGrenadeNuclear;
import com.hbm.entity.grenade.EntityGrenadeNuke;
import com.hbm.entity.grenade.EntityGrenadePlasma;
import com.hbm.entity.grenade.EntityGrenadePoison;
import com.hbm.entity.grenade.EntityGrenadeSchrabidium;
import com.hbm.entity.grenade.EntityGrenadeStrong;
import com.hbm.entity.grenade.EntityGrenadeTau;
import com.hbm.entity.grenade.EntityGrenadeZOMG;
import com.hbm.entity.logic.EntityNukeExplosion;
import com.hbm.entity.logic.EntityNukeExplosionAdvanced;
import com.hbm.entity.missile.EntityMIRV;
import com.hbm.entity.missile.EntityMissileAntiBallistic;
import com.hbm.entity.missile.EntityMissileBunkerBuster;
import com.hbm.entity.missile.EntityMissileBurst;
import com.hbm.entity.missile.EntityMissileBusterStrong;
import com.hbm.entity.missile.EntityMissileCluster;
import com.hbm.entity.missile.EntityMissileClusterStrong;
import com.hbm.entity.missile.EntityMissileDrill;
import com.hbm.entity.missile.EntityMissileEndo;
import com.hbm.entity.missile.EntityMissileExo;
import com.hbm.entity.missile.EntityMissileGeneric;
import com.hbm.entity.missile.EntityMissileIncendiary;
import com.hbm.entity.missile.EntityMissileIncendiaryStrong;
import com.hbm.entity.missile.EntityMissileInferno;
import com.hbm.entity.missile.EntityMissileMirv;
import com.hbm.entity.missile.EntityMissileNuclear;
import com.hbm.entity.missile.EntityMissileRain;
import com.hbm.entity.missile.EntityMissileStrong;
import com.hbm.entity.missile.EntityTestMissile;
import com.hbm.entity.mob.EntityHunterChopper;
import com.hbm.entity.mob.EntityNuclearCreeper;
import com.hbm.entity.particle.EntityBSmokeFX;
import com.hbm.entity.particle.EntitySmokeFX;
import com.hbm.entity.projectile.EntityBaleflare;
import com.hbm.entity.projectile.EntityBullet;
import com.hbm.entity.projectile.EntityChopperMine;
import com.hbm.entity.projectile.EntityCombineBall;
import com.hbm.entity.projectile.EntityDischarge;
import com.hbm.entity.projectile.EntityFire;
import com.hbm.entity.projectile.EntityLN2;
import com.hbm.entity.projectile.EntityMiniMIRV;
import com.hbm.entity.projectile.EntityMiniNuke;
import com.hbm.entity.projectile.EntityPlasmaBeam;
import com.hbm.entity.projectile.EntityRainbow;
import com.hbm.entity.projectile.EntityRocket;
import com.hbm.entity.projectile.EntitySchrab;
=======
import com.hbm.entity.EntityBullet;
import com.hbm.entity.EntityChopperMine;
import com.hbm.entity.EntityCloudFleija;
import com.hbm.entity.EntityCombineBall;
<<<<<<< HEAD
import com.hbm.entity.EntityFalloutRain;
=======
>>>>>>> 540fb3d256a0f4ae6a8b1db586f8e9cfd6ed7372
import com.hbm.entity.EntityGrenadeASchrab;
import com.hbm.entity.EntityGrenadeCluster;
import com.hbm.entity.EntityGrenadeElectric;
import com.hbm.entity.EntityGrenadeFire;
import com.hbm.entity.EntityGrenadeFlare;
import com.hbm.entity.EntityGrenadeFrag;
import com.hbm.entity.EntityGrenadeGas;
import com.hbm.entity.EntityGrenadeGeneric;
import com.hbm.entity.EntityGrenadeLemon;
import com.hbm.entity.EntityGrenadeMk2;
import com.hbm.entity.EntityGrenadeNuclear;
import com.hbm.entity.EntityGrenadeNuke;
import com.hbm.entity.EntityGrenadePlasma;
import com.hbm.entity.EntityGrenadePoison;
import com.hbm.entity.EntityGrenadeSchrabidium;
import com.hbm.entity.EntityGrenadeStrong;
import com.hbm.entity.EntityGrenadeTau;
import com.hbm.entity.EntityGrenadeZOMG;
import com.hbm.entity.EntityHunterChopper;
import com.hbm.entity.EntityMiniNuke;
import com.hbm.entity.EntityMirv;
import com.hbm.entity.EntityMissileAntiBallistic;
import com.hbm.entity.EntityMissileBunkerBuster;
import com.hbm.entity.EntityMissileBurst;
import com.hbm.entity.EntityMissileBusterStrong;
import com.hbm.entity.EntityMissileCluster;
import com.hbm.entity.EntityMissileClusterStrong;
import com.hbm.entity.EntityMissileDrill;
import com.hbm.entity.EntityMissileEndo;
import com.hbm.entity.EntityMissileExo;
import com.hbm.entity.EntityMissileGeneric;
import com.hbm.entity.EntityMissileIncendiary;
import com.hbm.entity.EntityMissileIncendiaryStrong;
import com.hbm.entity.EntityMissileInferno;
import com.hbm.entity.EntityMissileMirv;
import com.hbm.entity.EntityMissileNuclear;
import com.hbm.entity.EntityMissileRain;
import com.hbm.entity.EntityMissileStrong;
import com.hbm.entity.EntityNuclearCreeper;
import com.hbm.entity.EntityNukeCloudBig;
import com.hbm.entity.EntityNukeCloudNoShroom;
import com.hbm.entity.EntityNukeCloudSmall;
import com.hbm.entity.EntityNukeExplosion;
import com.hbm.entity.EntityNukeExplosionAdvanced;
import com.hbm.entity.EntityRainbow;
import com.hbm.entity.EntityRocket;
import com.hbm.entity.EntitySchrab;
import com.hbm.entity.EntityTestMissile;
>>>>>>> 5525318475377d238c79edc90a14ee8fa48397af
import com.hbm.gui.MachineRecipes;
import com.hbm.gui.MachineRecipes.ShredderRecipe;
import com.hbm.handler.FuelHandler;
import com.hbm.handler.GUIHandler;
import com.hbm.items.ModItems;
import com.hbm.lib.HbmWorld;
import com.hbm.lib.Library;
import com.hbm.lib.RefStrings;
import com.hbm.tileentity.TileEntityBombMulti;
import com.hbm.tileentity.TileEntityCable;
import com.hbm.tileentity.TileEntityConverterHeRf;
import com.hbm.tileentity.TileEntityConverterRfHe;
import com.hbm.tileentity.TileEntityCoreAdvanced;
import com.hbm.tileentity.TileEntityCoreTitanium;
import com.hbm.tileentity.TileEntityCrashedBomb;
import com.hbm.tileentity.TileEntityDecoBlock;
import com.hbm.tileentity.TileEntityDecoPoleSatelliteReceiver;
import com.hbm.tileentity.TileEntityDecoPoleTop;
import com.hbm.tileentity.TileEntityDecoSteelPoles;
import com.hbm.tileentity.TileEntityDecoTapeRecorder;
import com.hbm.tileentity.TileEntityDiFurnace;
import com.hbm.tileentity.TileEntityFWatzCore;
import com.hbm.tileentity.TileEntityFusionMultiblock;
import com.hbm.tileentity.TileEntityLaunchPad;
import com.hbm.tileentity.TileEntityMachineBattery;
import com.hbm.tileentity.TileEntityMachineCMBFactory;
import com.hbm.tileentity.TileEntityMachineCentrifuge;
import com.hbm.tileentity.TileEntityMachineCoal;
import com.hbm.tileentity.TileEntityMachineDeuterium;
import com.hbm.tileentity.TileEntityMachineDiesel;
import com.hbm.tileentity.TileEntityMachineElectricFurnace;
import com.hbm.tileentity.TileEntityMachineGenerator;
import com.hbm.tileentity.TileEntityMachinePuF6Tank;
import com.hbm.tileentity.TileEntityMachineReactor;
import com.hbm.tileentity.TileEntityMachineSchrabidiumTransmutator;
import com.hbm.tileentity.TileEntityMachineShredder;
import com.hbm.tileentity.TileEntityMachineTeleporter;
import com.hbm.tileentity.TileEntityMachineUF6Tank;
import com.hbm.tileentity.TileEntityNukeBoy;
import com.hbm.tileentity.TileEntityNukeFleija;
import com.hbm.tileentity.TileEntityNukeFurnace;
import com.hbm.tileentity.TileEntityNukeGadget;
import com.hbm.tileentity.TileEntityNukeMan;
import com.hbm.tileentity.TileEntityNukeMike;
import com.hbm.tileentity.TileEntityNukePrototype;
import com.hbm.tileentity.TileEntityNukeTsar;
import com.hbm.tileentity.TileEntityObjTester;
import com.hbm.tileentity.TileEntityReactorMultiblock;
import com.hbm.tileentity.TileEntityRedBarrel;
import com.hbm.tileentity.TileEntityRotationTester;
import com.hbm.tileentity.TileEntityRtgFurnace;
import com.hbm.tileentity.TileEntityTestBombAdvanced;
import com.hbm.tileentity.TileEntityTestContainer;
import com.hbm.tileentity.TileEntityTestNuke;
import com.hbm.tileentity.TileEntityTestRender;
import com.hbm.tileentity.TileEntityWatzCore;
import com.hbm.tileentity.TileEntityWireCoated;
import com.hbm.tileentity.TileEntityYellowBarrel;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry
{
	@Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Metadata
	public static ModMetadata meta;
	
	//Tool Materials
	public static ToolMaterial enumToolMaterialSchrabidium = EnumHelper.addToolMaterial("SCHRABIDIUM", 3, 10000, 50.0F, 100.0F, 200);
	public static ToolMaterial enumToolMaterialHammer = EnumHelper.addToolMaterial("SCHRABIDIUMHAMMER", 3, 0, 50.0F, 999999996F, 200);
	public static ToolMaterial enumToolMaterialChainsaw = EnumHelper.addToolMaterial("CHAINSAW", 3, 5000, 50.0F, 47.0F, 0);
	public static ToolMaterial enumToolMaterialSteel = EnumHelper.addToolMaterial("STEEL", 2, 500, 7.5F, 2.0F, 10);
	public static ToolMaterial enumToolMaterialTitanium = EnumHelper.addToolMaterial("TITANIUM", 3, 750, 9.0F, 2.5F, 15);
	public static ToolMaterial enumToolMaterialAlloy= EnumHelper.addToolMaterial("ALLOY", 3, 2000, 15.0F, 5.0F, 5);
	public static ToolMaterial enumToolMaterialCmb = EnumHelper.addToolMaterial("CMB", 3, 8500, 40.0F, 50F, 100);
	
	//Armor Materials
	public static ArmorMaterial enumArmorMaterialEmerald = EnumHelper.addArmorMaterial("TEST", 2500, new int[] {3, 8, 6, 3}, 30);
	public static ArmorMaterial enumArmorMaterialSchrabidium = EnumHelper.addArmorMaterial("SCHRABIDIUM", 100, new int[] {3, 8, 6, 3}, 50);
	public static ArmorMaterial enumArmorMaterialEuphemium = EnumHelper.addArmorMaterial("EUPHEMIUM", 2147483647, new int[] {3, 8, 6, 3}, 100);
	public static ArmorMaterial enumArmorMaterialHazmat = EnumHelper.addArmorMaterial("HAZMAT", 60, new int[] {2, 5, 4, 1}, 5);
	public static ArmorMaterial enumArmorMaterialT45 = EnumHelper.addArmorMaterial("T45", 1000, new int[] {2, 5, 4, 1}, 0);
	public static ArmorMaterial enumArmorMaterialSteel = EnumHelper.addArmorMaterial("STEEL", 20, new int[] {2, 6, 5, 2}, 5);
	public static ArmorMaterial enumArmorMaterialTitanium = EnumHelper.addArmorMaterial("TITANIUM", 25, new int[] {3, 8, 6, 3}, 9);
<<<<<<< HEAD
	public static ArmorMaterial enumArmorMaterialAlloy = EnumHelper.addArmorMaterial("ALLOY", 40, new int[] {3, 8, 6, 3}, 12);
=======
<<<<<<< HEAD
	public static ArmorMaterial enumArmorMaterialAlloy = EnumHelper.addArmorMaterial("ALLOY", 40, new int[] {3, 8, 6, 3}, 12);
=======
	public static ArmorMaterial enumArmorMaterialAlloy = EnumHelper.addArmorMaterial("ALLOY", 50, new int[] {3, 8, 6, 3}, 12);
>>>>>>> 540fb3d256a0f4ae6a8b1db586f8e9cfd6ed7372
>>>>>>> 5525318475377d238c79edc90a14ee8fa48397af
	public static ArmorMaterial enumArmorMaterialPaa = EnumHelper.addArmorMaterial("PAA", 75, new int[] {3, 8, 6, 3}, 25);
	public static ArmorMaterial enumArmorMaterialCmb = EnumHelper.addArmorMaterial("CMB", 60, new int[] {3, 8, 6, 3}, 50);
	
	//Creative Tabs
	public static CreativeTabs tabTest = new TestTab(CreativeTabs.getNextID(), "tabTest");
	public static CreativeTabs tabParts = new PartsTab(CreativeTabs.getNextID(), "tabParts");
	public static CreativeTabs tabBlock = new BlockTab(CreativeTabs.getNextID(), "tabBlocks");
	public static CreativeTabs tabNuke = new NukeTab(CreativeTabs.getNextID(), "tabNuke");
	
	public static boolean enableDebugMode = true;
	public static boolean enableMycelium = false;
	public static boolean enablePlutoniumOre = false;
	public static boolean enableDungeons = true;
	public static boolean enableMDOres = true;
	public static boolean enableBarrels = false;
	public static boolean enableNITAN = true;
	public static boolean enableNukeClouds = true;
	public static int uraniumSpawn = 7;
	public static int titaniumSpawn = 8;
	public static int sulfurSpawn = 5;
	public static int aluminiumSpawn = 7;
	public static int copperSpawn = 12;
	public static int fluoriteSpawn = 6;
	public static int niterSpawn = 4;
	public static int tungstenSpawn = 10;
	public static int leadSpawn = 6;
	public static int berylliumSpawn = 6;
	public static int gadgetRadius = 150;
	public static int boyRadius = 120;
	public static int manRadius = 175;
	public static int mikeRadius = 250;
	public static int tsarRadius = 500;
	public static int prototypeRadius = 150;
	public static int fleijaRadius = 50;
	public static int missileRadius = 100;
	public static int mirvRadius = 100;
	public static int fatmanRadius = 35;
	public static int nukaRadius = 25;
	public static int aSchrabRadius = 20;
	public static int radioStructure = 500;
	public static int antennaStructure = 250;
	public static int atomStructure = 500;
	public static int vertibirdStructure = 500;
	public static int dungeonStructure = 64;
	public static int relayStructure = 500;
	public static int satelliteStructure = 500;
	public static int bunkerStructure = 1000;
	public static int siloStructure = 1000;
	public static int factoryStructure = 1000;
	public static int dudStructure = 500;
	public static int spaceshipStructure = 1000;

	public static int x;
	public static int y;
	public static int z;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{		
		ModBlocks.mainRegistry();
		ModItems.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
		HbmWorld.mainRegistry();
		GameRegistry.registerFuelHandler(new FuelHandler());

		Library.superuser.add("192af5d7-ed0f-48d8-bd89-9d41af8524f8");
		Library.superuser.add("5aee1e3d-3767-4987-a222-e7ce1fbdf88e");
		Library.superuser.add("937c9804-e11f-4ad2-a5b1-42e62ac73077");
		Library.superuser.add("3af1c262-61c0-4b12-a4cb-424cc3a9c8c0");
		Library.superuser.add("4729b498-a81c-42fd-8acd-20d6d9f759e0");
		Library.superuser.add("c3f5e449-6d8c-4fe3-acc9-47ef50e7e7ae");
		
		Library.initBooks();

		enumArmorMaterialSchrabidium.customCraftingMaterial = ModItems.ingot_schrabidium;
		enumArmorMaterialHazmat.customCraftingMaterial = ModItems.hazmat_cloth;
		enumArmorMaterialT45.customCraftingMaterial = ModItems.plate_titanium;
		enumArmorMaterialTitanium.customCraftingMaterial = ModItems.ingot_titanium;
		enumArmorMaterialSteel.customCraftingMaterial = ModItems.ingot_steel;
		enumArmorMaterialAlloy.customCraftingMaterial = ModItems.ingot_advanced_alloy;
		enumArmorMaterialPaa.customCraftingMaterial = ModItems.plate_paa;
		enumArmorMaterialCmb.customCraftingMaterial = ModItems.ingot_combine_steel;
		enumToolMaterialSchrabidium.setRepairItem(new ItemStack(ModItems.ingot_schrabidium));
		enumToolMaterialHammer.setRepairItem(new ItemStack(Item.getItemFromBlock(ModBlocks.block_schrabidium)));
		enumToolMaterialChainsaw.setRepairItem(new ItemStack(ModItems.ingot_steel));
		enumToolMaterialTitanium.setRepairItem(new ItemStack(ModItems.ingot_titanium));
		enumToolMaterialSteel.setRepairItem(new ItemStack(ModItems.ingot_steel));
		enumToolMaterialAlloy.setRepairItem(new ItemStack(ModItems.ingot_advanced_alloy));
		enumToolMaterialCmb.setRepairItem(new ItemStack(ModItems.ingot_combine_steel));
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GUIHandler());
		GameRegistry.registerTileEntity(TileEntityTestBombAdvanced.class, "tilentity_testbombadvanced");
		GameRegistry.registerTileEntity(TileEntityDiFurnace.class, "tilentity_diFurnace");
		GameRegistry.registerTileEntity(TileEntityTestNuke.class, "tilentity_testnuke");
		GameRegistry.registerTileEntity(TileEntityRotationTester.class, "tilentity_rotationtester");
		GameRegistry.registerTileEntity(TileEntityTestRender.class, "tilentity_testrenderer");
		GameRegistry.registerTileEntity(TileEntityTestContainer.class, "tilentity_testcontainer");
		GameRegistry.registerTileEntity(TileEntityObjTester.class, "tilentity_objtester");
		GameRegistry.registerTileEntity(TileEntityNukeGadget.class, "tilentity_nukegadget");
		GameRegistry.registerTileEntity(TileEntityNukeBoy.class, "tilentity_nukeboy");
		GameRegistry.registerTileEntity(TileEntityMachineCentrifuge.class, "tileentity_centrifuge");
		GameRegistry.registerTileEntity(TileEntityNukeMan.class, "tileentity_nukeman");
		GameRegistry.registerTileEntity(TileEntityMachineUF6Tank.class, "tileentity_uf6_tank");
		GameRegistry.registerTileEntity(TileEntityMachinePuF6Tank.class, "tileentity_puf6_tank");
		GameRegistry.registerTileEntity(TileEntityMachineReactor.class, "tileentity_reactor");
		GameRegistry.registerTileEntity(TileEntityBombMulti.class, "tileentity_bombmulti");
		GameRegistry.registerTileEntity(TileEntityNukeMike.class, "tileentity_nukemike");
		GameRegistry.registerTileEntity(TileEntityNukeTsar.class, "tileentity_nuketsar");
		GameRegistry.registerTileEntity(TileEntityNukeFurnace.class, "tileentity_nukefurnace");
		GameRegistry.registerTileEntity(TileEntityRtgFurnace.class, "tileentity_rtgfurnace");
		GameRegistry.registerTileEntity(TileEntityMachineGenerator.class, "tileentity_generator");
		GameRegistry.registerTileEntity(TileEntityMachineElectricFurnace.class, "tileentity_electric_furnace");
		GameRegistry.registerTileEntity(TileEntityNukeFleija.class, "tileentity_nukefleija");
		GameRegistry.registerTileEntity(TileEntityDecoTapeRecorder.class, "tileentity_taperecorder");
		GameRegistry.registerTileEntity(TileEntityDecoSteelPoles.class, "tileentity_steelpoles");
		GameRegistry.registerTileEntity(TileEntityDecoPoleTop.class, "tileentity_poletop");
		GameRegistry.registerTileEntity(TileEntityDecoPoleSatelliteReceiver.class, "tileentity_satellitereceicer");
		GameRegistry.registerTileEntity(TileEntityMachineDeuterium.class, "tileentity_deuterium");
		GameRegistry.registerTileEntity(TileEntityWireCoated.class, "tileentity_wirecoated");
		GameRegistry.registerTileEntity(TileEntityMachineBattery.class, "tileentity_battery");
		GameRegistry.registerTileEntity(TileEntityMachineCoal.class, "tileentity_coal");
		GameRegistry.registerTileEntity(TileEntityNukePrototype.class, "tileentity_nukeproto");
		GameRegistry.registerTileEntity(TileEntityRedBarrel.class, "tileentity_barrel");
		GameRegistry.registerTileEntity(TileEntityYellowBarrel.class, "tileentity_nukebarrel");
		GameRegistry.registerTileEntity(TileEntityLaunchPad.class, "tileentity_launch1");
		GameRegistry.registerTileEntity(TileEntityDecoBlock.class, "tileentity_deco");
		GameRegistry.registerTileEntity(TileEntityCoreTitanium.class, "tileentity_core_titanium");
		GameRegistry.registerTileEntity(TileEntityCoreAdvanced.class, "tileentity_core_advanced");
		GameRegistry.registerTileEntity(TileEntityReactorMultiblock.class, "tileentity_reactor_multiblock");
		GameRegistry.registerTileEntity(TileEntityFusionMultiblock.class, "tileentity_fusion_multiblock");
		GameRegistry.registerTileEntity(TileEntityCrashedBomb.class, "tileentity_crashed_balefire");
		GameRegistry.registerTileEntity(TileEntityCable.class, "tileentity_cable");
		GameRegistry.registerTileEntity(TileEntityConverterHeRf.class, "tileentity_converter_herf");
		GameRegistry.registerTileEntity(TileEntityConverterRfHe.class, "tileentity_converter_rfhe");
		GameRegistry.registerTileEntity(TileEntityMachineSchrabidiumTransmutator.class, "tileentity_schrabidium_transmutator");
		GameRegistry.registerTileEntity(TileEntityMachineDiesel.class, "tileentity_diesel_generator");
		GameRegistry.registerTileEntity(TileEntityWatzCore.class, "tileentity_watz_multiblock");
		GameRegistry.registerTileEntity(TileEntityMachineShredder.class, "tileentity_machine_shredder");
		GameRegistry.registerTileEntity(TileEntityMachineCMBFactory.class, "tileentity_machine_cmb");
		GameRegistry.registerTileEntity(TileEntityFWatzCore.class, "tileentity_fwatz_multiblock");
		GameRegistry.registerTileEntity(TileEntityMachineTeleporter.class, "tileentity_teleblock");

	    EntityRegistry.registerModEntity(EntityRocket.class, "entity_rocket", 0, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityNukeExplosion.class, "entity_nuke_explosion", 1, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityNukeExplosionAdvanced.class, "entity_nuke_explosion_advanced", 2, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeGeneric.class, "entity_grenade_generic", 3, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeStrong.class, "entity_grenade_strong", 4, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeFrag.class, "entity_grenade_frag", 5, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeFire.class, "entity_grenade_fire", 6, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeCluster.class, "entity_grenade_cluster", 7, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityTestMissile.class, "entity_test_missile", 8, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityNukeCloudSmall.class, "entity_nuke_cloud_small", 9, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityBullet.class, "entity_bullet", 10, this, 250, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeFlare.class, "entity_grenade_flare", 11, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeElectric.class, "entity_grenade_electric", 12, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadePoison.class, "entity_grenade_poison", 13, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeGas.class, "entity_grenade_gas", 14, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeSchrabidium.class, "entity_grenade_schrab", 15, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeNuke.class, "entity_grenade_nuke", 16, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntitySchrab.class, "entity_schrabnel", 17, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileGeneric.class, "entity_missile_generic", 18, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileStrong.class, "entity_missile_strong", 19, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileNuclear.class, "entity_missile_nuclear", 20, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileCluster.class, "entity_missile_cluster", 21, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileIncendiary.class, "entity_missile_incendiary", 22, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileAntiBallistic.class, "entity_missile_anti", 23, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileBunkerBuster.class, "entity_missile_buster", 24, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileIncendiaryStrong.class, "entity_missile_incendiary_strong", 25, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileClusterStrong.class, "entity_missile_cluster_strong", 26, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileBusterStrong.class, "entity_missile_buster_strong", 27, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileBurst.class, "entity_missile_burst", 28, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileInferno.class, "entity_missile_inferno", 29, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileRain.class, "entity_missile_rain", 30, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileDrill.class, "entity_missile_drill", 31, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileEndo.class, "entity_missile_endo", 32, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileExo.class, "entity_missile_exo", 33, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMissileMirv.class, "entity_missile_mirv", 34, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMIRV.class, "entity_mirvlet", 35, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMiniNuke.class, "entity_mini_nuke", 36, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntitySmokeFX.class, "entity_smoke_fx", 37, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityNukeCloudBig.class, "entity_nuke_cloud_big", 38, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeNuclear.class, "entity_grenade_nuclear", 39, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityBSmokeFX.class, "entity_b_smoke_fx", 40, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadePlasma.class, "entity_grenade_plasma", 41, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeTau.class, "entity_grenade_tau", 42, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityChopperMine.class, "entity_chopper_mine", 43, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityCombineBall.class, "entity_combine_ball", 44, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityRainbow.class, "entity_rainbow", 45, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeLemon.class, "entity_grenade_lemon", 46, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityCloudFleija.class, "entity_cloud_fleija", 47, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeMk2.class, "entity_grenade_mk2", 48, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeZOMG.class, "entity_grenade_zomg", 49, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityGrenadeASchrab.class, "entity_grenade_aschrab", 50, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityNukeCloudNoShroom.class, "entity_nuke_cloud_no", 51, this, 1000, 1, true);
<<<<<<< HEAD
	    EntityRegistry.registerModEntity(EntityFalloutRain.class, "entity_fallout", 52, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityDischarge.class, "entity_emp_discharge", 53, this, 500, 1, true);
	    EntityRegistry.registerModEntity(EntityEMPBlast.class, "entity_emp_blast", 54, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityMiniMIRV.class, "entity_mini_mirv", 55, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityBaleflare.class, "entity_bf_projectile", 56, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityFire.class, "entity_fire", 57, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityPlasmaBeam.class, "entity_immolator_beam", 58, this, 1000, 1, true);
	    EntityRegistry.registerModEntity(EntityLN2.class, "entity_LN2", 59, this, 1000, 1, true);
	    
=======
<<<<<<< HEAD
	    EntityRegistry.registerModEntity(EntityFalloutRain.class, "entity_fallout", 52, this, 1000, 1, true);
	    
=======

>>>>>>> 540fb3d256a0f4ae6a8b1db586f8e9cfd6ed7372
>>>>>>> 5525318475377d238c79edc90a14ee8fa48397af
	    EntityRegistry.registerGlobalEntityID(EntityNuclearCreeper.class, "entity_mob_nuclear_creeper", EntityRegistry.findGlobalUniqueEntityId(), 0x204131, 0x75CE00);
	    EntityRegistry.registerGlobalEntityID(EntityHunterChopper.class, "entity_mob_hunter_chopper", EntityRegistry.findGlobalUniqueEntityId(), 0x000020, 0x2D2D72);
	}

	@EventHandler
	public static void load(FMLInitializationEvent event)
	{
		OreDictionary.registerOre("ingotUranium", ModItems.ingot_uranium);
		OreDictionary.registerOre("ingotUranium235", ModItems.ingot_u235);
		OreDictionary.registerOre("ingotUranium238", ModItems.ingot_u238);
		OreDictionary.registerOre("ingotPlutonium", ModItems.ingot_plutonium);
		OreDictionary.registerOre("ingotPlutonium238", ModItems.ingot_pu238);
		OreDictionary.registerOre("ingotPlutonium239", ModItems.ingot_pu239);
		OreDictionary.registerOre("ingotPlutonium240", ModItems.ingot_pu240);
		OreDictionary.registerOre("U235", ModItems.ingot_u235);
		OreDictionary.registerOre("U238", ModItems.ingot_u238);
		OreDictionary.registerOre("Pu238", ModItems.ingot_pu238);
		OreDictionary.registerOre("Pu39", ModItems.ingot_pu239);
		OreDictionary.registerOre("Pu240", ModItems.ingot_pu240);
		OreDictionary.registerOre("ingotTitanium", ModItems.ingot_titanium);
		OreDictionary.registerOre("ingotSchrabidium", ModItems.ingot_schrabidium);
		OreDictionary.registerOre("dustSchrabidium", ModItems.powder_schrabidium);
		OreDictionary.registerOre("dustSulfur", ModItems.sulfur);
		OreDictionary.registerOre("dustNiter", ModItems.niter);
		OreDictionary.registerOre("dustSalpeter", ModItems.niter);
		OreDictionary.registerOre("dustLead", ModItems.powder_lead);
		OreDictionary.registerOre("dustNeptunium", ModItems.powder_neptunium);
		OreDictionary.registerOre("ingotCopper", ModItems.ingot_copper);
		OreDictionary.registerOre("ingotRedAlloy", ModItems.ingot_red_copper);
		OreDictionary.registerOre("ingotRedstoneAlloy", ModItems.ingot_red_copper);
		OreDictionary.registerOre("ingotAdvanced", ModItems.ingot_advanced_alloy);
		OreDictionary.registerOre("ingotAdvancedAlloy", ModItems.ingot_advanced_alloy);
		OreDictionary.registerOre("ingotTungsten", ModItems.ingot_tungsten);
		OreDictionary.registerOre("ingotAluminum", ModItems.ingot_aluminium);
		OreDictionary.registerOre("ingotNeptunium", ModItems.ingot_neptunium);
		OreDictionary.registerOre("ingotLead", ModItems.ingot_lead);
		OreDictionary.registerOre("ingotLithium", ModItems.lithium);
		OreDictionary.registerOre("ingotMagnetizedTungsten", ModItems.ingot_magnetized_tungsten);
		OreDictionary.registerOre("ingotCMBSteel", ModItems.ingot_combine_steel);
		OreDictionary.registerOre("dustFluorite", ModItems.fluorite);
		OreDictionary.registerOre("nuggetLead", ModItems.nugget_lead);
		OreDictionary.registerOre("nuggetUranium", ModItems.nugget_uranium);
		OreDictionary.registerOre("nuggetUranium235", ModItems.nugget_u235);
		OreDictionary.registerOre("nuggetUranium238", ModItems.nugget_u238);
		OreDictionary.registerOre("nuggetPlutonium", ModItems.nugget_plutonium);
		OreDictionary.registerOre("nuggetPlutonium238", ModItems.nugget_pu238);
		OreDictionary.registerOre("nuggetPlutonium239", ModItems.nugget_pu239);
		OreDictionary.registerOre("nuggetPlutonium240", ModItems.nugget_pu240);
		OreDictionary.registerOre("tinyU235", ModItems.nugget_u235);
		OreDictionary.registerOre("tinyU238", ModItems.nugget_u238);
		OreDictionary.registerOre("tinyPu238", ModItems.nugget_pu238);
		OreDictionary.registerOre("tinyPu239", ModItems.nugget_pu239);
		OreDictionary.registerOre("tinyPu240", ModItems.nugget_pu240);
		OreDictionary.registerOre("nuggetNeptunium", ModItems.nugget_neptunium);
		OreDictionary.registerOre("nuggetSchrabidium", ModItems.nugget_schrabidium);
		OreDictionary.registerOre("plateTitanium", ModItems.plate_titanium);
		OreDictionary.registerOre("plateAluminum", ModItems.plate_aluminium);
		OreDictionary.registerOre("plateDenseLead", ModItems.neutron_reflector);
		OreDictionary.registerOre("ingotSteel", ModItems.ingot_steel);
		OreDictionary.registerOre("plateSteel", ModItems.plate_steel);
		OreDictionary.registerOre("plateLead", ModItems.plate_lead);
		OreDictionary.registerOre("plateCopper", ModItems.plate_copper);
		OreDictionary.registerOre("plateIron", ModItems.plate_iron);
		OreDictionary.registerOre("plateGold", ModItems.plate_gold);
		OreDictionary.registerOre("plateAdvanced", ModItems.plate_advanced_alloy);
		OreDictionary.registerOre("plateSchrabidium", ModItems.plate_schrabidium);
		OreDictionary.registerOre("plateCMBSteel", ModItems.plate_combine_steel);
		OreDictionary.registerOre("dustIron", ModItems.powder_iron);
		OreDictionary.registerOre("dustGold", ModItems.powder_gold);
		OreDictionary.registerOre("dustUranium", ModItems.powder_uranium);
		OreDictionary.registerOre("dustPlutonium", ModItems.powder_plutonium);
		OreDictionary.registerOre("dustTitanium", ModItems.powder_titanium);
		OreDictionary.registerOre("dustTungsten", ModItems.powder_tungsten);
		OreDictionary.registerOre("dustCopper", ModItems.powder_copper);
		OreDictionary.registerOre("dustBeryllium", ModItems.powder_beryllium);
		OreDictionary.registerOre("dustAluminum", ModItems.powder_aluminium);
		OreDictionary.registerOre("dustDiamond", ModItems.powder_diamond);
		OreDictionary.registerOre("dustEmerald", ModItems.powder_emerald);
		OreDictionary.registerOre("dustLapis", ModItems.powder_lapis);
		OreDictionary.registerOre("dustCoal", ModItems.powder_coal);
		OreDictionary.registerOre("dustAdvanced", ModItems.powder_advanced_alloy);
		OreDictionary.registerOre("dustAdvancedAlloy", ModItems.powder_advanced_alloy);
		OreDictionary.registerOre("dustCMBSteel", ModItems.powder_combine_steel);
		OreDictionary.registerOre("dustMagnetizedTungsten", ModItems.powder_magnetized_tungsten);
		OreDictionary.registerOre("dustRedAlloy", ModItems.powder_red_copper);
		OreDictionary.registerOre("dustRedstoneAlloy", ModItems.powder_red_copper);
		OreDictionary.registerOre("dustSteel", ModItems.powder_steel);
		OreDictionary.registerOre("dustLithium", ModItems.powder_lithium);
		OreDictionary.registerOre("dustNetherQuartz", ModItems.powder_quartz);

		OreDictionary.registerOre("gemCoal", Items.coal);

		OreDictionary.registerOre("oreUranium", ModBlocks.ore_uranium);
		OreDictionary.registerOre("oreTitanium", ModBlocks.ore_titanium);
		OreDictionary.registerOre("oreSchrabidium", ModBlocks.ore_schrabidium);
		OreDictionary.registerOre("oreSulfur", ModBlocks.ore_sulfur);
		OreDictionary.registerOre("oreNiter", ModBlocks.ore_niter);
		OreDictionary.registerOre("oreSapeter", ModBlocks.ore_niter);
		OreDictionary.registerOre("oreCopper", ModBlocks.ore_copper);
		OreDictionary.registerOre("oreTungsten", ModBlocks.ore_tungsten);
		OreDictionary.registerOre("oreAluminum", ModBlocks.ore_aluminium);
		OreDictionary.registerOre("oreFluorite", ModBlocks.ore_fluorite);
		OreDictionary.registerOre("oreLead", ModBlocks.ore_lead);
		OreDictionary.registerOre("oreBeryllium", ModBlocks.ore_beryllium);

		OreDictionary.registerOre("oreUranium", ModBlocks.ore_nether_uranium);
		OreDictionary.registerOre("orePlutonium", ModBlocks.ore_nether_plutonium);
		OreDictionary.registerOre("oreTungsten", ModBlocks.ore_nether_tungsten);
		OreDictionary.registerOre("oreSulfur", ModBlocks.ore_nether_sulfur);
		OreDictionary.registerOre("oreSchrabidium", ModBlocks.ore_nether_schrabidium);

		OreDictionary.registerOre("blockUranium", ModBlocks.block_uranium);
		OreDictionary.registerOre("blockTitanium", ModBlocks.block_titanium);
		OreDictionary.registerOre("blockSulfur", ModBlocks.block_sulfur);
		OreDictionary.registerOre("blockNiter", ModBlocks.block_niter);
		OreDictionary.registerOre("blockSalpeter", ModBlocks.block_niter);
		OreDictionary.registerOre("blockCopper", ModBlocks.block_copper);
		OreDictionary.registerOre("blockRedAlloy", ModBlocks.block_red_copper);
		OreDictionary.registerOre("blockRedstoneAlloy", ModBlocks.block_red_copper);
		OreDictionary.registerOre("blockAdvanced", ModBlocks.block_advanced_alloy);
		OreDictionary.registerOre("blockTungsten", ModBlocks.block_tungsten);
		OreDictionary.registerOre("blockAluminum", ModBlocks.block_aluminium);
		OreDictionary.registerOre("blockFluorite", ModBlocks.block_fluorite);
		OreDictionary.registerOre("blockSteel", ModBlocks.block_steel);
		OreDictionary.registerOre("blockLead", ModBlocks.block_lead);
		OreDictionary.registerOre("blockBeryllium", ModBlocks.block_beryllium);
		OreDictionary.registerOre("blockSchrabidium", ModBlocks.block_schrabidium);
		OreDictionary.registerOre("blockCMBSteel", ModBlocks.block_combine_steel);
		OreDictionary.registerOre("blockMagnetizedTungsten", ModBlocks.block_magnetized_tungsten);
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		ShredderRecipe recipes = new MachineRecipes().new ShredderRecipe();
		
		recipes.registerEverythingImSrs();
		
		recipes.addRecipes();
		
		recipes.removeDuplicates();

		recipes.overridePreSetRecipe(new ItemStack(ModItems.scrap), new ItemStack(ModItems.dust));
		recipes.overridePreSetRecipe(new ItemStack(ModItems.dust), new ItemStack(ModItems.dust));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.glowstone), new ItemStack(Items.glowstone_dust, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.quartz_block, 1, 0), new ItemStack(ModItems.powder_quartz, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.quartz_block, 1, 1), new ItemStack(ModItems.powder_quartz, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.quartz_block, 1, 2), new ItemStack(ModItems.powder_quartz, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.quartz_stairs), new ItemStack(ModItems.powder_quartz, 3));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stone_slab, 1, 7), new ItemStack(ModItems.powder_quartz, 2));
		recipes.overridePreSetRecipe(new ItemStack(Items.quartz), new ItemStack(ModItems.powder_quartz));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.quartz_ore), new ItemStack(ModItems.powder_quartz, 2));
		recipes.overridePreSetRecipe(new ItemStack(ModBlocks.ore_nether_fire), new ItemStack(ModItems.powder_fire, 6));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5525318475377d238c79edc90a14ee8fa48397af
		recipes.overridePreSetRecipe(new ItemStack(ModBlocks.brick_light), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(ModBlocks.brick_concrete), new ItemStack(Blocks.gravel, 1));
		recipes.overridePreSetRecipe(new ItemStack(ModBlocks.brick_obsidian), new ItemStack(ModBlocks.gravel_obsidian, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.obsidian), new ItemStack(ModBlocks.gravel_obsidian, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stone), new ItemStack(Blocks.gravel, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.gravel, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.gravel, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.brick_block), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.brick_stairs), new ItemStack(Items.clay_ball, 3));
		recipes.overridePreSetRecipe(new ItemStack(Items.flower_pot), new ItemStack(Items.clay_ball, 3));
		recipes.overridePreSetRecipe(new ItemStack(Items.brick), new ItemStack(Items.clay_ball, 1));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.sandstone), new ItemStack(Blocks.sand, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.sandstone_stairs), new ItemStack(Blocks.sand, 6));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.clay), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.hardened_clay), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 0), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 1), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 2), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 3), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 4), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 5), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 6), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 7), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 8), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 9), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 10), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 11), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 12), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 13), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 14), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.stained_hardened_clay, 1, 15), new ItemStack(Items.clay_ball, 4));
		recipes.overridePreSetRecipe(new ItemStack(Blocks.tnt), new ItemStack(Items.gunpowder, 5));
<<<<<<< HEAD
=======
=======
>>>>>>> 540fb3d256a0f4ae6a8b1db586f8e9cfd6ed7372
>>>>>>> 5525318475377d238c79edc90a14ee8fa48397af
		
		recipes.PrintRecipes();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new ModEventHandler());
		MinecraftForge.EVENT_BUS.register(new ModEventHandler());
		MinecraftForge.TERRAIN_GEN_BUS.register(new ModEventHandler());
		MinecraftForge.ORE_GEN_BUS.register(new ModEventHandler());

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
        enableDebugMode = config.get(Configuration.CATEGORY_GENERAL, "1.0_enableDebugMode", false).getBoolean(false);
        enableMycelium = config.get(Configuration.CATEGORY_GENERAL, "1.1_enableMyceliumSpread", false).getBoolean(false);
        enablePlutoniumOre = config.get(Configuration.CATEGORY_GENERAL, "1.2_enablePlutoniumNetherOre", false).getBoolean(false);
        enableDungeons = config.get(Configuration.CATEGORY_GENERAL, "1.3_enableDungeonSpawn", true).getBoolean(true);
        enableMDOres = config.get(Configuration.CATEGORY_GENERAL, "1.4_enableOresInModdedDimensions", true).getBoolean(true);
        enableBarrels = config.get(Configuration.CATEGORY_GENERAL, "1.5_enableNuclearBarrelSpawn", false).getBoolean(false);
        enableNITAN = config.get(Configuration.CATEGORY_GENERAL, "1.6_enableNITANChestSpawn", true).getBoolean(true);
        enableNukeClouds = config.get(Configuration.CATEGORY_GENERAL, "1.7_enableMushroomClouds", true).getBoolean(true);

        Property PuraniumSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.0_uraniumSpawnrate", 7);
        PuraniumSpawn.comment = "Ammount of uranium ore veins per chunk";
        uraniumSpawn = PuraniumSpawn.getInt();
        Property PtitaniumSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.1_titaniumSpawnrate", 8);
        PtitaniumSpawn.comment = "Ammount of titanium ore veins per chunk";
        titaniumSpawn = PtitaniumSpawn.getInt();
        Property PsulfurSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.2_sulfurSpawnrate", 5);
        PsulfurSpawn.comment = "Ammount of sulfur ore veins per chunk";
        sulfurSpawn = PsulfurSpawn.getInt();
        Property PaluminiumSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.3_aluminiumSpawnrate", 7);
        PaluminiumSpawn.comment = "Ammount of aluminium ore veins per chunk";
        aluminiumSpawn = PaluminiumSpawn.getInt();
        Property PcopperSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.4_copperSpawnrate", 12);
        PcopperSpawn.comment = "Ammount of copper ore veins per chunk";
        copperSpawn = PcopperSpawn.getInt();
        Property PFluoriteSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.5_fluoriteSpawnrate", 6);
        PFluoriteSpawn.comment = "Ammount of fluorite ore veins per chunk";
        fluoriteSpawn = PFluoriteSpawn.getInt();
        Property PNiterSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.6_niterSpawnrate", 4);
        PNiterSpawn.comment = "Ammount of niter ore veins per chunk";
        niterSpawn = PNiterSpawn.getInt();
        Property PtungstenSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.7_tungstenSpawnrate", 10);
        PtungstenSpawn.comment = "Ammount of tungsten ore veins per chunk";
        tungstenSpawn = PtungstenSpawn.getInt();
        Property PleadSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.8_leadSpawnrate", 6);
        PleadSpawn.comment = "Ammount of lead ore veins per chunk";
        leadSpawn = PleadSpawn.getInt();
        Property PberylliumSpawn = config.get(Configuration.CATEGORY_GENERAL, "2.9_berylliumSpawnrate", 6);
        PberylliumSpawn.comment = "Ammount of beryllium ore veins per chunk";
        berylliumSpawn = PberylliumSpawn.getInt();
        
        Property propGadget = config.get(Configuration.CATEGORY_GENERAL, "3.0_gadgetRadius", 150);
        propGadget.comment = "Radius of the Gadget";
        gadgetRadius = propGadget.getInt();
        Property propBoy = config.get(Configuration.CATEGORY_GENERAL, "3.1_boyRadius", 120);
        propBoy.comment = "Radius of Little Boy";
        boyRadius = propBoy.getInt();
        Property propMan = config.get(Configuration.CATEGORY_GENERAL, "3.2_manRadius", 175);
        propMan.comment = "Radius of Fat Man";
        manRadius = propMan.getInt();
        Property propMike = config.get(Configuration.CATEGORY_GENERAL, "3.3_mikeRadius", 250);
        propMike.comment = "Radius of Ivy Mike";
        mikeRadius = propMike.getInt();
        Property propTsar = config.get(Configuration.CATEGORY_GENERAL, "3.4_tsarRadius", 500);
        propTsar.comment = "Radius of the Tsar Bomba";
        tsarRadius = propTsar.getInt();
        Property propPrototype = config.get(Configuration.CATEGORY_GENERAL, "3.5_prototypeRadius", 150);
        propPrototype.comment = "Radius of the Prototype";
        prototypeRadius = propPrototype.getInt();
        Property propFleija = config.get(Configuration.CATEGORY_GENERAL, "3.6_fleijaRadius", 50);
        propFleija.comment = "Radius of F.L.E.I.J.A.";
        fleijaRadius = propFleija.getInt();
        Property propMissile = config.get(Configuration.CATEGORY_GENERAL, "3.7_missileRadius", 100);
        propMissile.comment = "Radius of the nuclear missile";
        missileRadius = propMissile.getInt();
        Property propMirv = config.get(Configuration.CATEGORY_GENERAL, "3.8_mirvRadius", 100);
        propMirv.comment = "Radius of a MIRV";
        mirvRadius = propMirv.getInt();
        Property propFatman = config.get(Configuration.CATEGORY_GENERAL, "3.9_fatmanRadius", 35);
        propFatman.comment = "Radius of the Fatman Launcher";
        fatmanRadius = propFatman.getInt();
        Property propNuka = config.get(Configuration.CATEGORY_GENERAL, "3.91_nukaRadius", 25);
        propNuka.comment = "Radius of the nuka grenade";
        nukaRadius = propNuka.getInt();
        Property propASchrab = config.get(Configuration.CATEGORY_GENERAL, "3.92_aSchrabRadius", 20);
        propASchrab.comment = "Radius of dropped anti schrabidium";
        aSchrabRadius = propASchrab.getInt();

        Property propRadio = config.get(Configuration.CATEGORY_GENERAL, "4.0_radioSpawn", 500);
        propRadio.comment = "Spawn radio station on every nTH chunk";
        radioStructure = propRadio.getInt();
        Property propAntenna = config.get(Configuration.CATEGORY_GENERAL, "4.1_antennaSpawn", 250);
        propAntenna.comment = "Spawn antenna on every nTH chunk";
        antennaStructure = propAntenna.getInt();
        Property propAtom = config.get(Configuration.CATEGORY_GENERAL, "4.2_atomSpawn", 500);
        propAtom.comment = "Spawn power plant on every nTH chunk";
        atomStructure = propAtom.getInt();
        Property propVertibird = config.get(Configuration.CATEGORY_GENERAL, "4.3_vertibirdSpawn", 500);
        propVertibird.comment = "Spawn vertibird on every nTH chunk";
        vertibirdStructure = propVertibird.getInt();
        Property propDungeon = config.get(Configuration.CATEGORY_GENERAL, "4.4_dungeonSpawn", 64);
        propDungeon.comment = "Spawn library dungeon on every nTH chunk";
        dungeonStructure = propDungeon.getInt();
        Property propRelay = config.get(Configuration.CATEGORY_GENERAL, "4.5_relaySpawn", 500);
        propRelay.comment = "Spawn relay on every nTH chunk";
        relayStructure = propRelay.getInt();
        Property propSatellite = config.get(Configuration.CATEGORY_GENERAL, "4.6_satelliteSpawn", 500);
        propSatellite.comment = "Spawn satellite dish on every nTH chunk";
        satelliteStructure = propSatellite.getInt();
        Property propBunker = config.get(Configuration.CATEGORY_GENERAL, "4.7_bunkerSpawn", 1000);
        propBunker.comment = "Spawn bunker on every nTH chunk";
        bunkerStructure = propBunker.getInt();
        Property propSilo = config.get(Configuration.CATEGORY_GENERAL, "4.8_siloSpawn", 1000);
        propSilo.comment = "Spawn missile silo on every nTH chunk";
        siloStructure = propSilo.getInt();
        Property propFactory = config.get(Configuration.CATEGORY_GENERAL, "4.9_factorySpawn", 1000);
        propFactory.comment = "Spawn factory on every nTH chunk";
        factoryStructure = propFactory.getInt();
        Property propDud = config.get(Configuration.CATEGORY_GENERAL, "4.91_dudSpawn", 500);
        propDud.comment = "Spawn dud on every nTH chunk";
        dudStructure = propDud.getInt();
        Property propSpaceship = config.get(Configuration.CATEGORY_GENERAL, "4.92_spaceshipSpawn", 1000);
        propSpaceship.comment = "Spawn spaceship on every nTH chunk";
        spaceshipStructure = propSpaceship.getInt();
        
        config.save();
	}
}
