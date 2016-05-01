package np.com.pragnancy.net.zenderprediction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class SplashActivity extends Activity {

    private ProgressBar progBar;
    private TextView text,txtBottom;
    private static String TAG = SplashActivity.class.getName();
    private static long SLEEP_TIME = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);    // Removes title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_main);
        TextView text=(TextView) findViewById(R.id.text) ;
        TextView txtBottom=(TextView) findViewById(R.id.textbottom);
        text.setTypeface(EasyFonts.captureIt(this));
        text.setText("Baby gender prediction.. !");
        txtBottom.setTypeface(EasyFonts.captureIt(this));
        txtBottom.setText("Loading...");

        IntentLauncher launcher = new IntentLauncher();
        launcher.start();
    }



    private class IntentLauncher extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(SLEEP_TIME*1000);
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }

            // Start main activity
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            SplashActivity.this.startActivity(intent);
            SplashActivity.this.finish();
        }
    }


}