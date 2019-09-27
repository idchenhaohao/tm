package com.example.tom;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LohinActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lohin);
		Button bt1 = (Button) findViewById(R.id.button1);
		Button bt2 = (Button) findViewById(R.id.button2);
		
		final String user = "123";
		final String poss = "123";
		bt1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				EditText et1 = (EditText) findViewById(R.id.editText1);
				EditText et2 = (EditText) findViewById(R.id.editText2);
				final String username = et1.getText().toString();
				final String userposs = et2.getText().toString();
				if(user.equals(username)&&poss.equals(userposs)){
					Intent it= new Intent(LohinActivity.this,ZhuActivity.class);
					startActivity(it);
				}else{
					Toast.makeText(LohinActivity.this, "用户不存在", Toast.LENGTH_LONG).show();
				}
			}
		});
		bt2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				System.exit(0);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lohin, menu);
		return true;
	}

}
