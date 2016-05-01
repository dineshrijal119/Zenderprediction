package np.com.pragnancy.net.zenderprediction.quize;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import np.com.pragnancy.net.zenderprediction.R;

public class ResultActivity extends AppCompatActivity {
	ImageView imgQize;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_quize);
		TextView t=(TextView)findViewById(R.id.textResult);
		imgQize=(ImageView) findViewById(R.id.quizeImage) ;
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		switch (score)
		{
		case 1: imgQize.setImageResource(R.drawable.quize_girl);
			t.setText("cute girl !!");
			break;
		case 2: t.setText("Boy !!!");
			imgQize.setImageResource(R.drawable.quize_boy);
		break;
		case 3:
			break;
		case 4:t.setText("Girl !!!");
			imgQize.setImageResource(R.drawable.quize_girl);
			break;
		case 5:t.setText("Twins");
			imgQize.setImageResource(R.drawable.twins);
		break;
		}
	}

}
