package carpet.script.external;

import carpet.CarpetSettings;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.permissions.PermissionSet;

public class Vanilla
{
    public static PermissionSet MinecraftServer_getRunPermissionLevel(MinecraftServer server)
    {
        return CarpetSettings.runPermissionLevel;
    }
}