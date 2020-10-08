package com.example.provamoveisex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtImparPar, txtDobro, txtRaiz;
    EditText editTextNumero;
    Button btnApresentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtImparPar = (TextView) findViewById(R.id.txtImparPar);
        txtDobro = (TextView) findViewById((R.id.txtDobro));
        txtRaiz = (TextView) findViewById((R.id.txtRaiz));
        editTextNumero = (EditText) findViewById((R.id.editTextNumero));
        btnApresentar = (Button) findViewById((R.id.btnApresentar));

        btnApresentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero;

                numero = Double.parseDouble(editTextNumero.getText().toString());

                if(numero%2 == 0){
                    txtImparPar.setText("Resultado: Numero é Par: "+ numero);
                }
                else
                {
                    txtImparPar.setText("Resultado: Numero é Impar: "+ numero);
                }

                double S = numero + numero;
                txtDobro.setText("Dobro do Numero é: "+S);

                double RaizQ = Math.sqrt(numero);
                txtRaiz.setText("A Raiz quadrada é: "+ RaizQ);
            }
        });
}
}


