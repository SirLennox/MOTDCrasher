package dev.sirlennox.motdcrasher;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public class EventListeners implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PostLoginEvent e) {
        e.getPlayer().disconnect(new TextComponent(MOTDCrasher.getMotdCrasher().getCrashString()));
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPing(ProxyPingEvent e) {
        ServerPing ping = new ServerPing();
        ping.setDescriptionComponent(new TextComponent(MOTDCrasher.getMotdCrasher().getCrashString()));
        e.setResponse(ping);
    }

}
