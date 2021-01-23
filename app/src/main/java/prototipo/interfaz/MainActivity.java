package prototipo.interfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pl.pawelkleczkowski.customgauge.CustomGauge;

public class MainActivity extends AppCompatActivity {

    CustomGauge voltmetro;
    TextView valorVolts;
    EditText entrada;
    Button btn;
    Editable volts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        voltmetro= (CustomGauge) findViewById(R.id.voltmetro);
        valorVolts = (TextView) findViewById(R.id.valor);
        entrada = (EditText) findViewById(R.id.entrada);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                volts= entrada.getText();
                voltmetro.setValue(Integer.parseInt(String.valueOf(volts)));
                valorVolts.setText(new String("Volts:"+volts.toString()));


            }

        });



    }
}