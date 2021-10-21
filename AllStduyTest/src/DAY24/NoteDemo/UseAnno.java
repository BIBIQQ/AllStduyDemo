package DAY24.NoteDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:14:43
 */
public class UseAnno {

   @Before
    public void method(){
        System.out.println("method");
    }

    @Test
    public void fountion(){
        System.out.println("fountion");
    }

    @Test
    public void fountion1(){
        System.out.println("HELLO");
    }

   @After
    public void aethod01(){
        System.out.println(2 / 1);
    }
}
