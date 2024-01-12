package tools.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
class ProductTest {
    @Test
    public void testJsonReadWrite() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Create a new Product object
        Product product = new Product(1, "Sample Product", 19.99);

        // Convert the Product object to JSON
        String json = mapper.writeValueAsString(product);
        System.out.println("Serialized JSON: " + json);

        // Convert the JSON back to a Product object
        Product readProduct = mapper.readValue(json, Product.class);
        log.info("Deserialized Product: " + readProduct.toString());

        // Assertions to ensure the object was correctly serialized and deserialized
        assertEquals(product.getId(), readProduct.getId());
        assertEquals(product.getName(), readProduct.getName());
        assertEquals(product.getPrice(), readProduct.getPrice());
    }
}