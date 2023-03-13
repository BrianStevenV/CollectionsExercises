import java.util.HashMap;
import java.util.Map;

public class SalesSystem {
    private Map<Integer,Store> system;

    public SalesSystem() {
        this.system = new HashMap<>();
    }

    public void addStore(int id){
        Store store = new Store(id);
        system.put(id,store);
    }

    public void addSale(int id, Sale sale){
        Store store = system.get(id);
        if(store != null){
            store.addSale(sale);
        }
    }
}
