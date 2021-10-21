package Day20.Demo.Demo02;

import java.io.File;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:11:54
 */
public class test {
    public static void main(String[] args) {
        File file2 = new File("E:\\HEIMA\\HEIMA\\");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm,file2);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String, Integer> hm, File file2) {
        File[] files = file2.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String filename = file.getName();
                String[] fileArr = filename.split("\\.");
                if (fileArr.length == 2) {
                    String fileEndName = fileArr[1];
                    if (hm.containsKey(fileEndName)) {
                            //已经存在
                        Integer count = hm.get(fileEndName);
//                        这种文件又出现一次
                        count++;
//                        把已经出现的次数给覆盖掉
                        hm.put(fileEndName,count);
                    }else{
                        //不存在
                        //文件第一次出现
                        hm.put(fileEndName,1);
                    }
                }
            }else{
                getCount(hm,file);
            }
        }

    }
}
