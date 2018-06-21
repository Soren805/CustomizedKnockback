package fr.soren805.customizedknockback.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import fr.soren805.customizedknockback.Main;

public class ListenersExec implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	private FileConfiguration config;
	
	public ListenersExec(Main main) {
		this.main = main;
		this.config = main.getConfig();
	}
	
	@EventHandler
    private void entityDamageByEntity(EntityDamageByEntityEvent event) {
		if(!(event.getEntity() instanceof Player)) {
            return;
        }
        Player player = (Player) event.getEntity();
        player.setVelocity(player.getVelocity().setX(config.getInt("customizedknockback.knockback.x")).setY(config.getInt("customizedknockback.knockback.y")).setZ(config.getInt("customizedknockback.knockback.z")));
    }

}
