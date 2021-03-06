
package com.deextinction.deextinction.init;

import java.util.ArrayList;
import java.util.List;

import com.deextinction.deextinction.blocks.CenozoicFossilBlock;
import com.deextinction.deextinction.blocks.MachineBlock;
import com.deextinction.deextinction.blocks.MesozoicFossilBlock;
import com.deextinction.deextinction.blocks.PaleozoicFossilBlock;
import com.deextinction.deextinction.blocks.PermafrostBlock;
import com.deextinction.deextinction.blocks.machine.cleaning.CleaningTableBlock;
import com.deextinction.deextinction.blocks.machine.egen.EstorageBlock;
import com.deextinction.deextinction.blocks.machine.egen.GeneratorBlock;
import com.deextinction.deextinction.blocks.machine.egen.SolarBlock;
import com.deextinction.deextinction.blocks.machine.egen.WaterGeneratorBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.CentrifugeBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.ComputerBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.DNADecoderBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.EggMachineBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.GrinderBlock;
import com.deextinction.deextinction.blocks.machine.embryogen.MicroscopeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DeexBlocks
{
     public static final List<Block> BLOCKS = new ArrayList<Block>();
	
     public static final Block CENOZOIC_FOSSIL_BLOCK = new CenozoicFossilBlock("cenozoic_fossil_block", Material.ROCK);	
     public static final Block MESOZOIC_FOSSIL_BLOCK = new MesozoicFossilBlock("mesozoic_fossil_block", Material.ROCK);
     public static final Block PALEOZOIC_FOSSIL_BLOCK = new PaleozoicFossilBlock("paleozoic_fossil_block", Material.ROCK);
     public static final Block PERMAFROST_BLOCK = new PermafrostBlock("permafrost_block", Material.ICE);
     public static final Block MACHINE_BLOCK = new MachineBlock("machine_block", Material.IRON);

    
	public static final  Block CLEANING_TABLE_BLOCK = new CleaningTableBlock("cleaning_table_block");
	public static final  Block DNA_DECODER_BLOCK = new DNADecoderBlock("dna_decoder_block");
	public static final  Block EGG_MACHINE_BLOCK = new EggMachineBlock("egg_machine_block");
	public static final  Block CENTRIFUGE_BLOCK = new CentrifugeBlock("centrifuge_block");
	public static final  Block GRINDER_BLOCK = new GrinderBlock("grinder_block");
	public static final  Block MICROSCOPE_BLOCK = new MicroscopeBlock("microscope_block");
	public static final  Block WATER_GENERATOR_BLOCK = new WaterGeneratorBlock("water_generator_block");
	public static final  Block SOLAR_BLOCK = new SolarBlock("solar_block");
	public static final  Block ESTORAGE_BLOCK = new EstorageBlock("estorage_block");
	public static final  Block GENERATOR_BLOCK = new GeneratorBlock("generator_block");
	public static final  Block COMPUTER_BLOCK = new ComputerBlock("computer_block");
	

}
