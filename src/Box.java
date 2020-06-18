import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> content = new ArrayList<>();
    private float weight;

    public Box(T obj) {
        weight = T.getWeight();
    }

    public void addFruit(T fruit) {
        this.content.add(fruit);
    }

    public float getWeight() {
        return content.size()*weight;
    }

    public boolean compare(Box o) {

        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

    public void sprinkle(Box<T> o) {
        if (o == this) {
            System.out.println("Нельзя пересыпать сам в себя");
        } else {
            o.content.addAll(this.content);
            this.content.clear();
        }
    }

    public void info () {
        System.out.println("В корзине: "+content.size()+" фруктов, общий вес - "+getWeight());
    }
}
