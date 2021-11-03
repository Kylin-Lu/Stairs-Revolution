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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemLoader {
    public static Item StoneCarvingTool = new ItemStoneCarvingTool();
    public static Item IronCarvingTool = new ItemIronCarvingTool();
    public static Item GoldCarvingTool = new ItemGoldCarvingTool();
    public static Item DiamondCarvingTool = new ItemDiamondCarvingTool();

    public ItemLoader(FMLPreInitializationEvent event) {
        register(StoneCarvingTool, "stone_carving_tool");
        register(IronCarvingTool, "iron_carving_tool");
        register(GoldCarvingTool, "gold_carving_tool");
        register(DiamondCarvingTool, "diamond_carving_tool");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(StoneCarvingTool);
        registerRender(IronCarvingTool);
        registerRender(GoldCarvingTool);
        registerRender(DiamondCarvingTool);
    }

    private static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {

    }
}
