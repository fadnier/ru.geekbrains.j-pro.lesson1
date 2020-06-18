import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {10,5,4,7,9};
        String[] array2 = new String[] {"Первый","Второй","Третий","Четвертый","Последний"};

        //Задание 1
        System.out.println(Arrays.toString(array1));
        changeArrayElement(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));
        changeArrayElement(array2);
        System.out.println(Arrays.toString(array2));

        //Задание 2
        ArrayList arrayList = changeToArrayList(array2);
        System.out.println(arrayList.getClass().getSimpleName()+":"+arrayList);


        //Задание 3
        Box<Orange> box = new Box<>(new Orange());
        Box<Apple> box2 = new Box<>(new Apple());
        Box<Orange> box3 = new Box<>(new Orange());

        box.addFruit(new Orange());
        box.addFruit(new Orange());
        //box.addFruit(new Orange());

        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());

        box3.addFruit(new Orange());
        box3.addFruit(new Orange());

        System.out.println(box2.compare(box));

        box.info();
        box3.info();
        box.sprinkle(box3);
        box.info();
        box3.info();
    }

    //Задание 1: Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    //т.к. в задании не казаны какие именно элементы, то выбрал первый и последний.
    public static <T> T changeArrayElement(T[] myArray) {
        T save = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = save;
        return (T) myArray;
    }

    //Задание 2: Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList changeToArrayList(T[] myArray) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(myArray));
        return arrayList;
    }


}
