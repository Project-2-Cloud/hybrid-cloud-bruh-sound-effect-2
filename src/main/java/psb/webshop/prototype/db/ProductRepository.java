package psb.webshop.prototype.db;

import org.springframework.data.jpa.repository.JpaRepository;
import psb.webshop.prototype.product.Product;


public interface ProductRepository  extends JpaRepository<Product, Long> {
}
