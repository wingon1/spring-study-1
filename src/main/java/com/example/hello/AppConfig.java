package com.example.hello;

import com.example.hello.discount.DiscountPolicy;
import com.example.hello.discount.FixDiscountPolicy;
import com.example.hello.discount.RateDiscountPolicy;
import com.example.hello.member.MemberService;
import com.example.hello.member.MemberServiceImpl;
import com.example.hello.member.MemoryMemberRepository;
import com.example.hello.order.OrderService;
import com.example.hello.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}

