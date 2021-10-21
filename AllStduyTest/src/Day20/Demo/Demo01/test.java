package Day20.Demo.Demo01;

import java.io.File;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:9:50
 */
public class test {
    public static void main(String[] args) throws IOException {
//        创建文件夹
        String path = new String("..\\..\\HEIMA\\aa\\ddd\\cc");
        File file = new File(path);
//        创建对应文件，确保文件夹必须存在
        if (!file.exists()) {
            file.mkdirs();
            System.out.println("heiheihei");
        } else {
            System.out.println("hahahaha");
        }
//        创建文件
        File file1 = new File(file, "aaa.txt");
        if (!file1.isFile()) {
            boolean newFile = file1.createNewFile();
            System.out.println("heiheihei");
        } else {
            System.out.println("hahahaha");
        }


        File file2 = new File("..\\..\\HEIMA\\aa");
//        遍历删除
//         Deleter(file2);

    }

    public static void Deleter(File file2) {
        File[] f1 = file2.listFiles();
        for (File f3 : f1) {
            if (f3.isFile()) {
                boolean delete = f3.delete();
//                System.out.println(delete);
            } else {
                Deleter(f3);
//                System.out.println(d1);
            }
        }
        file2.delete();
    }
}
