package psb.webshop.prototype.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psb.webshop.prototype.product.Product;


public interface ProductRepository  extends JpaRepository<Product, Long> {
}
