public class Main {
    public static void main(String[] args) {
        Sale sale1 = new Sale(1234,"Orange",350);
        Sale sale2 = new Sale(2341,"Banana",200);

        Store store1 = new Store(1);
        Store store2 = new Store(2);

        store1.addSale(sale1);
        store2.addSale(sale2);

        Sale sale3 = new Sale(6763,"Strawberry",100);
        Sale sale4 = new Sale(9876,"Milk",50);
        Sale sale5 = new Sale(5673,"Meat",20);

        Store store3 = new Store(3);

        SalesSystem system1 = new SalesSystem();
        system1.addStore(3333);
        system1.addStore(5555);
        system1.addSale(3333,sale3);
        system1.addSale(3333,sale4);
        system1.addSale(5555,sale5);
        
    }
}