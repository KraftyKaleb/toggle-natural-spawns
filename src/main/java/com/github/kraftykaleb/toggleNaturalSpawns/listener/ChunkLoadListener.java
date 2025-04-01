package com.github.kraftykaleb.toggleNaturalSpawns.listener;

import com.github.kraftykaleb.toggleNaturalSpawns.constant.MobException;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.Arrays;

public class ChunkLoadListener implements Listener {
    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        if (event.isNewChunk()) {
            for (Entity entity : event.getChunk().getEntities()) {
                Class<?> clazz = entity.getType().getEntityClass();
                assert clazz != null;

                if (Arrays.stream(MobException.values()).anyMatch(exception -> exception.entityType == entity.getType())) return;

                if (Animals.class.isAssignableFrom(clazz) || Bat.class.isAssignableFrom(clazz)) {
                    entity.remove();
                }
            }
        }
    }
}
