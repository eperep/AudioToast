package com.android.AudioToast;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.Toast;

public class AudioToastActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	protected void onResume() {
		
		AudioManager audioMngr = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		
		String message = "Last Output Opened Stream Timestamp = " + audioMngr.getLastOutStreamOpened();
		
		Toast toast = Toast.makeText(this, message , Toast.LENGTH_LONG);
    	toast.show();

		super.onResume();
	}
    
    
}
