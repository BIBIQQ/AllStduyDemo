package Day14.HomWork.work02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:13:26
 */
/*有以下学员信息：
		张三,男,20,79.5
		李四,女,21,80.2
		王五,男,22,77.9
		周六,男,20,55.8
		赵七,女,21,99.9
	请定义学员类，属性：姓名、性别、年龄、分数
	请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
*/
public class AverageDemo {
    public static void main(String[] args) {
        // 创建对象，并且存入集合
        TestStudent s1 = new TestStudent("张三","男","20",79.5);
        TestStudent s2 = new TestStudent("李四","女","21",80.2);
        TestStudent s3 = new TestStudent("王五","男","22",77.9);
        TestStudent s4 = new TestStudent("周六","男","23",55.8);
        TestStudent s5 = new TestStudent("赵七","女","24",99.9);
        ArrayList<TestStudent> testAverage = new ArrayList<>();
        testAverage.add(s1);
        testAverage.add(s2);
        testAverage.add(s3);
        testAverage.add(s4);
        testAverage.add(s5);
// 初始化 和
        double sum = 0;
        for (int i = 0; i < testAverage.size(); i++) {
            TestStudent stu = testAverage.get(i);
            sum += stu.getScore();
        }

        // 初始化BigDecimal类

        BigDecimal newSum = new BigDecimal(sum);
        BigDecimal length = new BigDecimal(testAverage.size());
        BigDecimal  average = newSum.divide(length,2, RoundingMode.HALF_UP);
        System.out.println(average);
    }
}
