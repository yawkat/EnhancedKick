package at.yawk.bukkit.enhancedkick;

import org.bukkit.ChatColor;

public class EnhancedKick extends org.bukkit.plugin.java.JavaPlugin {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String lbl, String[] args) {
        if (args.length != 1) {
            sender.sendMessage(ChatColor.GOLD + "[EnhancedKick] Usage: /ckick <username>");
        } else {
            final org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(args[0]);
            if (player == null) {
                sender.sendMessage(ChatColor.GOLD + "[EnhancedKick] Unknown player!");
            } else {
                ((org.bukkit.craftbukkit.v1_5_R3.entity.CraftPlayer) player).getHandle().playerConnection.sendPacket(new net.minecraft.server.v1_5_R3.Packet61WorldEvent(2001, 0, 0, 0, 0x105, false));
                sender.sendMessage(ChatColor.GOLD + "[EnhancedKick] Kicked!");
            }
        }
        return true;
    }
}
