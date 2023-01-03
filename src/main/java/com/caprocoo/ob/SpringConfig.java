package com.caprocoo.ob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * packageName    : com.caprocoo.ob
 * fileName       : SpringConfig
 * author         : caprocoo
 * date           : 2022-12-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-09        caprocoo       최초 생성
 */

// 자바 코드로 직접 스프링 빈 등록하기
// @Service, @Repository, @Autowired를 각 class에서 제거하고 아래와 같이 @Bean을 사용해도 괜찮다.
@Configuration
public class SpringConfig {


    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }





}
