package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 16:51
 **/

/*题目：输出9*9口诀。

        程序分析：分行与列考虑，共9行9列，i控制行，jC列。

        表达式：  i+"*"+j+"="+i*j，这里要用两个for循环控制输出和换行*/

public class DigitalMultiplier {
    public static void main(String[] args) {
        for (int i = 1; i <= 9;i++) {
            for (int j = 1; j <=i ;j++) {
                //输出结果
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            //换行
            System.out.println();
        }
    }
}
