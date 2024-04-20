package dev.vfyjxf.jrc.fabric;

import me.towdium.jecharacters.utils.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPlatformImpl {
    public static boolean contains(String s, CharSequence cs) {
        return Match.contains(s, cs);
    }

    public static String wrap(String s) {
        return Match.wrap(s);
    }

    public static boolean equals(String s, Object o) {
        return Match.equals(s, o);
    }

    public static Matcher matcher(Pattern test, CharSequence name) {
        return Match.matcher(test, name);
    }
}
