package io.codeforall.bootcamp;

public interface Machine<T> {

    T perform(MonoOperation<T> operation, T operand);

    T perform(BiOperation<T> operation, T operand1, T operand2);

}
