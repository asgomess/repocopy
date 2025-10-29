package io.codeforall.bootcamp;

@FunctionalInterface
public interface MonoOperation<T> {

    T perform(T operand);
}
