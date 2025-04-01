package com.github.kraftykaleb.toggleNaturalSpawns.constant;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public enum MobException {
    BEE(EntityType.BEE),
    HOGLIN(EntityType.HOGLIN),
    SNIFFER(EntityType.SNIFFER),
    TRADER_LLAMA(EntityType.TRADER_LLAMA),
    SKELETON_HORSE(EntityType.SKELETON_HORSE);

    public final EntityType entityType;

    MobException(EntityType entityType) {
        this.entityType = entityType;
    }
}

