package com.study.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    // 생성자 주입
    @Qualifier("normal") // 같은 타입의 Bean이 두 개 이상일 때 이름을 지정해서 특정한 이름의 객체를 주입받는 방식
    private final SampleDAO sampleDAO;

    // 필드 주입
//    @Autowired
//    private SampleDAO sampleDAO;

}
