package com.beariumdev.beariumscornucopia;

import net.neoforged.neoforge.common.ModConfigSpec;

import org.apache.commons.lang3.tuple.Pair;
import java.util.function.Supplier;

public class Config {
    public static final Config CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<Config, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(Config::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private static <T> T category(ModConfigSpec.Builder builder, String name, String comment, Supplier<T> contents) {
        builder.comment(comment).push(name);
        T value = contents.get();
        builder.pop();
        return value;
    }

    public final ModConfigSpec.BooleanValue advancementOverhaulEnabled;

    private Config(ModConfigSpec.Builder builder) {
        advancementOverhaulEnabled = category(builder, "UI", "UI-related settings",
                () -> category(builder, "AdvancementOverhaul", "AdvancementOverhaul Related Settings",
                        () -> builder.comment("Enables the AdvancementOverhaul feature").define("enabled", true)));

        // i dont like this indentation but visual studio "keeps on indenting" it like this so i have no choice
        // well i do have a choice but thats a lot of work O_o
    }
}