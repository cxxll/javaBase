package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 18:59
 **/

/*
题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

        程序分析：请抓住分子与分母的变化规律。分数：fraction

               1、第一项是2/1

               2、前面一项分子和分母相加的和，为下一项的分子

              *3、前面一项分子，为下一项的分母  
*/


public class FractionalSequence {
    public static void main(String[] args) {
        double sum =0;
        int i=0;
        double molecule = 2;
        double Denominator = 1;
        double temp = 0;
        while ( i <20){
            sum += molecule/Denominator;
            temp = molecule;
            molecule += Denominator;
            Denominator = temp;
            i++;
        }
        System.out.println(""+sum);
    }
}
