/**
 * @ClassName : ThreadB
 * @Description : 线程b
 * @Author : chenyqx
 * @Date: 2020-09-12 15:08
 */
public class ThreadB extends Thread{
    private Service service;

    ThreadB(String name,Service service){
        super();
        this.setName(name);
        this.setService(service);
    }

    public ThreadB(Service service) {
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
