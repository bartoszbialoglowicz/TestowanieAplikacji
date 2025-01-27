package org.example;

public class KalkulatorPodatkowy {

    public enum FormaOpodatkowania {
        RYCZALT, LINIOWY, SKALA
    }

    public Double obliczPodatek(FormaOpodatkowania forma, double dochod, double koszty) {
        double podstawa = dochod - koszty;
        double podatek = 0;

        switch (forma) {
            case RYCZALT:
                podatek = podstawa * 0.12;
                break;
            case LINIOWY:
                podatek = podstawa * 0.19;
                break;
            case SKALA:
                if (podstawa < 30000) {
                    podatek = 0;
                } else if (podstawa < 120000) {
                    podatek = podstawa * 0.12;
                } else {
                    podatek = podstawa * 0.32;
                }
                break;
            default:
                throw new IllegalArgumentException("Podano nieznaną formę opodatkowania");
        }
        return podatek;
    }

    public double obliczSkladkeZdrowotna(FormaOpodatkowania forma, double dochod, double koszty) {
        double podstawa = dochod - koszty;
        double skladka = 0;

        switch (forma) {
            case LINIOWY:
                skladka = podstawa * 0.09;
                break;
            case SKALA:
                skladka = podstawa * 0.09;
                break;
            case RYCZALT:
                if (podstawa < 60000) {
                    skladka = 12 * 376;
                } else if (podstawa < 3000000) {
                    skladka = 12 * 626;
                } else {
                    skladka = 12 * 1128;
                }
            default:
                throw new IllegalArgumentException("Podano nieznaną formę opodatkowania");
        }

        return skladka;
    }
}
