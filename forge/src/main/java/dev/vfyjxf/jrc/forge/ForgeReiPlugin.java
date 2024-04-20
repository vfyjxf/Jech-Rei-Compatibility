package dev.vfyjxf.jrc.forge;


import dev.vfyjxf.jrc.JechInputMethod;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.search.method.InputMethodRegistry;
import me.shedaniel.rei.forge.REIPluginClient;
import net.minecraft.resources.ResourceLocation;

@REIPluginClient
public class ForgeReiPlugin implements REIClientPlugin {

    @Override
    public void registerInputMethods(InputMethodRegistry registry) {
        registry.add(new ResourceLocation("jrc", "jech"), new JechInputMethod());
    }
}
