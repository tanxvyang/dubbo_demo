package consumer.service.impl;

import dubboapi.OrderService;
import dubboapi.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName OrderServiceImpl.java
 * @Description TODO
 * @createTime 2022年04月08日 13:43:00
 */
@Service
public class OrderServiceImpl implements OrderService {
    //获取用户
    @Autowired
    UserService userService;
    @Override
    public void initial(String userid) {
        System.out.println("进入消费者实现类");
        System.out.println(userid+"初始化订单了"+userService.getUserAdders(userid));
    }
}
