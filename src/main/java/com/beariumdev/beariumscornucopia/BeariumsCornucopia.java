package com.beariumdev.beariumscornucopia;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;



@Mod(BeariumsCornucopia.MODID)
public class BeariumsCornucopia {
    public static final String MODID = "beariumcraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BeariumsCornucopia(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Bearium's Cornucopia loaded");
    }
}
