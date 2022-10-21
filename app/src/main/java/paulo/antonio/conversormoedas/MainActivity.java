package paulo.antonio.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button btnConversor = findViewById(R.id.btnConverter);
        ImageButton btnBrasil = findViewById(R.id.btnBrasil);
        ImageButton btnUsa = findViewById(R.id.btnUsa);
        TextView saidaValor = findViewById(R.id.textOutput);
        EditText entradaValor = findViewById(R.id.inputValor);
        TextView descricao = findViewById(R.id.textDesc);

        double[] calculo = {0.0};
        String[] simbolo = {""};




//        btnConversor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                entradaValor.setText("");
//              saidaValor.setText(String.valueOf(simbolo[0] + new DecimalFormat("#,##0.00").format(calculo[0])));
//            }
//        });

        btnBrasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if (!entradaValor.getText().toString().isEmpty()){
                    float valor = Float.parseFloat(entradaValor.getText().toString());

                    descricao.setText("Valor ($)");
                    calculo[0] = (valor / 5.27);
                    saidaValor.setText("R$");
                    simbolo[0] = "R$ ";
                    saidaValor.setTextSize(35.5F);
                    saidaValor.setTextColor(Color.GRAY);
                    saidaValor.setText(String.valueOf(simbolo[0] + new DecimalFormat("#,##0.00").format(calculo[0])));
                    entradaValor.setText("");

                }else{
                    saidaValor.setText("Preencha o campo");
                    saidaValor.setTextSize(15.5F);
                    saidaValor.setTextColor(Color.RED);
                }


            }
        });

        btnUsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (!entradaValor.getText().toString().isEmpty()){
                    float valor = Float.parseFloat(entradaValor.getText().toString());

                    descricao.setText("Valor (R$)");
                    calculo[0] = (valor * 5.27);
                    saidaValor.setText("$");
                    simbolo[0] = "$ ";
                    saidaValor.setTextSize(35.5F);
                    saidaValor.setTextColor(Color.GRAY);
                    saidaValor.setText(String.valueOf(simbolo[0] + new DecimalFormat("#,##0.00").format(calculo[0])));
                    entradaValor.setText("");

                }else{
                    saidaValor.setText("Preencha o campo");
                    saidaValor.setTextSize(15.5F);
                    saidaValor.setTextColor(Color.RED);
                }
            }
        });
    }
}