package org.mangorage.mdk.mixins;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.level.block.Blocks;
import org.mangorage.mdk.ModRegistryHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BuiltInRegistries.class)
public final class BootstrapMixin {
    @Inject(method = "bootStrap", at = @At("HEAD"))
    private static void bootStrap(CallbackInfo ci) {
        System.out.println("Ok!");
        ModRegistryHook.register();
    }
}
