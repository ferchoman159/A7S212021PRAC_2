package mx.edu.tesoem.isc.fvm.a7s212021prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);
    }
    public void Sumar(View v){
        Intent intent = new Intent(this, SumarActivity.class);
        startActivity(intent);
    }

    public void Restar(View v){
        Intent intent = new Intent(this, RestrarActivity.class);
        startActivity(intent);
    }

    public void Multiplicar(View v){
        Intent intent = new Intent(this, MultiplicarActivity.class);
        startActivity(intent);
    }

    public void Dividir(View v){
        Intent intent = new Intent(this, DividirActivity.class);
        startActivity(intent);
    }




}