import java.util.concurrent.Semaphore;

/**
 * @ClassName : Service  //类名
 * @Description : 信号量服务  //描述
 * @Author : chenyqx  //作者
 * @Date: 2020-09-12 14:15  //时间
 */
public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
//        try {
            semaphore.acquireUninterruptibly();
            System.out.println(Thread.currentThread().getName()
                    + " begin timer=" + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newnewString = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()
                    + "   end timer=" + System.currentTimeMillis());
            semaphore.release();
//        } catch (InterruptedException e) {
//            System.out.println("线程" + Thread.currentThread().getName()
//                    + "进入了catch");
//            e.printStackTrace();
//        }
    }
}