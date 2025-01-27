package org.example;

import java.util.Arrays;

public class AnalizaTekstu {

    public static int policzSlowa(String text) {
        return text.split(" ").length;
    }

    public static int policzZdania(String text) {
        return text.split("\\. ").length;
    }

    public static int sredniaDlugoscSlowa(String text) {
        if (text.trim().isEmpty()) return 0;
        String[] slowa = text.split(" ");
        return Arrays.stream(slowa)
                .map(slowo -> slowo.replaceAll("\\p{Punct}", ""))
                .reduce(
                    0, (accumulator, element) -> accumulator + element.length(), Integer::sum
            ) / slowa.length;
    }
}
