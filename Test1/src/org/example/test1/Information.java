package org.example.test1;

import android.net.Uri;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Information extends Activity
{
	private static final Uri CONTACTS_CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
	private static final int PICK_CONTACT_REQUEST = 0;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.fill_me);
	        
	        final Button contact = (Button) findViewById(R.id.contact);
	        contact.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent con = new Intent(Intent.ACTION_PICK,CONTACTS_CONTENT_URI);
					startActivityForResult(con, PICK_CONTACT_REQUEST);
					
				}
				
				
			});
	        
	        final Button saveMe = (Button) findViewById(R.id.save);
			saveMe.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "Saved to contacts", Toast.LENGTH_LONG).show();
				}
			});
	 }
	        
	        
	
}
