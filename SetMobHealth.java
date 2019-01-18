package io.github.austinnear.Commands;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SetMobHealth implements CommandExecutor{
	static HashMap<String, Material> map = new HashMap<>();
	static ArrayList<String> moblist = new ArrayList<String>();
	static String mob;
	static String[] argument = new String[2];
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		for (EntityType entity : EntityType.values()) {
		   moblist.add(entity.name());
		}
		    
		for(int i = 0; i < 2; i++)
				argument[i] = args[i];
		
	if(moblist.contains(argument[0])) {
			mob = argument[0];
		}
		return true;	
		
	}
	
  }

