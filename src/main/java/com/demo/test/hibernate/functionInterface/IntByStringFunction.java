package com.demo.test.hibernate.functionInterface;

@FunctionalInterface
public interface IntByStringFunction<T,R> {
    T convert(R r);
}
