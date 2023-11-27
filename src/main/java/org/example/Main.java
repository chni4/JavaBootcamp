package org.example;

import Vererbung.Auto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Auto  auto01 = new Auto();
    auto01.setPS(2500);
    auto01.setTüren(5);
    auto01.setBaujahr(2022);
    auto01.setHersteller("Königsegg");
    auto01.setModell("Gemera");
    Auto.Fahrzeugausgabe(auto01.getHersteller(), auto01.getModell(), auto01.getBaujahr(), auto01.getTüren(), auto01.getPS());
    }
}