package com.deextinction.deextinction.blocks.machine.recipes;

import java.util.Map;
import java.util.Map.Entry;

import com.deextinction.deextinction.init.DeexItem;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;

public class CleaningTableRecipes 
{	
	private static final CleaningTableRecipes INSTANCE = new CleaningTableRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static CleaningTableRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private CleaningTableRecipes() 
	{
		addCleaningTableRecipe(new ItemStack(DeexItem.CHISEL), new ItemStack(DeexItem.CENOZOIC_FOSSIL_DIRTY), new ItemStack(DeexItem.CENOZOIC_FOSSIL_CLEAN), 5.0F);
		addCleaningTableRecipe(new ItemStack(DeexItem.CHISEL), new ItemStack(DeexItem.MESOZOIC_FOSSIL_DIRTY), new ItemStack(DeexItem.MESOZOIC_FOSSIL_CLEAN), 5.0F);
		addCleaningTableRecipe(new ItemStack(DeexItem.CHISEL), new ItemStack(DeexItem.PALEOZOIC_FOSSIL_DIRTY), new ItemStack(DeexItem.PALEOZOIC_FOSSIL_CLEAN), 5.0F);
	}

	
	public void addCleaningTableRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getCleaningTableResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCleaningTableResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getCleaningTableExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}