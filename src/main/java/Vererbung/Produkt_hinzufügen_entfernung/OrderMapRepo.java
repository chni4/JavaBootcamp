package Vererbung.Produkt_hinzufügen_entfernung;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMapRepo implements OrderRepo {
    private final Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void addOrder(Order order) {
        orders.put(order.bestellnummer(), order);
    }

    @Override
    public void removeOrder(int bestellnummer) {
        orders.remove(bestellnummer);
    }

    @Override
    public List<Order> getAllOrders() {
        return orders.values().stream().collect(Collectors.toList());
    }

    @Override
    public void placeOrder(int bestellnummer, Product produkt, int menge, LocalDate bestelldatum, ProductRepo productRepo) {
        if (!productRepo.exists(produkt)) {
            System.out.println("Produkt mit der Nummer " + produkt.Produktnummer() + " existiert nicht.");
            return;
        }
        addOrder(new Order(bestellnummer, produkt, menge, bestelldatum));
    }
}
