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

package com.Kylin_Lu.StairsRevolution;

import com.Kylin_Lu.StairsRevolution.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = com.Kylin_Lu.StairsRevolution.StairsRevolution.MODID, name = com.Kylin_Lu.StairsRevolution.StairsRevolution.NAME, version = com.Kylin_Lu.StairsRevolution.StairsRevolution.VERSION, acceptedMinecraftVersions = "1.7.10")
public class StairsRevolution
{
    public static final String MODID = "StairsRevolution";
    public static final String NAME = "Stairs Revolution";
    public static final String VERSION = "1.0.0";

    @Instance(StairsRevolution.MODID)
    public static StairsRevolution instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.Kylin_Lu.StairsRevolution.client.ClientProxy",
            serverSide = "com.Kylin_Lu.StairsRevolution.common.CommonProxy")
    public static CommonProxy proxy;
}