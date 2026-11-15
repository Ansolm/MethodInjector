package com.ansolm.methodinjector.example;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public abstract class AbsClass {
    String name;
    String address;

    public AbsClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int count(int a, int b) {
        return a + b;
    }
}
