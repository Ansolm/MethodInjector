package com.ansolm.methodinjector.example;

import android.content.res.Resources;
import android.graphics.Bitmap;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public abstract class MethodImpl extends AbsMethod {
    @Override
    void method(Bitmap bitmap, Resources resources) {
        super.method(bitmap, resources);
    }
}
