package cn.codetector.minecraftplugins.gamemode4.potionSword;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventListener implements Listener {
    final ItemStack slowpotion = new ItemStack(Material.POTION, 1, (short)8266);
    final ItemStack slowpotion1 = new ItemStack(Material.POTION, 1, (short)8202);
    final ItemStack posion1 = new ItemStack(Material.POTION,1,(short)8196);
    final ItemStack posionext = new ItemStack(Material.POTION,1,(short)8260);
    final ItemStack posion2 = new ItemStack(Material.POTION,1,(short)8228);
    final ItemStack health = new ItemStack(Material.POTION,1,(short)8197);
    final ItemStack health2 = new ItemStack(Material.POTION,1,(short)8229);

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player){
            Player player = (Player)e.getDamager();
            ItemStack item = player.getInventory().getItemInHand();
            if (item != null && item.getType() == Material.GOLD_SWORD){
                if(player.getInventory().contains(slowpotion) || player.getInventory().contains(slowpotion1)){
                    if(e.getEntity() instanceof LivingEntity){
                        LivingEntity entity = (LivingEntity)e.getEntity();
                        entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,255));
                    }
                }
                if(player.getInventory().contains(posion1) || player.getInventory().contains(posion2)|| player.getInventory().contains(posionext)){
                    if(e.getEntity() instanceof LivingEntity){
                        LivingEntity entity = (LivingEntity)e.getEntity();
                        entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,60,0));
                    }
                }
                if(player.getInventory().contains(health) || player.getInventory().contains(health2)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION,200,1));
                }
            }
        }
    }
}
