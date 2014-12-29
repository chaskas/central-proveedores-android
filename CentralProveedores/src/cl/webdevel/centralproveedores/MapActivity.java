package cl.webdevel.centralproveedores;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
	
	Integer tipo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		tipo = getIntent().getExtras().getInt("TIPO");
		
		MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
		
	}
	
	@Override
	public void onMapReady(GoogleMap map) {
		
		switch(tipo) {
		
			case 0:
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.817828, -73.048915))
				.title("MSA"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.823730, -73.042176))
				.title("Kupfer"));
				
				break;
				
			case 1:
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.811196, -73.035832))
				.title("Empresa Constructora Bellolio"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.827631, -73.049624))
				.title("Constructora Torrepiedra"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.827889, -73.047345))
				.title("Constructora el Parque"));

				break;
				
			case 2:

				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.824707, -73.046181))
				.title("Provin"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.825227, -73.042701))
				.title("Aprivim"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.820213, -73.059738))
				.title("MG Proveedores"));
				
				break;
				
			case 3:
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.827345, -73.052060))
				.title("BSK Proveedores de insumos"));
				
				map.addMarker(new MarkerOptions()
				.position(new LatLng(-36.826464, -73.048261))
				.title("Indepot"));

				break;
				
		}
		
		

		
	    
	}
}
