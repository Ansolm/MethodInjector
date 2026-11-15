package com.ansolm.methodinjector.example;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public class Extends {
    public static void mains() {
        ClassImpl cl = new ClassImpl("n", "s") {
        };
        ClassImpl absClass = new ClassImpl("name", "20") {
            @Override
            public void setOnSettingListener(OnSettingListener listener) {
                super.setOnSettingListener(listener);
                cl.setOnClass(new ClassImpl("", "") {
                    @Override
                    public String getAddress() {
                        return super.getAddress();
                    }

                    @Override
                    public String getName() {
                        return super.getName();
                    }

                    @Override
                    public void setOnSettingListener(OnSettingListener listener) {
                        super.setOnSettingListener(listener);
                    }

                    @Override
                    public void setOnClass(ClassImpl impl) {
                        super.setOnClass(impl);
                    }
                });
            }
        };
        absClass.setOnSettingListener(new OnSettingListener() {
            @Override
            public boolean set(boolean isSet) {
                return false;
            }
        });
        absClass.setOnClass(new ClassImpl("ansolm", "20") {
            @Override
            public String getAddress() {
                return super.getAddress();
            }

            @Override
            public int count(int a, int b) {
                return super.count(a, b);
            }
        });
    }
}
