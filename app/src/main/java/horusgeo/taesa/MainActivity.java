package horusgeo.taesa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide(); //Remove TitleBar
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_menu);
        setContentView(R.layout.activity_cad_realizado); //(Editar -> Cad Realizados)
    }
}
