package sahaayata.bvb.edu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;


public class MainActivity extends Activity {
	protected boolean _active = true;
	protected int _splashTime = 3000; 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		Thread splashTread = new Thread() {
	        @Override
	        public void run() {
	            try {
	                int waited = 0;
	                while(_active && (waited < _splashTime)) {
	                    sleep(100);
	                    if(_active) {
	                        waited += 100;
	                    }
	                }
	            } catch(InterruptedException e) {
	                // do nothing
	            } finally {
	                finish();
	                startActivity(new Intent("sahaayata.bvb.edu.Menu"));
	                stop();
	            }
	        }
	    };
	    splashTread.start();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
