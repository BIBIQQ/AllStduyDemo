package Day12.homework.Test06;

import java.security.PublicKey;

/**
 * @author FF
 * @date 2021/9/19
 * @TIME:10:17
 */
public class Test06 {
    public static void main(String[] args) {
     /*   PlayGame s = new Phone();
    s.play();
    PlayGame a = new Computer();
    a.play();*/

usePlay(new Phone());
usePlay(new Computer());

    }
public static void  usePlay(PlayGame playGame){
        playGame.play();
}

}
