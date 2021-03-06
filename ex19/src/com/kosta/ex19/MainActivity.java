package com.kosta.ex19;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		RadioGroup rg = (RadioGroup)findViewById(R.id.rg);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override //group : rg checkId = rb
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton rb = null;
				
				switch(checkedId){
					case R.id.rb1:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb2:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb3:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb4:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb5:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb6:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
					case R.id.rb7:
						rb = (RadioButton)findViewById(checkedId);
						Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
						break;
				}
			}
		});
	}

		
}
