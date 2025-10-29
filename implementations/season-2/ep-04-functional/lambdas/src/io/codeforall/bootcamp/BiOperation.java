package io.codeforall.bootcamp;

@FunctionalInterface
public interface BiOperation<T> {

    T perform(T operand1, T operand2);
}
