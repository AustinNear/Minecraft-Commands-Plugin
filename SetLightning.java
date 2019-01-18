package io.github.austinnear.Commands;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class SetLightning implements CommandExecutor{
	static HashMap<Player, Material> map = new HashMap<>();
	static Material matinhand;
	static PlayerInventory pinv;
	static Player player;
	static ItemStack inhand;
	static boolean used = false;
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			player = (Player)sender;
			pinv = player.getInventory();
			if(pinv.getItemInMainHand() != null)
				inhand = pinv.getItemInMainHand();
			else
				matinhand = Material.WOODEN_AXE;
			
			matinhand = inhand.getType();
		    
			map.put(player, matinhand);
			}
		used = true;
		return true;
		
	}
}

