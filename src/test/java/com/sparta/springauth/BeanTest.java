package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;


    //@Autowired
    //Food food; //같은 타입의 빈 객체가 두개 이상이기때문에 임포트 되지 않음
//
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;
//
//
//
//    @Test
//    @DisplayName("테스트")
//    void test1(){
//        pizza.eat();
//        chicken.eat();
//    }

    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인")
    void test1(){
        food.eat();
    }

}
