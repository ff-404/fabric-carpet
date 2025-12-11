package carpet.fakes;

import java.util.stream.Stream;

import net.minecraft.world.entity.Entity;

public interface EntityInterface
{
    float getMainYaw(float partialTicks);

    Stream<Entity> cm$getIndirectPassengersStream();
}