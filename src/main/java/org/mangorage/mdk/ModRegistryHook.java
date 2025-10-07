package org.mangorage.mdk;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class ModRegistryHook {
    public static void register() {
        final var block = Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath("mango", "test"),
                new Block(
                        BlockBehaviour.Properties.of()
                                .setId(
                                        ResourceKey.create(
                                                Registries.BLOCK,
                                                ResourceLocation.fromNamespaceAndPath("mango", "test")
                                        )
                                )
                )
        );
        UnmodifiableIterator var2 = block.getStateDefinition().getPossibleStates().iterator();

        while(var2.hasNext()) {
            BlockState var3 = (BlockState)var2.next();
            Block.BLOCK_STATE_REGISTRY.add(var3);
            var3.initCache();
        }
    }
}
