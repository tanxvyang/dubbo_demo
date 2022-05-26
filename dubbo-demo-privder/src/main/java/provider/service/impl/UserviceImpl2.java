package provider.service.impl;


import dubboapi.UserService;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName UserviceImpl.java
 * @Description TODO
 * @createTime 2022年04月08日 13:59:00
 */
public class UserviceImpl2 implements UserService {
    @Override
    public String getUserAdders(String name) {
        System.out.println("UserviceImpl...old2");
        System.out.println("进入服务提供者实现类2");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name+"提供给你消费";
    }
}
