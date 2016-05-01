package np.com.pragnancy.net.zenderprediction.custumclasses;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by dinesh on 4/19/16.
 */
public class MyText extends TextView {

    public MyText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyText(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/2Toon Expanded Italic.ttf");
        setTypeface(tf ,1);

    }

}