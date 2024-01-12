package tools.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReadFromClassPathTest {
    @Test
    @SneakyThrows
    public void testReadJsonFromClasspath()  {
        // Get the ClassLoader
        ClassLoader classLoader = getClass().getClassLoader();

        // Read the file as a stream from the classpath
        try (InputStream inputStream = classLoader.getResourceAsStream("product.json")) {
            assertNotNull(inputStream, "Input stream must not be null");

            // Create ObjectMapper instance
            ObjectMapper mapper = new ObjectMapper();

            // Deserialize the JSON file into a Product object
            Product product = mapper.readValue(inputStream, Product.class);

            // Perform your assertions here
            assertNotNull(product);
            System.out.println(product);
        }
    }
}
