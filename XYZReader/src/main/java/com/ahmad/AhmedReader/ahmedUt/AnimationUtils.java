package com.ahmad.AhmedReader.ahmedUt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v4.content.ContextCompat;

public class AnimationUtils {

    public static TransitionDrawable createTransitionDrawble(Context ctx, Bitmap btm){
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(ctx,android.R.color.transparent));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(ctx.getResources(), btm);
        TransitionDrawable td = new TransitionDrawable(new Drawable[]{colorDrawable,bitmapDrawable});
        return td;
    }

}
