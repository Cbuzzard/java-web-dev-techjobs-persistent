package org.launchcode.javawebdevtechjobspersistent.config.s5;

import org.launchcode.javawebdevtechjobspersistent.controllers.s5.AuthenticationController;
import org.launchcode.javawebdevtechjobspersistent.models.data.s5.UserRepository;
import org.launchcode.javawebdevtechjobspersistent.models.s5.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AuthenticationFilter extends HandlerInterceptorAdapter {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationController authenticationController;

    private static final List<String> whitelist = Arrays.asList("/s5/login", "/s5/register", "/s5/logout", "/css", "/js", "/a3", "/s1", "/s2", "/s3", "/s4", "/employers", "/list", "/search", "/skills", "/view", "/add");

    private static boolean isWhitelisted(String path) {
        System.out.println(path);
        if (path.equals("/")) return true;
        for (String pathRoot : whitelist) {
            if (path.startsWith(pathRoot)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws IOException {

        // Don't require sign-in for whitelisted pages
        if (isWhitelisted(request.getRequestURI())) {
            // returning true indicates that the request may proceed
            return true;
        }

        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);

        // The user is logged in
        if (user != null) {
            return true;
        }

        // The user is NOT logged in
        response.sendRedirect("/s5/login");
        return false;
    }

}
