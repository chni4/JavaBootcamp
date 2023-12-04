package Vererbung.Produkt_hinzufügen_entfernung;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(101, "Mate", 1.20));
        OrderRepo orderRepo = new OrderMapRepo();
        ShopService shopService = new ShopService(orderRepo);
        orderRepo.placeOrder(1, productRepo.getAllProducts().get(0), 10, LocalDate.now(), productRepo);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Produkt wollen sie erstellen? Geben Sie die Produktnummer ein:");
        int ProNummer = sc.nextInt();

        Product nichtExistierendesProdukt = new Product(ProNummer, "Neues Produkt", 10.0);
        orderRepo.placeOrder(2, nichtExistierendesProdukt, 5, LocalDate.now(), productRepo);

        sc.close();

        orderRepo.getAllOrders().forEach(System.out::println);
    }
}


class ShopService {
    private OrderRepo orderRepo;

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

}
