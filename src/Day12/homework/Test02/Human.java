package Day12.homework.Test02;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:18:58
 */
public class Human {
//    public void  play(){
//        useplay(new Cat());
//        useplay(new Dog());
//    }

    public void play(Animal a ){
        a.voice();
        if(a instanceof Cat){
            Cat b = (Cat)a;
            b.maose();
        }


    }



}
