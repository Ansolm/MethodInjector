package com.ansolm.methodinjector.example;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public abstract class ClassImpl extends AbsClass {
    public ClassImpl(String name, String address) {
        super(name, address);
    }

    public void setOnSettingListener(OnSettingListener listener) {
        listener.set(true);
    }

    public void setOnClass(ClassImpl impl) {

    }
}
