package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 19:10
 **/

/*题目：求1+2!+3!+...+20!的和

        程序分析：此程序只是把累加变成了累乘。

        1、先求该项阶乘的值

        *   2、累加求求*/


public class Tired {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1;i<=20;i++){
            sum+=Accumulations(i);
        }
        System.out.println(sum);
    }

    //递归方式
    public static int Accumulation(int i){
      if (i > 2){
          return i*Accumulation(i-1);
      }
      return i;
    }

    //循环解决
    public static int Accumulations(int i){
        int k = 1;
        for(int j =1; i>=j; j++){
           k *=j ;
        }
       return k;
    }

}
