package com.github.kraftykaleb.toggleNaturalSpawns.listener;

import com.github.kraftykaleb.toggleNaturalSpawns.constant.MobException;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Bat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Arrays;

public class EntitySpawnListener implements Listener {

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
            Class<?> clazz = event.getEntity().getType().getEntityClass();
            assert clazz != null;

            if (Arrays.stream(MobException.values()).anyMatch(exception -> exception.entityType == event.getEntityType())) return;

            if (Animals.class.isAssignableFrom(clazz) || Bat.class.isAssignableFrom(clazz)) {
                event.setCancelled(true);
            }
        }
    }
}
