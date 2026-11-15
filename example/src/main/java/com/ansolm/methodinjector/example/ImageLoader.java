package com.ansolm.methodinjector.example;

import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/MethodInjector
 */
public class ImageLoader {
    public void loadRes(View view, int res) {
        Glide.with(view)
                .load(res)
                .into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {

                    }
                });

    }
}
