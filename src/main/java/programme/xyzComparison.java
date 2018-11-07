package programme;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 16:41
 **/

/*题目：输入三个整数x,y,z，请把这三个数由小到大输出。

        程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换
        ，然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。

        最后两个数也使z>y就可以了*/

public class xyzComparison {
    public static void main(String[] args) {
        System.out.println("三个整数：");
        Scanner scanner = new Scanner(System.in);
        //获取整数
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        //最为一个交换数
        int temp = 0;
        if(x>y){
            temp = x;
            x = y;
            y = temp;
        }
        if(y>z){
            temp = y;
            y = z;
            z = temp;
        }
        if(x>y){
            temp = x;
            x = y;
            y = temp;
        }
        System.out.println("这三个数从小到大排列："+x+"  "+y+"  "+z);
    }
}
