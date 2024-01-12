package tools.templates;


import lombok.Data;

@Data
public class Product {
        private int id;
        private String name;
        private double price;

        // Constructors
        public Product() {}

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
}
