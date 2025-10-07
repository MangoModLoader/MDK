package org.mangorage.mdk;

import org.mangorage.loader.api.mod.IModContainer;
import org.spongepowered.asm.mixin.Mixins;

public final class ExampleClass implements IModContainer<ExampleMod> {
    private ExampleMod exampleMod;

    public void init() {
        Mixins.addConfiguration("example.mixins.json");
        exampleMod = new ExampleMod();
    }

    @Override
    public ExampleMod getInstance() {
        return exampleMod;
    }

    @Override
    public String getId() {
        return "example";
    }
}
