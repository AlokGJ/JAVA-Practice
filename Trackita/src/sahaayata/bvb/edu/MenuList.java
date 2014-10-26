package sahaayata.bvb.edu;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuList extends Activity {
	byte[] data;
	HttpPost httppost;
	StringBuffer buffer;
	HttpResponse response;
	HttpClient httpclient;
	InputStream inputStream;
	List<NameValuePair> nameValuePairs;
	ProgressDialog progDailog;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.menulist);
		
		 final EditText log=(EditText) findViewById(R.id.longi);
		final EditText lat=(EditText) findViewById(R.id.lat);
	
		
		Button b=(Button) findViewById(R.id.gaurd);
		b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
				
				//web
				progDailog = ProgressDialog.show(MenuList.this,
        				"Creating Account", "Please Wait....",
        				true);
        				new Thread() {
        				public void run() {
        				try{
        				// just doing some long operation
        				sleep(0);
        				} catch (Exception e) { }
        				
        				 }
        				}.start();
				
        				try {
    				    	httpclient = new DefaultHttpClient();
    					    httppost = new HttpPost("http://bvb.freeiz.com/create_account.php");
    					    
    				        // Add your data
    				        nameValuePairs = new ArrayList<NameValuePair>(2);
    				        nameValuePairs.add(new BasicNameValuePair("long", log.getText().toString().trim()));
    				        nameValuePairs.add(new BasicNameValuePair("lat", lat.getText().toString().trim()));
    				        
    				        httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

    				        // Execute HTTP Post Request
    				        response = httpclient.execute(httppost);
    				       //Toast.makeText(CtAcc.this, response.toString(), Toast.LENGTH_SHORT).show();
    				        inputStream = response.getEntity().getContent();

    				        data = new byte[1024];

    				        buffer = new StringBuffer();
    		                int len = 0;
    		                while (-1 != (len = inputStream.read(data)) )
    		                {
    		                    buffer.append(new String(data, 0, len));
    		                }

    		                inputStream.close();
    				    }

    				    catch (Exception e)
    				    {
    				    	Toast.makeText(MenuList.this, "error"+e.toString(), Toast.LENGTH_LONG).show();
    				    }
        				if(buffer.charAt(0)=='N')
    				    {
    				    	wait1();
    				    	Toast.makeText(MenuList.this, "Server busy", Toast.LENGTH_SHORT).show();
    				    }
    				    else
    				    {
    				    	wait1();
    				    	Toast.makeText(MenuList.this, "Account creation successful", Toast.LENGTH_LONG).show();
    				    	httpclient.getConnectionManager().shutdown();
    				    
    				    }
				
				// TODO Auto-generated method stub
				String s1="http://maps.google.com/?q=";
				s1=s1+log.getText().toString()+","+lat.getText().toString();
				Bundle b=new Bundle();
				b.putString("site",s1);
				Log.e("INFO", s1);
				Uri uri = Uri.parse(s1);

				Intent intent = new Intent(Intent.ACTION_VIEW, uri);

				startActivity(intent);
				//startActivity(new Intent("sahaayata.bvb.edu.Web"));
			}
		});		
	}
	public void wait1()
    {
       	progDailog.dismiss();
       	return;
    }
}
