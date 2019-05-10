package com.example.customviewapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCustomView extends View {

    private int viewColor;
    private int textColor;
    private String viewText;
    private Paint paintObject;

    public MyCustomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);

        paintObject = new Paint();

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet,
                R.styleable.MyCustomView,0,0);

        try {

            viewColor = typedArray.getInteger(R.styleable.MyCustomView_viewColor,0);
            textColor = typedArray.getInteger(R.styleable.MyCustomView_textColor,0);
            viewText = typedArray.getString(R.styleable.MyCustomView_viewText);

        }catch (Exception e){

            typedArray.recycle();

        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paintObject.setStyle(Paint.Style.FILL);
        paintObject.setAntiAlias(true);
        paintObject.setColor(viewColor);

        canvas.drawCircle(200,200,200,paintObject);
        paintObject.setColor(textColor);
        paintObject.setTextAlign(Paint.Align.CENTER);
        paintObject.setTextSize(50);
        canvas.drawText(viewText,200,200,paintObject);
    }

    public int getViewColor() {
        return viewColor;
    }

    public void setViewColor(int viewColor) {
        this.viewColor = viewColor;
        invalidate();
        requestLayout();
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        invalidate();
        requestLayout();
    }

    public String getViewText() {
        return viewText;
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;
        invalidate();
        requestLayout();
    }
}
