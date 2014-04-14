package com.internetsam.craft_a_friend;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Craft_A_Friend extends JavaPlugin {
	@Override
	public void onEnable(){
		craftAFriend();
	}
	
	@Override
	public void onDisable(){
		
	}
	
	private void craftAFriend(){
		
            @SuppressWarnings("deprecation")
			ItemStack friend = new ItemStack(383, 1, (short) 90);
            ItemMeta friendMeta = friend.getItemMeta();
            friendMeta.setDisplayName(ChatColor.GOLD + "Your new friend");
            friendMeta.setLore(Arrays.asList("This is your new friend!", "He'll keep your company :D", "",ChatColor.GREEN + "(Don't forget to use a lead!)"));
            friend.setItemMeta(friendMeta);
           
            ShapedRecipe friendRecipe = new ShapedRecipe(friend);
            friendRecipe.shape(" % ", "@!@", " @ ");
            friendRecipe.setIngredient('%', Material.PORK);
            friendRecipe.setIngredient('@', Material.STICK);
            friendRecipe.setIngredient('!', Material.DIAMOND_BLOCK);


            Bukkit.getServer().addRecipe(friendRecipe);
    }
	
}
