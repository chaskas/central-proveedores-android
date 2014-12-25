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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
		
	}
	
	@Override
	public void onMapReady(GoogleMap map) {
		
		map.addMarker(new MarkerOptions()
			.position(new LatLng(-36.828346, -73.045447))
			.title("Inmobiliaria Aitue"));
		
		map.addMarker(new MarkerOptions()
			.position(new LatLng(-40.572635, -73.119883))
			.title("Desarmaduria Nacional"));
		
		map.addMarker(new MarkerOptions()
			.position(new LatLng(-33.452554, -70.781600))
			.title("Mundo Repuestos"));
		
		map.addMarker(new MarkerOptions()
			.position(new LatLng(-36.784130, -73.081659))
			.title("Transver"));
		
		map.addMarker(new MarkerOptions()
		.position(new LatLng(-33.460298, -70.629981))
		.title("Full Diesel"));
		
		map.addMarker(new MarkerOptions()
		.position(new LatLng(-36.826946, -73.057308))
		.title("Adriazola Repuestos"));

		map.addMarker(new MarkerOptions()
		.position(new LatLng(-36.716311, -73.114500))
		.title("Securitas"));

		map.addMarker(new MarkerOptions()
		.position(new LatLng(-36.817663, -73.057541))
		.title("P y S Refrigeración"));
		
		map.addMarker(new MarkerOptions()
		.position(new LatLng(-33.482643, -70.677998))
		.title("Bori Clean Service"));
		
	    
	}
}
