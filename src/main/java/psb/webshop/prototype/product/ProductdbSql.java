package psb.webshop.prototype.product;

import com.zaxxer.hikari.metrics.dropwizard.CodaHaleMetricsTracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static java.lang.Class.forName;

public class ProductdbSql implements ProductDb{
    private Properties properties;
    private String url;

    public ProductdbSql(Properties p){
        try {
            Class.forName("org.postgresql.Driver");
            this.properties = p;
            this.url = properties.getProperty("url");
        } catch (Exception e) {
            throw new DbException(e.getMessage(), e);
        }
    }
    @Override
    public Product get(int id) {
        Product p = new Product();
        ResultSet result = null;

        try (Connection connection = DriverManager.getConnection(url, properties);
             Statement statement = connection.createStatement()) {
            result = statement.executeQuery("select * from \"usb\" where productid = " + id);
            p = makeProdFromSet(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }


    @Override
    public List<Product> getAll() {
        ResultSet result = null;
        ArrayList list = new ArrayList();
        try (Connection connection = DriverManager.getConnection(url, properties); Statement statement = connection.createStatement()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void update(Product product) {

    }
}
