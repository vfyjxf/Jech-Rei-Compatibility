package dev.vfyjxf.jrc;

import me.shedaniel.rei.api.client.search.method.InputMethod;
import me.shedaniel.rei.api.common.util.CollectionUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class JechInputMethod implements InputMethod<String> {

    @Override
    public List<Locale> getMatchingLocales() {
        return CollectionUtils.filterToList(InputMethod.getAllLocales(), locale -> locale.code().startsWith("zh_"));
    }

    @Override
    public Iterable<String> expendFilter(String filter) {
        return Collections.singleton(filter);
    }

    @Override
    public boolean contains(String str, String substr) {
        return MatchPlatform.contains(str, substr);
    }

    @Override
    public CompletableFuture<Void> prepare(Executor executor) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public CompletableFuture<Void> dispose(Executor executor) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public Component getName() {
        return new TextComponent("Jech兼容性输入法");
    }

    @Override
    public Component getDescription() {
        return new TextComponent("Jech的Rei兼容性输入法");
    }
}
