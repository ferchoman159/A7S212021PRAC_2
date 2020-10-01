package mx.edu.tesoem.isc.fvm.a7s212021prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicarActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);
        resultado = findViewById(R.id.lblresult);
    }
    public void pcalcular(View view) {
        int vnum1 = Integer.parseInt(num1.getText().toString());
        int vnum2 = Integer.parseInt(num2.getText().toString());
        resultado.setText("La multiplicacion es: " + (vnum1 * vnum2));
    }

}
