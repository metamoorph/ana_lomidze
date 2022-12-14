package main.java;

public class Main {

    public static void main(String[] args) {

        ProductUtils.createTable();

        ProductUtils.updateProduct(3,"shawarma", 12);

        ProductUtils.deleteProduct(1);

        ProductUtils.getAllProduct()
                .stream()
                .forEach(product-> System.out.println(product));


        ProductUtils.getWhere()
                .stream()
                .forEach(product-> System.out.println(product));




    }

}