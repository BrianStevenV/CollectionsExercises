import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private List<Sale> sales;

    public Store(int id) {
        this.id = id;
        this.sales = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public List<Sale> getSales() {
        return sales;
    }
    public void addSale(Sale sale) {
        sales.add(sale);
    }
}
