package jvmDemo1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //-Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError  JVM设置
    byte[] bytes =new byte[1024*1024];//1M
    public static void main(String[] args) {
        List<Test> list = new ArrayList<Test>();
        for (int i =1;i<=20;i++){
            list.add(new Test());
        }
    }
}
