package programme;

/**
 * Created by IntelliJ IDEA.
 * User: deber
 * Date: 2018/11/7
 * Time: 19:18
 **/
public class num5 {
    public static void main(String[] args) {
        int sum =Accumulation(5);
        System.out.println(sum);
    }

    public static int Accumulation(int i){
        if (i > 2){
            return i*Accumulation(i-1);
        }
        return i;
    }
}
