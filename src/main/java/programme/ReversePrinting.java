package programme;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 19:51
 **/

/*题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

程序分析：创建一个五位数数的数组，把输入数字的每位数的值赋值到数组里面  

      * 把输入 数字从个位起获取，并且每获取一次之后/10，这样就能分别获取十位百位千位了

      * 把数字打印出来就是题目所求了 
*/

public class ReversePrinting {
    public static void main(String[] args) {
        System.out.println("请输入一个不大于5位数的数字：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//获取输入
        int arr[] = new int[5];
        int i = 0;
        do {
            arr[i] = num % 10;
            num /= 10;
            i++;
        } while (num != 0);
        System.out.println("输入数字串的是" + i + "位数的");
        System.out.println("逆序输出：");

        //打印出数组
        for (int j = 0; j < i;j++) {
            System.out.print(arr[j]+"  ");
        }
        scanner.close();
    }
}

