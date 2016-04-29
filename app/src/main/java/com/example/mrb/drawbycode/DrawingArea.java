package com.example.mrb.drawbycode;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by mrb on 16-04-26.
 */
public class DrawingArea extends View // You need to extend the View class
{
    boolean blnShowText;
    int intTextPosition;

    Paint pntTextPaint;     // Painting object to handle the paint jobs for text
    Paint pntBlackPaint;    // Painting object to handle the paint jobs for graphics
    Paint pntRedPaint;      // Painting object to handle the paint jobs for graphics
    Paint pntGreenPaint;
    Paint pntBluePaint;
    Paint pntMagentaPaint;
    Paint pntMagentaPaint2;
    Paint pntYellowPaint;

    public DrawingArea(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.DrawingArea,
                0, 0);

        try {
            blnShowText = a.getBoolean(R.styleable.DrawingArea_displayText, false);
            intTextPosition = a.getInteger(R.styleable.DrawingArea_labelPosition, 0);
        } finally {
            a.recycle();
        }

        init(); // Calling the init() method happens once, when we set up our Paint objects
    }

    private void init()
    {
        // This method is called once when the DrawingArea object is made.
        // It is best practice to handle the set-up of our Paint objects here rather than in onDraw()

        pntTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntBlackPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntRedPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntGreenPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntBluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntMagentaPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntYellowPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pntMagentaPaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);

        pntYellowPaint.setColor(Color.YELLOW);
        pntYellowPaint.setStrokeWidth(15);

        pntMagentaPaint.setColor(Color.MAGENTA);
        pntMagentaPaint.setStrokeWidth(20);

        pntBluePaint.setColor(Color.BLUE);
        pntBluePaint.setStrokeWidth(6);

        pntGreenPaint.setColor(Color.GREEN);
        pntGreenPaint.setStrokeWidth(5);

        pntBlackPaint.setColor(Color.BLACK);
        pntBlackPaint.setStrokeWidth(3);

        pntRedPaint.setColor(Color.RED);
        pntRedPaint.setStrokeWidth(3);

        pntMagentaPaint2.setColor(Color.MAGENTA);
        pntMagentaPaint2.setStrokeWidth(8);

    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        // This method exists to handle re-drawing of the DrawingArea object in the event of a
        //   resize of our App. For example, tilting the device may require us to redraw our content.
        // More instructions are meant to be added at the bottom if required.

        super.onSizeChanged(w, h, oldw, oldh);

    }

    protected void onDraw(Canvas canvas)
    {
        // This method is where we issue our actual drawing commands.
        // The Canvas parameter is what we draw ON; the Paint objects defined above are what we draw WITH.

        /* STICK MAN
        super.onDraw(canvas);

        canvas.drawCircle((float) 50.0, (float) 50.0, (float) 50.0, pntBlackPaint); //random circle

        canvas.drawLine((float) 358, (float) 585, (float) 270, (float) 800, pntMagentaPaint); //left leg

        canvas.drawLine((float) 433, (float) 585, (float) 523, (float) 800, pntMagentaPaint); //right leg

        canvas.drawRect((float) 180, (float) 385.5, (float) 385, (float) 420, pntYellowPaint); //left arm

        canvas.drawRect((float) 440 , (float) 385.5, (float) 645, (float) 420, pntYellowPaint); //right arm

        canvas.drawRect((float) 345, (float) 275, (float) 445, (float) 600, pntBluePaint); //body

        canvas.drawCircle((float) 400, (float) 200, (float) 100, pntGreenPaint); // head
        */
        float x;
        x = 0;
        float previousLine;
        previousLine = 0;
        float previousLine2;
        previousLine2 = 0;
        //float y;
        //y = 0;

        while (x < 10 /*&& y <0*/) {

            canvas.drawLine((float) 0, (float) 0, (float) 1280, (float) 0, pntMagentaPaint2);
            canvas.drawLine((float) 0, (float) 0, (float) 0, (float) 1000, pntMagentaPaint2);
            x = x + 1;
            //y = y + 1;
            previousLine = previousLine +100;
            previousLine2 = previousLine2 +73;

            if (previousLine > 0) {

                canvas.drawLine((float) 0, (previousLine), (float) 1280, (previousLine), pntMagentaPaint2);
                canvas.drawLine((previousLine2), (float) 0, (previousLine2), (float) 1000, pntMagentaPaint2);


                }


        }










        //canvas.drawRect((float) 40, (float) 40, (float) 40, (float) 40, pntRedPaint );

        // canvas.draw


    }


}
