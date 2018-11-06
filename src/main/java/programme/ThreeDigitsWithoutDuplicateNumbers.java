package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/6
 * Time: 12:34
 **/

//题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//
//        程序分析：可填在百位、十位、个位的数字都是1、2、3、4。这里要用3个for循环
//
//        用if判断条件是否符合，符合条件的数字打印出来,并计算个数总和

public class ThreeDigitsWithoutDuplicateNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int a=1;a<=4;a++){
            for (int b=1;b<=4;b++){
                for (int c=1;c<=4;c++){
                    if (a !=b &&b!=c &&a!=c){
                        sum++;
                        System.out.print(""+a+b+c + "  ");
                    }
                }
            }
        }
        System.out.println("\n总共有："+sum+"个这样的数");
    }
}
