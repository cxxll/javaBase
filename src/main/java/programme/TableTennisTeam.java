package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 17:07
 **/

/*题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
        a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

        程序分析：？？？感觉不能下手！ 

              * 这道题目使用的是构造方法，还有arrayList的知识！标准答案的答案！

              * 但是，还是被我用for循环给解决了

           * 这里重要的是使用赋值，还有充分使用给出的条件，还有一个就是互不冲突的常识，比如第一个if的使用！*/


public class TableTennisTeam {
    public static void main(String[] args) {
       String a= null; String b = null; String c = null;
       String s[] ={"x","y","z"};
       for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               for (int k=0;k<3;k++){
                   a = s[i];
                   b = s[j];
                   c = s[k];
                   if (a != b && b!= c && a!=c){
                       if (a!="x" &&c!="x" &&c!="z"){
                           System.out.println("a的对手是："+a+"，b的对手是："+b +"，c的对手是："+c );
                       }
                   }
               }
           }
       }
    }
}
