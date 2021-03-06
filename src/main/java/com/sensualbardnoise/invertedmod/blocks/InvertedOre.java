package com.sensualbardnoise.invertedmod.blocks;
import com.sensualbardnoise.invertedmod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class InvertedOre extends BlockBase{

	public InvertedOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F); //How hard it is to mine
		setResistance(30.0F); //How hard it is to explode
		setHarvestLevel("pickaxe", 3); //0 = wood, 1 = stone/gold, 2 = iron, 3 = diamond
		setLightLevel(0.0F); //How much light block emits
		//setLightOpacity(0);  //How much light goes through, 0 for none, 1 for all
		//setBlockUnbreakable();
	}

}
