package psb.webshop.prototype.product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    public ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return service.getproducts();
        /*return Arrays.asList(
                new Product(
                        "1",
                        "Ducky USB",
                        12.5,
                        "Ducky USB uses 2.0 technology, up to 50 passwords.",
                        "https://i.imgur.com/bEwVYmD.jpg",
                        500
                ),
                new Product(
                        "2",
                        "Rudi USB",
                        15,
                        "Ducky USB uses 3.0 generation 1 technology, up to 100 passwords.",
                        "https://i.imgur.com/bEwVYmD.jpg",
                        250
                ),
                new Product(
                        "3",
                        "IBM Stick",
                        17.5,
                        "Ducky USB uses 3.0 generation 2 technology, up to 150 passwords.",
                        "https://i.imgur.com/bEwVYmD.jpg",
                        125
                )
        );*/
    }
}
