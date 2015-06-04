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
     * ÓÃ»§µÇÂ¼
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {

        String md5Password = Md5Crypt.md5Crypt(password.getBytes());



        return "redirect:index";
    }

}
