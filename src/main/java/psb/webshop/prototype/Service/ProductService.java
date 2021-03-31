package psb.webshop.prototype.Service;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psb.webshop.prototype.db.ProductRepository;
import psb.webshop.prototype.product.Product;

import java.util.List;
import java.util.Properties;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAll(){return productRepository.findAll();}
}
