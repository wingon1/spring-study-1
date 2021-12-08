package com.example.hello.discount;

import com.example.hello.member.Grade;
import com.example.hello.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 2000;


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
