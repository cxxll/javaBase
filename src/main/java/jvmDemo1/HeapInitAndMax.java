package jvmDemo1;

public class HeapInitAndMax {
    public static void main(String[] args) {
        //-Xms10m -Xmx10m -XX:+PrintGCDetails  JVM设置
        //获取堆内存的初始值和最大值
        //物理内存的1/64
        long totalMemory = Runtime.getRuntime().totalMemory();//字节码
        //物理内存的1/4
        long maxMemory = Runtime.getRuntime().maxMemory();
        //totalMemory：243MB
        System.out.println("totalMemory：" + totalMemory/1024/1024+"MB");
        //maxMemory:3596MB
        System.out.println("maxMemory:"+maxMemory/1024/1024+"MB");
    }
}
