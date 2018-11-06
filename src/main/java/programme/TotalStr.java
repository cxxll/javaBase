package programme;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/5
 * Time: 1:05
 **/
/*
题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。

          程序分析：

                  这里的需要的知识点:

            1、获取一行字符串，nextLine（）

            2、把字符串的每一个字符赋值到一个数值中

            3、对比每一个数值在ASK码的范围，就可以确定它符号的类别

            4、char字符ASK码的范围

                 （1）数字0到9： 48~57

                 （2）字母A到Z：65到90 a到z：97到122

                 （3）空格是32 
*/

public class TotalStr {
    public static void main(String[] args) {
        //数字的个数
        int num = 0;
        //字母的个数
        int letter = 0;
        //空格的个数
        int space = 0;
        //其他的个数
        int other = 0;
        System.out.println("请输入一串字符：");
        Scanner scanner = new Scanner(System.in);
        //获取一行字符串
        String a = scanner.nextLine();
        //把字符串里面的值赋值给一个字符型数组
        char[]chars = a.toCharArray();
        //遍历字符串里面的所有值
        for (int i = 0;i<chars.length;i++){
            //字符是数字
            if (chars[i]>=48&&chars[i]<=57){
                num++;
            } else if ((chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122)){
                letter++;
            }else if(chars[i]==32){
                space++;
            }else {
                other++;
            }
        }
        System.out.println("数字："+num+"个，字母："+letter+"个，空格："+space+"个，其他："+other+"个");
        scanner.close();
    }
}
