package cl.webdevel.centralproveedores;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button mapaBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mapaBtn = (Button) findViewById(R.id.mapaBtn);
		
		mapaBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Toast.makeText(MainActivity.this, "HOLA", Toast.LENGTH_SHORT).show();
				
				Intent mapIntent = new Intent().setClass(MainActivity.this, MapActivity.class);
				startActivity(mapIntent);
				
			}
		});
		
	}
	
	

}
