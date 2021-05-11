package com.example.exerccio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btn_Calcular;
    EditText txt_Data,txt_Ano;
    TextView txt_Resultado1,txt_Resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Calcular.findViewById(R.id.btn_calcular);
        txt_Data.findViewById(R.id.txt_data);
        txt_Ano.findViewById(R.id.txt_ano);
        txt_Resultado1.findViewById(R.id.txt_resultado1);
        txt_Resultado2.findViewById(R.id.txt_resultado2);

        btn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int dataNascimento,anoActual,n,t;
                 dataNascimento=Integer.parseInt(txt_Data.getText().toString());
                 anoActual=Integer.parseInt(txt_Ano.getText().toString());
                 n=anoActual-dataNascimento;
                 t=2050-dataNascimento;

                 txt_Resultado1.setText(String.valueOf(n));
                 txt_Resultado2.setText(String.valueOf(t));

                 

            }
        });
    }
}