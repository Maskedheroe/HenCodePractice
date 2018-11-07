package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private static final Paint mPaint = new Paint();
    private static final Path mPath = new Path();
    private static final int GAP = 10;
    private static final int HEIGHT = 620;
    private static final int BARSIZE = 100;


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPath.rewind();
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(5f);
        mPaint.setStyle(Paint.Style.STROKE);


        canvas.drawLine(150,120,150,620,mPaint);

        mPath.moveTo(150,620); //设置起点 ！！！重要
        mPath.lineTo(1000,620); //直接连接  如果出错可以重启app试试
        canvas.drawPath(mPath,mPaint);

        mPaint.setTextSize(18);
        mPaint.setStrokeWidth(1f);
        mPaint.setTextSize(40);
        canvas.drawText("直方图", 450, 700, mPaint);

        mPaint.setColor(Color.GREEN);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(150+BARSIZE+2*GAP,HEIGHT-20,150+2*BARSIZE+2*GAP,620,mPaint);
        mPaint.setTextSize(20);
        canvas.drawText("GB", 150+BARSIZE+2*GAP, 650, mPaint);

        canvas.drawRect(150+2*BARSIZE+3*GAP,HEIGHT-20,150+3*BARSIZE+3*GAP,615 ,mPaint);

        canvas.drawRect(150+3*BARSIZE+4*GAP,HEIGHT-200,150+4*BARSIZE+4*GAP,615,mPaint);

        canvas.drawRect(150+4*BARSIZE+5*GAP,HEIGHT-350,150+5*BARSIZE+5*GAP,615,mPaint);

        canvas.drawRect(150+5*BARSIZE+6*GAP,HEIGHT-420,150+6*BARSIZE+6*GAP,615,mPaint);

        canvas.drawRect(150+6*BARSIZE+7*GAP,HEIGHT-170,150+7*BARSIZE+7*GAP,615,mPaint);


    }
}
