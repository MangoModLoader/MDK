import org.mangorage.loader.api.mod.IModContainer;

open module mangomodloader.mdk.main {
    requires org.mangorage.mangomodloader;
    requires mixinextras.common;
    requires org.spongepowered.mixin;
    requires minecraft;
    requires com.google.common;

    uses IModContainer;
    provides IModContainer with org.mangorage.mdk.ExampleClass;
}