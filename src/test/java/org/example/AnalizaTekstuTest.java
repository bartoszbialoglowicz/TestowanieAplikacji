package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalizaTekstuTest {
    @Test
    void testPoliczSlowa() {
        Assertions.assertEquals(3, AnalizaTekstu.policzSlowa("Testowanie super jest"));
        Assertions.assertEquals(0, AnalizaTekstu.policzSlowa(" "));
        Assertions.assertEquals(2, AnalizaTekstu.policzSlowa("Dłuższa   pauza "));
    }

    @Test
    void testPoliczZdania() {
        Assertions.assertEquals(2, AnalizaTekstu.policzZdania("Zdanie pierwsze. Zdanie drugie."));
        Assertions.assertEquals(1, AnalizaTekstu.policzZdania("1.25"));
        Assertions.assertEquals(2, AnalizaTekstu.policzZdania("Pierwsze zdanie... drugie zdanie."));
    }

    @Test
    void testPoliczSredniaDlugoscSlowa() {
        Assertions.assertEquals(0 , AnalizaTekstu.sredniaDlugoscSlowa(" "));
        Assertions.assertEquals(2, AnalizaTekstu.sredniaDlugoscSlowa("To to"));
        Assertions.assertEquals(6, AnalizaTekstu.sredniaDlugoscSlowa("Testowanie super jest"));
        Assertions.assertEquals(2, AnalizaTekstu.sredniaDlugoscSlowa("it,,, it"));
    }
}