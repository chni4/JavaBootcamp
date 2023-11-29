package Vererbung.Produkt_hinzufügen_entfernung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public void removeOrder(int bestellnummer) {
        orders.removeIf(order -> order.bestellnummer() == bestellnummer);
    }

    public void placeOrder(int bestellnummer, Product produkt, int menge, LocalDate bestelldatum, ProductRepo productRepo) {

        if (!productRepo.exists(produkt)) {
            System.out.println("Produkt mit der Nummer " + produkt.Produktnummer() + " existiert nicht.");
            return;
        }


        addOrder(new Order(bestellnummer, produkt, menge, bestelldatum));
    }

}
