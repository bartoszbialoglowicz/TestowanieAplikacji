package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorPodatkowyTest {

    @Test
    void testPodatekRyczalt() {
        Assertions.assertEquals(12, KalkulatorPodatkowy.obliczPodatek(KalkulatorPodatkowy.FormaOpodatkowania.RYCZALT, 100, 0));
    }
}