package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice2DrawCircleView extends View {

    private Paint mPaint = new Paint();
    private Path mPath = new Path();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //        练习内容：使用 canvas.drawCircle() 方法画圆
    //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(320,160,150,mPaint);

        mPaint.setStyle(Paint.Style.STROKE); //画线
        mPaint.setStrokeWidth(5f);
        canvas.drawCircle(680,160,150,mPaint);

        mPaint.setColor(getResources().getColor(R.color.colorBlue));
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(320,480,150,mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE); //画线
        mPaint.setStrokeWidth(60);
        canvas.drawCircle(680,500,150,mPaint);
    }
}
