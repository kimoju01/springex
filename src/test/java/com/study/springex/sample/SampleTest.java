package com.study.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
// @ExtendsWith: JUnit5 버전에서 'spring-test'를 사용하기 위한 설정
@ExtendWith(SpringExtension.class)
// @ContextConfiguration: 스프링의 설정 정보를 로딩하기 위해 사용
// XML 설정 시에는 locations 속성, 자바 설정 시에는 classes 속성을 이용
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTest {

    // @Autowired: 의존성 주입 관련 어노테이션
    // '만일 해당 타입의 Bean이 존재하면 여기에 주입해 주기를 원한다'라는 의미
    @Autowired
    private SampleService sampleService;

    @Test
    public void testService1() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }
}
