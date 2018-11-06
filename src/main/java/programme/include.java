package programme;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/5
 * Time: 0:47
 **/
/*题目：利用条件运算符的嵌套来完成此题：
        学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

        程序分析：(a>b)?a:b这是条件运算符的基本例子。*/

public class include {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的分数：");
        int a = scanner.nextInt();
        String b = a>=90 ?"A":(60<=a&&a<90)?"B":"C";
        System.out.println(b);
        }
}
