import java.util.concurrent.*;

/**
 * @ClassName : Run
 * @Description : 运行类
 * @Author : chenyqx
 * @Date: 2020-09-12 14:18
 */
public class Run {


    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);

        b.interrupt();
        System.out.println("main中断了a");
    }

}
