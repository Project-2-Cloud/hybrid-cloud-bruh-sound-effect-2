package psb.webshop.prototype.product;

import java.util.List;
import java.util.Properties;

public class ProductService {
    private ProductDb productDb;

    public ProductService(Properties p){
        productDb = new ProductdbSql(p);
    }

    public Product getProduct(int productid){return getProductDb().get(productid);}

    public List<Product> getproducts(){ return getProductDb().getAll();}

    public ProductDb getProductDb() {
        return productDb;
    }
}
