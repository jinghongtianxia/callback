package com.example.callback;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Process {

    private Computer computer;

    public Process(Computer computer) {
        this.computer = computer;
    }

    public void add(int a, int b) {
        int c = a + b;
        computer.result(c);
    }

    public void minus(int a, int b) {
        int c = a - b;
        computer.result(c);
    }

    public void multiply(int a, int b) {
        int c = a * b;
        computer.result(c);
    }

    public void divide(int a, int b) {
        int c = a / b;
        computer.result(c);
    }

}
