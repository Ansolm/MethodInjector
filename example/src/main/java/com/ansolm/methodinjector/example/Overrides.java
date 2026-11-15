package com.ansolm.methodinjector.example;

import android.content.res.Resources;
import android.graphics.Bitmap;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public class Overrides {
    public static void mains() {
        MethodImpl method = new MethodImpl() {
            @Override
            void method(Bitmap bitmap, Resources resources) {
                super.method(bitmap, resources);
                new MethodImpl(){
                    @Override
                    void method(Bitmap bitmap, Resources resources) {
                        super.method(bitmap, resources);
                    }
                };
            }
        };

    }
}
