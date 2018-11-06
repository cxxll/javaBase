package programme;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/6
 * Time: 10:59
 **/
/*题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
               再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
        程序分析：反弹的高度:(1/2)的n次方*h
              * 经过的距离：这个可以总结得到：第一次落地经过：h,第二次落地经过：h+(h/2)*2,
              * 第三次落地经过：h+(h/2)*2+(h/2/2)*2 
              * 那么第n次落地经过：  h+(h/2)*2+(h/2/2)*2 +...+h/(2的n-1次方)*2*/

public class FreeFall {
    public static void main(String[] args) {
        System.out.println("请输入小球下落的高度和落地的次数：");
        Scanner scanner=new Scanner(System.in);
        double h=scanner.nextDouble();
        double n=scanner.nextDouble();
        double sum=h;
        double all=h;
        h/=2;
        for (int i = 2;i <=n;i++) {
            //经过的距离的总和
            sum+=h*2;
            //第N次反弹的高度为
            h /=2;
        }
        System.out.println("在"+all+"米，经过"+n+"次后，能反弹："+h+"米，经过的距离："+sum);
        scanner.close();
    }
}
