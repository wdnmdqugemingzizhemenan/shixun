package com.ecjtu.interceptor;

import com.ecjtu.pojo.User;
import com.ecjtu.tools.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class SysInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        log.info("SySInterceptor !!!!!");
        HttpSession session =request.getSession();
        User user =(User) session.getAttribute(Constants.User_SESSION);
        if (user==null){
            response.sendRedirect(request.getContextPath()+"/401.jsp");
            return false;
        }
        return super.preHandle(request, response, handler);
    }
}
