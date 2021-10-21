package Day22.Work.Work01;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:19:11
 */
/*
编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”;
* */
public class text {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println("播放背景音乐。。");
            }}
        });
        Thread t2 = new Thread(() -> { while (true){
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("显示画面。。"); } });

        t1.start();
        t2.start();
    }
}
