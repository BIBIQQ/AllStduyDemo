package Day12.homework.Test03;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:19:25
 */
public class Test {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
//        Boy boy = new Boy();
//        Girl girl = new Girl();
        Compere compere = new Girl();
Student student= new Boy();
        classRoom.sit(compere,student);
    }
}
