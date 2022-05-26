package dubboapi;

import dubboapi.UserService;
import org.springframework.util.StringUtils;

/**
 * @author tanxy
 * @date 2022年05月26日 2:52 下午
 *
 * Stub 必须有可传入 Proxy 的构造函数。 ↩︎
 *
 * 在 interface 旁边放一个 Stub 实现，
 * 它实现 BarService 接口，并有一个传入远程 BarService 实例的构造函数 ↩︎
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是userService的远程的代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUserAdders(String name) {
        System.out.println("stub.......");
        if (StringUtils.isEmpty(name)){
          return   userService.getUserAdders(name);
        }
        return null;
    }
}
