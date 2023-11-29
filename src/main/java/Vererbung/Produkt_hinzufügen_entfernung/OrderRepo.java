package Vererbung.Produkt_hinzufügen_entfernung;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepo {
    void addOrder(Order order);
    void removeOrder(int bestellnummer);
    List<Order> getAllOrders();
    void placeOrder(int bestellnummer, Product produkt, int menge, LocalDate bestelldatum, ProductRepo productRepo);
}
