package Vererbung.Produkt_hinzufügen_entfernung;

import java.time.LocalDate;

public record Order(int bestellnummer, Product produkt, int menge, LocalDate bestelldatum) {
}
