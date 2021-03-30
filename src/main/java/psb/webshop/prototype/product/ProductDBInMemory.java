package psb.webshop.prototype.product;

import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDBInMemory implements ProductDb{
    private Map<String, Product> records = new HashMap<>();

    @Override
    public Product get(int id) {
        if(id < 0){
            throw new DbException("No valid id given");
        }
        return records.get(id);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<Product>(records.values());
    }

    @Override
    public void add(Product product) {
        //not yet implemented
    }

    @Override
    public void update(Product product) {
        //not yet implemented
    }
}
