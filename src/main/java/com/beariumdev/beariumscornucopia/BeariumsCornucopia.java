package com.beariumdev.beariumscornucopia;
import com.beariumdev.beariumscornucopia.Config;


import org.slf4j.Logger;


import com.mojang.logging.LogUtils;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(BeariumsCornucopia.MODID)
public class BeariumsCornucopia {
    public static final String MODID = "beariumscornucopia";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BeariumsCornucopia(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Bearium's Cornucopia loaded");

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.CONFIG_SPEC, MODID + ".toml");
    }
}
