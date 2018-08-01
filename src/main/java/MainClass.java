import com.factory.abstractfactory.store.CaliforniaPizzaStore;
import com.factory.abstractfactory.store.NYPizzaStore;
import com.factory.abstractfactory.store.Store;

public class MainClass {
    public static void main(String[] args){
        Store store1 = new CaliforniaPizzaStore();
        Store store2 = new NYPizzaStore();

        store1.orderPizza("cheese").print();
        store2.orderPizza("cheese").print();
    }
}
