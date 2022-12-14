package main.java;

public class Product {

    private Long id;
    private String Name;
    private String Size;
    private Integer price;

    public Product() {
    }

    public Product(Long id, String Name, String Size, Integer Price) {
        this.id = id;
        this.Name = Name;
        this.Size = Size;
        this.price = Price;
    }

    public Product(String Name, String Size, Integer Price) {
        this.Name = Name;
        this.Size = Size;
        this.price = Price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Size='" + Size + '\'' +
                ", Price=" + price +
                '}';
    }

}