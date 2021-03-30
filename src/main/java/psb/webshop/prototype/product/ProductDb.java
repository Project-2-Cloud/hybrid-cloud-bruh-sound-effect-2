package psb.webshop.prototype.product;

import java.util.List;

public interface ProductDb {
    Product get(int id);

    List<Product> getAll();

    void add(Product product);

    void update(Product product);
}
