package dev.vfyjxf.jrc;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPlatform {


    public static int rank(Object o, String s1, String s2) {
        return contains(s1, s2) ? 1 : 0;
    }

    @ExpectPlatform
    public static String wrap(String s) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean contains(String s, CharSequence cs) {
        throw new AssertionError();
    }

    public static boolean contains(CharSequence a, CharSequence b, boolean c) {
        if (c) return contains(a.toString().toLowerCase(), b.toString().toLowerCase());
        else return contains(a, b);
    }

    @ExpectPlatform
    public static boolean equals(String s, Object o) {
        throw new AssertionError();
    }

    public static boolean contains(CharSequence a, CharSequence b) {
        return contains(a.toString(), b);
    }

    @ExpectPlatform
    public static Matcher matcher(Pattern test, CharSequence name) {
        throw new AssertionError();
    }

    public static boolean matches(String s1, String s2) {
        boolean start = s2.startsWith(".*");
        boolean end = s2.endsWith(".*");
        if (start && end && s2.length() < 4) end = false;
        if (start || end) s2 = s2.substring(start ? 2 : 0, s2.length() - (end ? 2 : 0));
        return contains(s1, s2);
    }

}
