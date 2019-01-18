package io.github.austinnear.Commands;

import java.util.HashMap;

import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	String[] args = new String[1];
			@Override
		    public void onEnable() {
		        this.getCommand("lightning").setExecutor(new LightningatPos());
		        this.getCommand("setlightning").setExecutor(new SetLightning());
		        this.getCommand("setmobhealth").setExecutor(new SetMobHealth());
		        getServer().getPluginManager().registerEvents(this, this);
			}
			@EventHandler
			public void onPlayerRightClick(PlayerInteractEvent e) {
				if(SetLightning.used) {
					if((SetLightning.pinv.getItemInMainHand().getType() == SetLightning.matinhand) && e.getAction().equals(Action.RIGHT_CLICK_AIR))
						this.getCommand("lightning").execute((CommandSender)SetLightning.player, "lightning", args);
				
					}
			}	
			
			@EventHandler
			public void onCreatureSpawn(CreatureSpawnEvent e) {
				if(SetMobHealth.mob != null) {
					if(e.getEntityType().name().equals(SetMobHealth.mob))
						e.getEntity().setHealth(Double.parseDouble(SetMobHealth.argument[1]));
					
				}
			}	
		
	}


