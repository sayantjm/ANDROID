package es.jmperales.android.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity {
	private Button bAcercaDe;
	private Button bFin;
	private Button bConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
         * Eventos boton AcercaDe
         */
        
        bAcercaDe = (Button) findViewById(R.id.btnAcerca);
        bAcercaDe.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {			
				lanzarAcercaDe(v);
			}
		});
        
        /*
         * Eventos boton Config
         */
        bConfig = (Button) findViewById(R.id.btnConfigurar);
        bConfig.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {			
				lanzarPreferencias(v);
			}
		});
        
        /*
         * Eventos boton fin
         */
        bFin = (Button) findViewById(R.id.btnSalir);
        bFin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				lanzarSalir(v);				
			}
		});
        
    }
    
    public void lanzarAcercaDe(View view) {
    	Intent i = new Intent(this, AcercaDe.class);
    	startActivity(i);
    }
    
    public void lanzarPreferencias(View view) {
    	Intent i = new Intent(this, Preferencias.class);
    	startActivity(i);
    }
    
    public void lanzarSalir(View view) {
    	finish();
    }
    
    
    /******************************
     * MENU
     ******************************/
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.asteroides, menu);
    	super.onCreateOptionsMenu(menu);
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	    	
        return true;
    }    
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId()) {
			case R.id.acercaDe:
				lanzarAcercaDe(null);
				break;
			case R.id.config:
				lanzarPreferencias(null);
				break;
		}
				
		return true;
	}

    
    
}
