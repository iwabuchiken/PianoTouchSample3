package sample.touch;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonTouchListener3 implements OnTouchListener {

	public Context context;
	
	public ButtonTouchListener3(
			Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	public ButtonTouchListener3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// Get the text views
//		TextView tv1 = (TextView) new Activity().findViewById(R.id.textView1);
//		TextView tv1 = (TextView) new PianoTouchSample3Activity().findViewById(R.id.textView1);
		
		// Get the event X coordinate
		String locX = String.valueOf(event.getX());
		
		// toast
		Toast.makeText(new PianoTouchSample3Activity(), "yes", Toast.LENGTH_SHORT).show();
		
		
		// Set X on the text view
//		tv1.setText(locX);
		
		return false;
	}

}
