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

package com.Kylin_Lu.StairsRevolution.items;

import com.Kylin_Lu.StairsRevolution.StairsRevolution;
import net.minecraft.item.Item;

import com.Kylin_Lu.StairsRevolution.creativetab.CreativeTabsLoader;

public class ItemStoneCarvingTool extends Item{
    public ItemStoneCarvingTool(){
        super();
        this.setUnlocalizedName("StoneCarvingTool");
        this.setCreativeTab(CreativeTabsLoader.tabStairsRevolution);
        this.setTextureName(StairsRevolution.MODID + ":carvingtool_stone");
    }
}
