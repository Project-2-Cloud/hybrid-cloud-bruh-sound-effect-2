package psb.webshop.prototype.product;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import psb.webshop.prototype.Service.ProductService;

@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return (List<Product>) service.getAll();
    }
}
