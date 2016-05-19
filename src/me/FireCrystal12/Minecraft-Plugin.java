import org.bukkit.ChatColor;
import org.bukkit.CommandSender;
import org.bukkit.JavaPlugin;
import org.bukkit.Command;
import org.bukkit.Player;

public class Minecraft-Plugin extends JavaPlugin{
    
    public void onEnable(){
      getLogger().info("onEnable has been enabled!")
    }
    
    public void onDisable(){
    
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
      
      if (cmd.getName().equalsIgnoreCase("mcplugin") && sender instanceof player){
        
        Player player = (player) sender;
        
        player.sendMessage(ChatColor.DARK_GREEN + "Get rekt, " + player.getName());
        
        
      }
    }
}
