package io.github.austinnear.Commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LightningatPos implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player)sender;
			Block targettedblock = player.getTargetBlock(null, 200);
			Location playeraim = targettedblock.getLocation();
			World world = player.getWorld();
			world.strikeLightningEffect(playeraim);
		}
		return true;
	}

}
