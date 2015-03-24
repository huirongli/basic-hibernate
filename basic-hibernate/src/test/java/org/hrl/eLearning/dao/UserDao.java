package org.hrl.eLearning.dao;

import org.hrl.eLearning.model.User;
import org.springframework.stereotype.Repository;
//@Repository是Spring基于持久层（dao）的注入注解；而相对应的业务层为@Service;控制器层为@Controller
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao{

}
