package DAY23.Work.Work02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:20:41
 */
public class FeiQAccept {
    public static void main(String[] args) throws IOException {
//        //接收
        ServerSocket ss = new ServerSocket(10020);
        Socket socket = ss.accept();

        Accep accept = new Accep(socket);
        Send send = new Send(socket);

        accept.start();
        send.start();

    }
}

//发送信息
class Send extends Thread {
    private Socket socket;

    public Send(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                //反馈信息
                OutputStream os = socket.getOutputStream();
                System.out.println("服务器：");
                String next = sc.next();

                if (next.equals("886")) {
                    System.out.println("结束了");
                    break;
                }
                os.write(next.getBytes());
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

//接收客户端的消息
class Accep extends Thread {
    private Socket socket;

    public Accep(Socket socket) {
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
                    System.out.println("客户端：" + new String(bytes, 0, line));
                }
            System.out.println("服务器停止接收");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}