package seminars.first.hw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {
    /*
    1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    */
    @Test
    public void testGetProducts() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 199));
        products.add(new Product("Banana", 99));
        products.add(new Product("Orange", 149));

        shop.setProducts(products);

        List<Product> actualProducts = shop.getProducts();
        assertEquals(products.size(), actualProducts.size());
        assertTrue(actualProducts.containsAll(products));
    }

    /*
    2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    */
    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 199));
        products.add(new Product("Banana", 99));
        products.add(new Product("Orange", 149));

        shop.setProducts(products);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertEquals("Apple", mostExpensiveProduct.getTitle());
        assertEquals(199, mostExpensiveProduct.getCost());
    }

    /*
    3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    */
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 199));
        products.add(new Product("Banana", 99));
        products.add(new Product("Orange", 149));

        shop.setProducts(products);

        List<Product> sortedProducts = shop.getSortedListProductsByPrice();
        assertEquals(99,
                sortedProducts.get(0).getCost());
        assertEquals(149,
                sortedProducts.get(1).getCost());
        assertEquals(199,
                sortedProducts.get(2).getCost());
    }

}

