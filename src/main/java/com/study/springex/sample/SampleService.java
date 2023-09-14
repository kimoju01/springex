package com.study.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    // 생성자 주입
    private final SampleDAO sampleDAO;

    // 필드 주입
//    @Autowired
//    private SampleDAO sampleDAO;

}
