package dev.vfyjxf.jrc;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.search.method.InputMethodRegistry;
import net.minecraft.resources.ResourceLocation;


public class ReiPluginImpl implements REIClientPlugin {

    @Override
    public void registerInputMethods(InputMethodRegistry registry) {
        registry.add(new ResourceLocation("jrc", "jech"), new JechInputMethod());
    }
}
