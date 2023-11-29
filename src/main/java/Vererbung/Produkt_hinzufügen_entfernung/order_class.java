package Vererbung.Produkt_hinzufügen_entfernung;

import java.util.ArrayList;
import java.util.List;

public class order_class {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(int bestellnummer) {
        orders.removeIf(order -> order.bestellnummer() == bestellnummer);
    }

    public Order getOrder(int bestellnummer) {
        for (Order order : orders) {
            if (order.bestellnummer() == bestellnummer) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

}
