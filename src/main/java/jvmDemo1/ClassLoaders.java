package jvmDemo1;

public class ClassLoaders {
    public static void main(String[] args) throws ClassNotFoundException {
        //类加载器 ClassLoader
        //负责加载class文件，class文件在文件开头有特定的文件提示，并且ClassLoader只负责class文件的加载，至于它是否可以运行
        //则由Execution Engine负责
        Object obj = new Object();
        System.out.println(obj.getClass().getClassLoader()); //null Bootstrap

        ClassLoaders classLoader = new ClassLoaders();
        System.out.println(classLoader.getClass().getClassLoader());// AppClassLoader

        //%JAVA_HOME%/jre/lib/ext/Hello.jar
        Class c = Class.forName("com.cxl.jvmDemo.Hello");
        System.out.println(c.getClassLoader());  //ExtClassLoader

        //JVM中的双亲委派机制
        /*
        * 双亲委派模型工作原理
        * 1.当Application ClassLoader 收到一个类加载请求时,他首先不会自己去尝试加载这个类,而是将这个请求委派给父类加载器
        * Extension ClassLoader去完成。
        * 2.当Extension ClassLoader 收到一个类加载请求时,他首先也不会自己去尝试加载这个类,而是将这个请求委派给父类加载器
        * Bootstrap ClassLoader去完成。
        * 3.如果Bootstrap ClassLoader加载失败(在<JAVA_HOME>\lib中未找到所需类),就会让Extension ClassLoader尝试加载。
        * 4.如果Extension ClassLoader也加载失败,就会使用Application ClassLoader加载
        * 5.如果Application ClassLoader也加载失败,就会使用自定义加载器去尝试加载
        * 6.如果均加载失败,就会抛出ClassNotFoundException异常
        * */

        /*
        *
        *  双亲委派模型工作过程：
        *  1.实现双亲委派模型的代码都集中在java。lang.ClassLoader的loadClass()方法中。
        *  2.首先会检查请求加载的类是否已经被加载过。
        *  3.若没有被加载过。
        *  4.递归调用父类加载器的loadClass();
        *  5.父类加载器为空后就使用启动类加载器加载
        *  6如果父类加载器和启动类加载器均无法加载请求,则调用自身的加载功能。
        * */

        /*
        *  双亲委派模型的优点
        *  1.java类伴随其类加载器具备了带有优先级的层次关系,确保了在各类加载环境的加载顺序。
        *  2.保证了运行的安全性,防止不可信类扮演可信任的类.
        *
        * */
        // JAVA中的沙箱模型



    }
}
