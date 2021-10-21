package Day22.Work.Work02;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:19:27
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter patter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time = ldt.format(patter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(time);
        }
    }
}
