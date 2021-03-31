package psb.webshop.prototype.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import psb.webshop.prototype.Service.ProductService;

import java.util.List;

@CrossOrigin(origins = "http://frontend-ucllteam11.ocp-ucll-40cb0df2b03969eabb3fac6e80373775-0000.eu-de.containers.appdomain.cloud/", allowedHeaders = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return (List<Product>) service.getAll();
    }
}
