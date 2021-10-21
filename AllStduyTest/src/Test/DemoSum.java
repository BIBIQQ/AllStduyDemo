package Test;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:19:43
 */
public class DemoSum {
    public static void main(String[] args) {
        StuMessage s1 = new StuMessage("王五",100,50);
        StuMessage s2 = new StuMessage("李四",10,80);
        StuMessage s3 = new StuMessage("张三",110,90);

        ArrayList<StuMessage> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            StuMessage student = list.get(i);
            int mark = student.getLanguage()+student.getMath();
            if(mark > 160){
                StuMessage s4 = new StuMessage(student.getName(),student.getLanguage(),student.getMath());
                s4.show();
            }
        }
            }
}
