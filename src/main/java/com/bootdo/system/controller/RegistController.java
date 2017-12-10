package com.bootdo.system.controller;

import com.bootdo.common.annotation.Log;
import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.MD5Utils;
import com.bootdo.common.utils.R;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**注册
 * Created by Administrator on 2017/12/8.
 */

@Controller
public class RegistController {

    @GetMapping("/regist")
    public String regist(){
        return "system/user/regist";
    }


    @PostMapping("/regist")
    @ResponseBody
   public  R ajaxRegist(String username, String password) {
//        password = MD5Utils.encrypt(username, password);
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(token);
//
//        } catch (AuthenticationException e) {
//            return R.error("用户或密码错误");
//        }
        return R.ok();
    }
}
