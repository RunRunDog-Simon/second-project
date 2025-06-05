package org.example;

import net.datafaker.Faker;
import org.example.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ECommerceProductManagement {
    public static void main(String[] args) {

        Faker faker = new Faker();
        List<Product> productList = new ArrayList<>();
        String[] categories = {"3C", "家用電器", "服飾", "食品", "書籍"};

        productList = initializeProduct(productList, faker, categories);

        shortageProduct(productList);

        stockProduct3C(productList);
        stockProductHouseholdAppliances(productList);
        stockProductClothes(productList);
        stockProductGroceries(productList);
        stockProductBookies(productList);

        availableProducts(productList, faker, categories);
        unavailableProducts(productList);
    }

    private static List<Product> initializeProduct(List<Product> productList,Faker faker, String[] categories) {
        System.out.println("================初始商品================");
        for (int i = 0; i < 15; i++) {
            String id = faker.idNumber().invalid();
            String name = faker.commerce().productName();
            String category = categories[faker.random().nextInt(categories.length)];
            double price = Double.parseDouble(faker.commerce().price(10, 1000));
            int stock = faker.random().nextInt(0, 100);

            Product product = new Product(id, name, category, price, stock);
            productList.add(product);
            System.out.println(product);
        }
        return productList;
    }

    private static void shortageProduct(List<Product> productList) {
        System.out.println("================庫存不足商品================");
        List<Product> lowStockProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getStockQuantity() < 10) {
                lowStockProduct.add(product);
            }
        }
        for (Product product : lowStockProduct) {
            System.out.println(product);
        }
    }

    private static void stockProduct3C(List<Product> productList) {
        System.out.println("================庫存內的3C商品================");
        String targetProduct = "3C";
        List<Product> stockProduct3C = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetProduct)) {
                stockProduct3C.add(product);
            }
        }
        for (Product product : stockProduct3C) {
            System.out.println(product);
        }
    }

    private static void stockProductHouseholdAppliances(List<Product> productList) {
        System.out.println("================庫存內的家用電器商品================");
        String targetProduct = "家用電器";
        List<Product> stockProductHouseholdAppliances = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetProduct)) {
                stockProductHouseholdAppliances.add(product);
            }
        }
        for (Product product : stockProductHouseholdAppliances) {
            System.out.println(product);
        }
    }

    private static void stockProductClothes(List<Product> productList) {
        System.out.println("================庫存內的服飾商品================");
        String targetProduct = "服飾";
        List<Product> stockProductClothes = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetProduct)) {
                stockProductClothes.add(product);
            }
        }
        for (Product product : stockProductClothes) {
            System.out.println(product);
        }
    }

    private static void stockProductGroceries(List<Product> productList) {
        System.out.println("================庫存內的食品商品================");
        String targetProduct = "食品";
        List<Product> stockProductGroceries = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetProduct)) {
                stockProductGroceries.add(product);
            }
        }
        for (Product product : stockProductGroceries) {
            System.out.println(product);
        }
    }

    private static void stockProductBookies(List<Product> productList) {
        System.out.println("================庫存內的書籍商品================");
        String targetProduct = "書籍";
        List<Product> stockProductBookies = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equals(targetProduct)) {
                stockProductBookies.add(product);
            }
        }
        for (Product product : stockProductBookies) {
            System.out.println(product);
        }
    }

    private static void availableProducts(List<Product> productList, Faker faker, String [] categories) {
        System.out.println("================已上架商品================");
        List <Product> availableProducts = new ArrayList<>();
        for (Product product: productList) {
            if(product.getStockQuantity() > 50){
                availableProducts.add(product);
            }
        }
        for (Product product : availableProducts){
        System.out.println(product);
        }
    }

    private static void unavailableProducts(List<Product> productList) {
        System.out.println("================已下架商品================");
        List<Product> removedProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getStockQuantity() == 0)
                removedProduct.add(product);
        }
        for (Product product : removedProduct) {
            System.out.println(product);
        }
    }

}