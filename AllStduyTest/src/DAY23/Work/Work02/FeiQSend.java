package DAY23.Work.Work02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:20:41
 */
public class FeiQSend extends Thread {
    public static void main(String[] args) throws IOException {
        //发送
        Socket socket = new Socket("127.0.0.1", 10020);

        Accept accept = new Accept(socket);
        Sendt sendt = new Sendt(socket);
        sendt.start();
        accept.start();

    }
}

//接收服务器的消息
class Accept extends Thread {
    private Socket socket;

    public Accept(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
                //输出
                InputStream is = socket.getInputStream();
                byte[] bytes = new byte[1024];
                int line;
                while ((line = is.read(bytes)) != -1) {
                    System.out.println("服务器：" + new String(bytes, 0, line));
                }
            System.out.println("客户端停止接收");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//发送客户端信息信息
class Sendt extends Thread {
    private Socket socket;

    public Sendt(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        OutputStream os = null;
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                //网络流
                os = socket.getOutputStream();
                System.out.println("客户端：");
                String str = sc.next();
                //写入
                os.write(str.getBytes());
                if (str.equals("886")) {
                    System.out.println("结束了");
                    break;
                }

            }
            //   结束标记
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}