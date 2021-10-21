package Day12.homework.Test02;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:18:58
 */
public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();
        human.play(dog);
        human.play(cat);
    }
}
