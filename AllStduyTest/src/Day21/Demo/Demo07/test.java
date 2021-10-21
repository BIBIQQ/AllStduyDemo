package Day21.Demo.Demo07;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//          method();
        method01();


    }

    //反序列化
    public static void method01() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Day21\\TcpSend.txt"));
        user o = (user) ois.readObject();
        System.out.println(o);
        ois.close();
    }

    //序列化
    public static void method() throws IOException {
        user us = new user("zhaans", "mima");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Day21\\TcpSend.txt"));
        oos.writeObject(us);
        oos.close();
    }
}

//Serializable称之为标记性接口，里面没有任何的抽象方法
//实现了接口，说明这个对象可以被序列化
class user implements Serializable {
    //serialVersionUID 序列号
    // 如果没有定义，虚拟机会自动生成一个序列号
    // 修改类中信息，虚拟机会再次计算
    private static final long serialVersionUID = 1L;

    private String name;
    //这个不会被序列化  瞬态关键字
    private transient String password;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public user() {
    }

    public user(String name, String password) {
        this.name = name;
        this.password = password;
    }
}