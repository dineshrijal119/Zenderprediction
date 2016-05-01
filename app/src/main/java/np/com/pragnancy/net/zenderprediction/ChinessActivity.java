package np.com.pragnancy.net.zenderprediction;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

/**
 * Created by dinesh on 4/18/16.
 */
public class ChinessActivity extends AppCompatActivity implements  OnItemClickListener, OnItemSelectedListener, View.OnClickListener {
    AutoCompleteTextView textView;
    private ArrayAdapter<String> adapter;
    Button btnWhat;
    String item[]={
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"};

    final static int RQS_1 = 1;

//    private TextView text;


    EditText mothrAge;
    Button calc;
    private Handler mHandler = new Handler();
    int mProgressStatus=0;
    private ProgressBar progBar;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.chiness_main);

        mothrAge = (EditText) findViewById(R.id.mothrAge);
        textView = (AutoCompleteTextView) findViewById(R.id.dateChick);
        calc = (Button) findViewById(R.id.calculate);
        progBar= (ProgressBar)findViewById(R.id.progressBar);
        final LinearLayout linearLayout=(LinearLayout) findViewById(R.id.linearLayout) ;
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.GONE);
//                progBar.setVisibility(View.VISIBLE);

//                progBar.setVisibility(View.VISIBLE);
                dosomething();
//                takeData();
            }
        });

      /*  ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,item);

        textView.setAdapter(adapter);
        textView.setThreshold(1);*/


        /*btnWhat=(Button) findViewById(R.id.calculate);
        btnWhat.setOnClickListener(this);*/
}
   @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
                               long arg3) {
        // TODO Auto-generated method stub
        //Log.d("AutocompleteContacts", "onItemSelected() position " + position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

        InputMethodManager imm = (InputMethodManager) getSystemService(
                INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub



    }

    protected void onResume() {
        super.onResume();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgBtn:




        }
    }

    public void takeData() {
        int minimum = Integer.parseInt(mothrAge.getText().toString());
        int dateconception=Integer.parseInt(textView.getText().toString());
        if ((minimum >= 18 && minimum <= 45) && (dateconception >=1 && dateconception <= 12) ) {

            String mother = mothrAge.getText().toString();

            String chick = textView.getText().toString();

            if (mother.equals("18")) {
                if ((chick.equals("1") || chick.equals("3"))) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("19")) {
                if ((chick.equals("2") || chick.equals("4") || chick.equals("5") || chick.equals("11") || chick.equals("12"))) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("20")) {
                if ((chick.equals("1")) || chick.equals("3") || chick.equals("10")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("21")) {
                if ((chick.equals("2")) || chick.equals("3") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("8") || chick.equals("9") || chick.equals("10") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("22")) {

                if ((chick.equals("1")) || chick.equals("4") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("10") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("23")) {
                if ((chick.equals("3")) || chick.equals("6") || chick.equals("8") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();

                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("24")) {
                if ((chick.equals("2")) || chick.equals("5") || chick.equals("8") || chick.equals("9") || chick.equals("10") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("25")) {
                if ((chick.equals("1")) || chick.equals("4") || chick.equals("5") || chick.equals("7")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("26")) {
                if ((chick.equals("2")) || chick.equals("4") || chick.equals("5") || chick.equals("7")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("27")) {
                if ((chick.equals("1")) || chick.equals("3") || chick.equals("5") || chick.equals("6") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals(("28"))) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("29")) {
                if (chick.equals("1") || chick.equals("3") || chick.equals("4") || chick.equals("10") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("30")) {
                if (chick.equals("2") || chick.equals("3") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("8") || chick.equals("9") || chick.equals("10")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if ((mother.equals("31"))) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("8") || chick.equals("9") || chick.equals("10") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("32")) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("8") || chick.equals("9") || chick.equals("10") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("33")) {
                if (chick.equals("1") || chick.equals("3") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("10") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("34")) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("10")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("35")) {
                if (chick.equals("3") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("10")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("36")) {
                if (chick.equals("1") || chick.equals("4") || chick.equals("6") || chick.equals("7") || chick.equals("8")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("37")) {
                if (chick.equals("2") || chick.equals("5") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("38")) {
                if (chick.equals("1") || chick.equals("3") || chick.equals("6") || chick.equals("8") || chick.equals("10") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("39")) {
                if (chick.equals("2") || chick.equals("6") || chick.equals("7") || chick.equals("9") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("40")) {
                if (chick.equals("1") || chick.equals("3") || chick.equals("5") || chick.equals("8") || chick.equals("10") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("41")) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("6") || chick.equals("9") || chick.equals("11")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("42")) {
                if (chick.equals("1") || chick.equals("3") || chick.equals("5") || chick.equals("7") || chick.equals("10") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("43")) {
                if (chick.equals("2") || chick.equals("4") || chick.equals("6") || chick.equals("8")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("44")) {
                if (chick.equals("3") || chick.equals("7") || chick.equals("9") || chick.equals("11") || chick.equals("12")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else if (mother.equals("45")) {
                if (chick.equals("1") || chick.equals("4") || chick.equals("5") || chick.equals("6") || chick.equals("8") || chick.equals("10")) {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.girl));
                    builder.show();
                } else {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(getString(R.string.boy));
                    builder.show();
                }
            } else {
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(getString(R.string.unvalid));
                builder.show();
            }


        }else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                builder.setPositiveButton("Check Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        Intent intent =new Intent (ChinessActivity.this,ChinessActivity.class);
                        startActivity(intent);
                    }
                });
            }
            AlertDialog dialog = builder.create();
            LayoutInflater inflater = getLayoutInflater();
            View dialogLayout = inflater.inflate(R.layout.check, null);
            dialog.setView(dialogLayout);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

            dialog.show();
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
//                            text.setText(""+mProgressStatus+"%");
                            if (mProgressStatus == 100){
                              takeData();

//                                startActivity(intent);
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

}