package programme;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/4
 * Time: 23:33
 **/
/*
*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
*程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....
*做这种题目，最好的做法就是找出规律，跟高中的数列一样
*本题有：a[n]=a[n-1]+a[n-1],而第一第二项都知道了，后面的值也可以求得
* */

public class rabbitNum {

    //求得所需月份的兔子的数量，返回值为兔子的数量
    private static int fun(int num){
        if(num == 1 || num ==2){
            return 1;
        }else{
            return fun(num-1)+fun(num-2);
        }
    }

    public static void main(String[] args){
        System.out.print("请输入你想知道的兔子数量的月份：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("第"+a+"个月兔子总数为"+fun(a));
    }
}
