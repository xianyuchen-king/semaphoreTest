/**
 * @ClassName : ThreadA
 * @Description : 线程a
 * @Author : chenyqx
 * @Date: 2020-09-12 15:05
 */
public class ThreadA extends Thread{

    private Service service;

    ThreadA(String name,Service service){
        super();
        this.setName(name);
        this.setService(service);
    }

    public ThreadA(Service service) {
        super();
        this.setService(service);
    }

    @Override
    public void run() {
        this.service.testMethod();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
