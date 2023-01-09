package azuazu3939.worldselectcombatmath;

import org.bukkit.plugin.java.JavaPlugin;

public final class WorldSelectCombatMath extends JavaPlugin {

    private static WorldSelectCombatMath world;
    public WorldSelectCombatMath() {world = this;}
    public static WorldSelectCombatMath inst() {return  world;}

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new WorldSelectListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
