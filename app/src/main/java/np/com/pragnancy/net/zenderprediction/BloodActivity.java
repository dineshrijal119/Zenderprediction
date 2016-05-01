package np.com.pragnancy.net.zenderprediction;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.content.DialogInterface;
/**
 * Created by dinesh on 4/18/16.
 */
public class BloodActivity extends AppCompatActivity implements View.OnClickListener{
    EditText momAgeConcp,dadAgeConcp;
    private double dadAgeDevided = 0.0d;
    private double momAgeDevided = 0.0d;
    Button calculation;
    LinearLayout linearLayout;

    private Handler mHandler = new Handler();
    int mProgressStatus=0;
    private ProgressBar progBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blood_main);
        momAgeConcp=(EditText) findViewById(R.id.mothrBlood);
        dadAgeConcp=(EditText) findViewById(R.id.dadBlood);
        calculation=(Button) findViewById(R.id.bloodCalculate);
        progBar= (ProgressBar)findViewById(R.id.progressBarBlood);
         linearLayout=(LinearLayout) findViewById(R.id.bloodLinear);
        calculation.setOnClickListener(this);
        android.support.v7.app.ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Blood Update Method");

    }

    public void calculate(){
        int momAgeAtConception= Integer.parseInt(momAgeConcp.getText().toString());
        int dadAgeAtConception=Integer.parseInt(dadAgeConcp.getText().toString());
       dadAgeDevided = (((double) dadAgeAtConception) / 4.0d) - ((double) (dadAgeAtConception / 4));
       momAgeDevided = (((double) momAgeAtConception) / 3.0d) - ((double) (momAgeAtConception / 3));
            if (momAgeDevided < dadAgeDevided) {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    builder/*.setPositiveButton("Check Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    }).setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })*/.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            Intent intent =new Intent (BloodActivity.this,BloodActivity.class);
                            startActivity(intent);
                        }
                    });
                }
                android.app.AlertDialog dialog = builder.create();
                LayoutInflater inflater = getLayoutInflater();
                View dialogLayout = inflater.inflate(R.layout.blood_girl, null);
                dialog.setView(dialogLayout);
                Button bloodGirl=(Button)dialogLayout.findViewById(R.id.btnBloodgirl);
                bloodGirl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent (BloodActivity.this,BloodActivity.class);
                        startActivity(intent);
                    }
                });
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

                dialog.show();
            } else {

                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    builder/*.setPositiveButton("Check Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    }).setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })*/.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            Intent intent =new Intent (BloodActivity.this,BloodActivity.class);
                            startActivity(intent);
                        }
                    });
                }
                android.app.AlertDialog dialog = builder.create();
                LayoutInflater inflater = getLayoutInflater();
                View dialogLayout = inflater.inflate(R.layout.blood_boy, null);

                dialog.setView(dialogLayout);
               //Controlling width and height.
                Button bloodBoy=(Button)dialogLayout.findViewById(R.id.btnBloodboy);
                bloodBoy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent (BloodActivity.this,BloodActivity.class);
                        startActivity(intent);
                    }
                });

//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                Window window = dialog.getWindow();
                window.setLayout(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.show();

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.bloodCalculate:

            int momAgeAtConception= Integer.parseInt(momAgeConcp.getText().toString());
            int dadAgeAtConception=Integer.parseInt(dadAgeConcp.getText().toString());
            if ((momAgeAtConception >= 16 && momAgeAtConception <= 60 ) && dadAgeAtConception >= 16 && dadAgeAtConception <= 70) {
                dosomething();
            }else {
                Snackbar snackbar = Snackbar.make(v, "Please enter  valid input ", Snackbar.LENGTH_LONG);
                  /*  snackbar.setAction("Login ?", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                            startActivity(intent);

                        }
                    });*/
                View snackBarView = snackbar.getView();
                snackBarView.setBackgroundColor(getResources().getColor(R.color.blood_button_pressed));
                snackbar.setActionTextColor(getResources().getColor(R.color.chiness_button_pressed));
                snackbar.show();
            }



        break;
        }

    }

    public void dosomething() {

        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus <= 100) {
                    mProgressStatus += 1;
                    mHandler.post(new Runnable() {
                        public void run() {
                            progBar.setVisibility(View.VISIBLE);
                            progBar.setProgress(mProgressStatus);
                            linearLayout.setVisibility(View.GONE);
//                            text.setText(""+mProgressStatus+"%");
                            if (mProgressStatus == 100){
                                calculate();

                            }

                        }
                    });
                    try {



                        Thread.sleep(50);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }).start();

    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if ( v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent( event );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
