package net.arcaniax.gopaint.utils;

import org.bukkit.Material;

public final class VersionCheck {

    private static final Boolean NEWER_VERSION;
    static {
        NEWER_VERSION = Material.getMaterial("SKULL_ITEM") == null;
    }

    public static Boolean isNewerVersion() {
        return NEWER_VERSION;
    }

}
