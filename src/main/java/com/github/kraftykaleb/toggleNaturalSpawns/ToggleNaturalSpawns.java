package com.github.kraftykaleb.toggleNaturalSpawns;

import com.github.kraftykaleb.toggleNaturalSpawns.listener.ChunkLoadListener;
import com.github.kraftykaleb.toggleNaturalSpawns.listener.EntitySpawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ToggleNaturalSpawns extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntitySpawnListener(), this);
        getServer().getPluginManager().registerEvents(new ChunkLoadListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
