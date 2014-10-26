package sahaayata.bvb.edu;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends Activity {
	/** Called when the activity is first created. */
	WebView wv;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.web);
	
	Bundle b = getIntent().getExtras(); 
	String site=b.getString("site");
	//Log.e("INFO", site);
	wv = (WebView) findViewById(R.id.ww);
	wv.setWebViewClient(new Callback());
	WebSettings webSettings = wv.getSettings();
	webSettings.setBuiltInZoomControls(true);
	wv.loadUrl(site);
	
	wv.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
	}
	private class Callback extends WebViewClient {
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
	return(false);
	}
	
	}
}
