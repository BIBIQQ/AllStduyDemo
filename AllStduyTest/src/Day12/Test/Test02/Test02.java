package Day12.Test.Test02;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:15:05
 */
public class Test02 {
        //  父类成员引用子类对象
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    public static void useAnimal(Animal a){
        a.eat();
    }
}
