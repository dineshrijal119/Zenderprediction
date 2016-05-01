package np.com.pragnancy.net.zenderprediction;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.*;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import np.com.pragnancy.net.zenderprediction.quize.QuizeActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button quize,chinessMethod,bloodUpdate;

    private AdView mAdView;
    private Button btnFullscreenAd;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
     quize= (Button) findViewById(R.id.btn);
        chinessMethod=(Button) findViewById(R.id.chiness);
        bloodUpdate=(Button) findViewById(R.id.blood);
        quize.setOnClickListener(this);
        chinessMethod.setOnClickListener(this);
        bloodUpdate.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                Intent intent= new Intent(MainActivity.this,QuizeActivity.class);
                startActivity(intent);
                break;
            case R.id.chiness:
                Intent intentone= new Intent(MainActivity.this,ChinessActivity.class);
                startActivity(intentone);
                break;
            case R.id.blood:
                Intent intenttwo= new Intent(MainActivity.this,BloodActivity.class);
                startActivity(intenttwo);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                String shareBoday="Have you ever wonder that your phone can schedule your message ? No,never? Now you can, downloade the app for free https://play.google.com/store/apps/details?id=np.com.rijaldinesh.www.amazingpokhara";
                Intent sharingIntent= new Intent("android.intent.action.SEND");
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra("android.intent.extra.SUBJECT", "Schedule SMS for android");
                sharingIntent.putExtra("android.intent.extra.TEXT", shareBoday);
                startActivity(Intent.createChooser(sharingIntent,"Share with"));
                break;

            case R.id.aboutUs:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    builder./*setPositiveButton("Get Pro", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    }).setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    }).*/setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            /*Intent intent =new Intent (MainActivity.this,MainActivity.class);
                            startActivity(intent);*/
                        }
                    });
                }
                AlertDialog dialog = builder.create();
                LayoutInflater inflater = getLayoutInflater();
                View dialogLayout = inflater.inflate(R.layout.about_us, null);
                dialog.setView(dialogLayout);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

                dialog.show();
                break;
            case R.id.facebook:
                Intent facebookIntent = getOpenFacebookIntent(MainActivity.this);
                startActivity(facebookIntent);
                break;
            case R.id.sendFed:
                Intent Email = new Intent("android.intent.action.SEND");
                Email.setType("text/email");
                Email.putExtra("android.intent.extra.EMAIL", new String[]{"pregnancytest@gmail.com"});
                Email.putExtra("android.intent.extra.SUBJECT", "Feedback");
                startActivity(Intent.createChooser(Email, "Send Feedback"));
              break;

            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/878867258852210"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pregnancytest/?fref=ts"));

        }

    }

}
