package com.study.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository     // 해당 클래스의 객체를 스프링의 Bean으로 처리되도록 구성
@Qualifier("normal") // 같은 타입의 Bean이 두 개 이상일 때 이름을 지정해서 특정한 이름의 객체를 주입받는 방식
public class SampleDAOImpl implements SampleDAO {
}
