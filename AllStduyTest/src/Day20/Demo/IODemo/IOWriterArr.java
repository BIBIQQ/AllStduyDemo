package Day20.Demo.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:15:15
 */
public class IOWriterArr {
    /**
     * throws 底层抛给上层，由顶层处理   抛给别人处理   dao  抛 <----  service  抛 <----contrller 处理  JAVAEE三层架构
     *  try（）catch（）{ }  顶层try（）catch（）{ }  自己处理异常
     * thorw  创建一个异常
     *
     * @param args
     */
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //创建输出流
            fos = new FileOutputStream("E:\\HEIMA\\HEIMA\\aaa.txt", true);
            byte[] bys = {97, 98, 99};
            fos.write(bys);
            fos.write("\r\n".getBytes());
            fos.write(bys, 0, 2);
            //关闭流
            fos.close();
        } catch (IOException e) {  //创建一个异常
            e.printStackTrace();
        } finally {
//            finall中的语句里面的代码一定会被执行
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
