package com.beariumdev.beariumscornucopia;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static void category(ModConfigSpec.Builder builder, String name, Runnable definitions) {
        builder.push(name);
        definitions.run();
        builder.pop();
    }

    // #region Config Variables
    public static ModConfigSpec.BooleanValue advancementOverhaulEnabled;
    // #endregion

    static {
        category(BUILDER, "Advancement Overhaul", () -> {
            advancementOverhaulEnabled = BUILDER
                    .comment("[Feature Toggle] Use the custom advancement screen")
                    .define("advancementOverhaulEnabled", true);
        });
    }

    public static final ModConfigSpec CONFIG_SPEC = BUILDER.build();
}