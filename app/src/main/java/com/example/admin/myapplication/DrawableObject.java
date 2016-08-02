package com.example.admin.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.provider.Settings;

/**
 * Created by Admin on 8/2/2016.
 */
public class DrawableObject {
    RectF bounds=new RectF();
    Bitmap bitmap;
    float xPos, yPos, width, height;
    public DrawableObject(float xPos, float yPos, float width, float height,Bitmap bitmap){
        this.xPos = xPos;
        this.yPos = yPos;
        this.bitmap = bitmap;
        this.width = width;
        this.height = height;
        setBounds();
    }
    private void setBounds(){
        bounds.set(xPos - width * .5f, yPos - height * .5f, xPos + width * .5f, yPos + .5f * height );
    }
    public void update(Canvas canvas){
        if (bitmap == null) System.out.print("QRF:You did not feed a drawable object to bitmap");
        else {
            canvas.drawBitmap(bitmap, null, bounds, null);
        }
    }

}

