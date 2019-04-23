package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 */
public class Meal {
    private List<Item> items=new ArrayList<>();
    private float cost=0;

    public void addItem(Item item){
        this.items.add(item);
    }

    public float getCost(){
        for (Item item:items){
            cost+=item.price();
        }
        return cost;
    }

    public void getItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
