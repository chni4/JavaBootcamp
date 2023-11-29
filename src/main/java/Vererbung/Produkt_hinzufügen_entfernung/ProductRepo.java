package Vererbung.Produkt_hinzufügen_entfernung;

import java.util.ArrayList;
import java.util.List;
public class ProductRepo {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int produktnummer) {
        products.removeIf(product -> product.Produktnummer() == produktnummer);
    }


    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }


    public boolean exists(Product product) {
        return products.stream().anyMatch(p -> p.Produktnummer() == product.Produktnummer());
    }

}
