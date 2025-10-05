package org.mangorage.mdk;

import net.minecraft.client.Minecraft;
import org.mangorage.loader.api.mod.IModContainer;
import org.spongepowered.asm.mixin.Mixins;

public final class ExampleClass implements IModContainer<ExampleClass> {
    public static void main(String[] args) {
        Minecraft minecraft = Minecraft.getInstance();
    }

    public void init() {
        // How to add mixins -> Mixins.addConfiguration("example.mixins.json");
    }

    @Override
    public ExampleClass getInstance() {
        return null;
    }

    @Override
    public String getId() {
        return "";
    }
}
