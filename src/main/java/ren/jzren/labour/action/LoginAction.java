package ren.jzren.labour.action;

import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hubo on 2015/6/2
 */

@Controller
public class LoginAction {

    private static Logger log = LogManager.getLogger(LoginAction.class);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 从定向地址
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {

        String md5Password = Md5Crypt.md5Crypt(password.getBytes());

        log.info(" login username : {}", username);
        log.info(" login md5 password : {}", md5Password);

        return "redirect:index";
    }

}
