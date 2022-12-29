package com.caprocoo.ob.common;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.caprocoo.ob.common
 * fileName       : JwtAccessDeniedHandler
 * author         : caprocoo
 * date           : 2022-12-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-28        caprocoo       최초 생성
 */
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler{

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        // 필요한 권한이 존재하지 않는 경우에 발생하는 403 에러 처리
        response.sendError(HttpServletResponse.SC_FORBIDDEN);
    }
}