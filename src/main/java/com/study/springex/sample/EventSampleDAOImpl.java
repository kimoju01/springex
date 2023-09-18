package com.study.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary // 같은 타입의 Bean이 두 개 이상일 때 주입할 클래스 객체를 지정
@Qualifier("event") // 같은 타입의 Bean이 두 개 이상일 때 이름을 지정해서 특정한 이름의 객체를 주입받는 방식
public class EventSampleDAOImpl implements SampleDAO {
}
