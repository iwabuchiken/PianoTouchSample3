package sample.touch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PianoTouchSample3Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pianotouchsample3);
        
        // define a button
        ImageButton ibtn1 = (ImageButton) findViewById(R.id.ibtn_c4);
		
        // add a listener
//        ibtn1.setOnTouchListener();
        ibtn1.setOnTouchListener(new TouchListener());
		
        
    }
    
    class TouchListener implements OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			
			TextView tv1 = (TextView) findViewById(R.id.textView1);
			TextView tv2 = (TextView) findViewById(R.id.textView2);
			
			// set text
			tv1.setText(String.valueOf(event.getX()));
			tv2.setText(String.valueOf(event.getY()));
			
			// toast
//			Toast.makeText(PianoTouchSample3Activity.this, String.valueOf(event.getX()), Toast.LENGTH_SHORT).show();
			
			return false;
		}
    	
    }
}