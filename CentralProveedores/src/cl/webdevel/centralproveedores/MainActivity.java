package cl.webdevel.centralproveedores;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button mapa1Btn;
	Button mapa2Btn;
	Button mapa3Btn;
	Button mapa4Btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mapa1Btn = (Button) findViewById(R.id.mapa1Btn);
		mapa2Btn = (Button) findViewById(R.id.mapa2Btn);
		mapa3Btn = (Button) findViewById(R.id.mapa3Btn);
		mapa4Btn = (Button) findViewById(R.id.mapa4Btn);
		
		mapa1Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent mapIntent = new Intent().setClass(MainActivity.this, MapActivity.class);
				mapIntent.putExtra("TIPO", 0);
				startActivity(mapIntent);
				
			}
		});
		
		mapa2Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent mapIntent = new Intent().setClass(MainActivity.this, MapActivity.class);
				mapIntent.putExtra("TIPO", 1);
				startActivity(mapIntent);
				
			}
		});
		
		mapa3Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent mapIntent = new Intent().setClass(MainActivity.this, MapActivity.class);
				mapIntent.putExtra("TIPO", 2);
				startActivity(mapIntent);
				
			}
		});
		
		mapa4Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent mapIntent = new Intent().setClass(MainActivity.this, MapActivity.class);
				mapIntent.putExtra("TIPO", 3);
				startActivity(mapIntent);
				
			}
		});
		
	}
	
	

}
