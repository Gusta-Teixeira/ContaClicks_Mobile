package com.example.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button botao;
    TextView wTexto;
    Integer wNum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        botao  = findViewById(R.id.btConta);
        wTexto = findViewById(R.id.txTexto);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wNum++;
                wTexto.setText(Integer.toString(wNum));
            }
        });
    }
}