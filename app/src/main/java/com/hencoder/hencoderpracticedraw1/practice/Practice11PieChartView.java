package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    private static final Paint mPaint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        mPaint.setColor(Color.RED);
        canvas.drawArc(300,140,700,500,-180,120,true,mPaint);

        mPaint.setColor(Color.GREEN);//注意坐标系
        canvas.drawArc(300,160,700,500,20,60,true,mPaint);

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(320,150,700,500,-60,60,true,mPaint);
//        canvas.drawArc();
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(290,160,700,500,70,100,true,mPaint);

        mPaint.setColor(getResources().getColor(R.color.colorPip));
        canvas.drawArc(320,150,700,500,0,7,true,mPaint);

        mPaint.setColor(getResources().getColor(R.color.colorGray));
        canvas.drawArc(320,150,700,500,10,9,true,mPaint);

    }
}
