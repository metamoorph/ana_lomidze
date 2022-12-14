package main.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

    private ProductUtils() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE PRODUCT (" +
                "ID INTEGER NOT NULL AUTO_INCREMENT, " +
                "NAME VARCHAR(255), " +
                "SIZE VARCHAR(255)," +
                "PRICE INTEGER NOT NULL," +
                "PRIMARY KEY(ID))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCT(NAME, TYPE, AMOUNT) VALUES(" +
                "'" + product.getName() + "'pizzaa, " +
                "'" + product.getSize() + "'30cm, " +
                "" + product.getPrice() + "25)";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> getAllProduct() {

        String selectSql = "SELECT * FROM PRODUCT";

        List<Product> products = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("SIZE"),
                        resultSet.getInt("PRICE")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;

    }


    public static List<Product> getWhere() {

        String selectSql = "SELECT * FROM PRODUCT GROUP BY NAME";

        List<Product> products = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("NAME"),
                        resultSet.getString("SIZE"),
                        resultSet.getInt("PRICE")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;

    }

    public static void updateProduct(long id, String newName, Integer amount) {

        String updateSql = "UPDATE PRODUCT SET NAME = '" + newName + amount + "' WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteProduct(long id) {

        String deleteAll = "DELETE FROM PRODUCT WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteAll() {

        String deleteAll = "DELETE FROM PRODUCT";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

