/*
 * This file is a part of Stairs Revolution.
 * Copyright (c) 2021 - 2022, Kylin_Lu, All rights reserved.
 *
 * Stairs Revolution is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Stairs Revolution is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Stairs Revolution. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package com.Kylin_Lu.StairsRevolution.block;

import com.Kylin_Lu.StairsRevolution.block.quarterblocks.BlockStoneQuarterBlock;
import com.Kylin_Lu.StairsRevolution.block.octantblocks.BlockStoneOctantBlock;
import com.Kylin_Lu.StairsRevolution.block.verticalslabs.BlockStoneVerticalSlab;

import net.minecraft.block.Block;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockLoader {
    public static Block StoneQuarterBlock =  new BlockStoneQuarterBlock();
    public static Block StoneOctantBlock = new BlockStoneOctantBlock();
    public static Block StoneVerticalSlab = new BlockStoneVerticalSlab();

    public BlockLoader(FMLPreInitializationEvent event){
        register(StoneQuarterBlock, "stone_quarter_block");
        register(StoneOctantBlock, "stone_octant_block");
        register(StoneVerticalSlab, "stone_vertical_block");

    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(StoneQuarterBlock);
        registerRender(StoneOctantBlock);
        registerRender(StoneVerticalSlab);
    }

    private static void register(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
   {

    }
}
