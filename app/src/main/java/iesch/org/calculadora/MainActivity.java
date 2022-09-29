package iesch.org.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater()); // inflate carga lista de elementos

        setContentView(R.layout.activity_main);
    }
}