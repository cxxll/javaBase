package programme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/5
 * Time: 0:19
 **/
/*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
        例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/

public class daffodil {
    public static void main(String[] args) {
        daffodils();
    }
    private static void daffodils(){
        List<Integer> list = new ArrayList<Integer>();
        //遍历100-9999中水仙花的总数
        for (int i =100;i<9999;i++){
            if (Right(i)){
                list.add(i);
            }
        }
        System.out.println(list);

    }
    private static boolean Right(int i){
       //求得百位
       int a = i / 100;
       // 求得十位
       int b = i / 10 %10;
        //求得个位
       int c = i  %10;
       int d = a*a*a + b*b*b + c*c*c;
        //判断是否是水仙花数
       if(d == i){
           return true;
       }
        return false;
    }
}
