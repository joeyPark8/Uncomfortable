package uncomfort;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Uncomfortable is activated");
    }

    @Override
    public void onDisable() {
        System.out.println("Uncomfortable is deactivated");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("uca")) {
            ItemStack stack = new ItemStack(Material.BARRIER);

            player.getInventory().addItem(stack);
            player.getInventory().setHelmet(stack);
            player.getInventory().setChestplate(stack);
            player.getInventory().setLeggings(stack);
            player.getInventory().setBoots(stack);
        }

        return true;
    }
}
