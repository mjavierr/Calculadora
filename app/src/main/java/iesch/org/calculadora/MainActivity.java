package iesch.org.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import iesch.org.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater()); // inflate carga lista de elementos

        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater()); // inflate carga lista de elementos
         //setContentView(binding.getRoot());


        // sin binding porque no me funciona

        EditText editNum1 = findViewById(R.id.numero1_edit);
        EditText editNum2 = findViewById(R.id.numero2_edit);
        EditText answer = findViewById(R.id.respuesta_Edit);
        TextView result = findViewById(R.id.respuesta_TextView);
        Button btnSumar = findViewById(R.id.btn_Sumar);
        Button btnRestar = findViewById(R.id.btn_Restar);
        Button btnMulti = findViewById(R.id.btn_Multiplicar);
        Button btnDivi = findViewById(R.id.btn_Didivir);


        btnSumar.setOnClickListener(v -> {

            if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());

                int resultado = num1 + num2;
                result.setText(Integer.toString(resultado));

            } else {
                Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
            }
        });

        btnRestar.setOnClickListener(v -> {

            if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());

                int resultado = num1 - num2;
                result.setText(Integer.toString(resultado));

            } else {
                Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
            }
        });
        btnMulti.setOnClickListener(v -> {

            if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());

                int resultado = num1 * num2;
                result.setText(Integer.toString(resultado));

            } else {
                Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
            }
        });

        btnDivi.setOnClickListener(v -> {

            if (!editNum1.getText().toString().isEmpty() && !editNum2.getText().toString().isEmpty()) {

                double num1 = Double.parseDouble(editNum1.getText().toString());
                double num2 = Double.parseDouble(editNum2.getText().toString());

                double resultado = num1 / num2;
                result.setText(Double.toString(resultado));

            } else {
                Toast.makeText(MainActivity.this, "No puedes dejar un campo vacio", Toast.LENGTH_SHORT).show();
            }
        });
    }
}