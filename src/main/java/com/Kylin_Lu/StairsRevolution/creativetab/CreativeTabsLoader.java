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

package com.Kylin_Lu.StairsRevolution.creativetab;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsLoader {
    public static CreativeTabs tabStairsRevolution;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
        tabStairsRevolution = new CreativeTabsStairsRevolution();
    }
}
