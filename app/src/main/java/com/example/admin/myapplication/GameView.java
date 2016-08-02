package com.example.admin.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Admin on 8/2/2016.
 */
public class GameView extends View {
    DrawableObject drawableObject;
    public GameView(Context context) {
        super(context);
    }
    private void loadBitmapsAndCreateDrawableObjects(){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.background);
        drawableObject = new DrawableObject(10, 10, 200, 200,
                bitmap);
    }
    public void onDraw(Canvas canvas){
        drawableObject.update(canvas);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        invalidate();
    }
}
