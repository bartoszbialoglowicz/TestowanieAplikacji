package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorPodatkowyTest {

    KalkulatorPodatkowy kalkulator;

    @BeforeEach
    void setUp() {
        kalkulator = new KalkulatorPodatkowy();
    }

    @Test
    void testPodatekRyczalt() {
        Assertions.assertEquals(12, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT, 100, 0));
        Assertions.assertEquals(12, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT, 120, 20));
    }

    @Test
    void testPodatekLiniowy() {
        Assertions.assertEquals(19, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.LINIOWY, 100, 0));
        Assertions.assertEquals(19, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.LINIOWY, 120, 20));
    }

    @Test
    void testPodatekSkala() {
        Assertions.assertEquals(0, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.SKALA, 100, 0));
        Assertions.assertEquals(3600, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.SKALA, 30000, 0));
        Assertions.assertEquals(38400, kalkulator.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.SKALA, 120000, 0));
    }

    @Test
    void testSkladkaLiniowy() {
        Assertions.assertEquals(90, kalkulator.obliczSkladkeZdrowotna(KalkulatorPodatkowy.FormaOpodatkowania.LINIOWY, 1000, 0));
    }

    @Test
    void testSkladkaSkala() {
        Assertions.assertEquals(90, kalkulator.obliczSkladkeZdrowotna(KalkulatorPodatkowy.FormaOpodatkowania.LINIOWY, 1000, 0));
    }
}