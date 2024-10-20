/*
 *@author:Gustavo Rodrigues Santos Silva
 * RA: 1110481922011
 */
package br.com.gustavorssbr.calcularsalarioprofessor;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.com.gustavorssbr.calcularsalarioprofessor.model.Professor;
import br.com.gustavorssbr.calcularsalarioprofessor.model.ProfessorHorista;
import br.com.gustavorssbr.calcularsalarioprofessor.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {
    private Professor prof;
    private RadioButton rbProfHor;
    private RadioButton rbProfTit;
    private TextView tvSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbProfHor = findViewById(R.id.rbProfHor);
        rbProfTit = findViewById(R.id.rbProfTit);
        rbProfTit.setChecked(true);
        Button btnCalc = findViewById(R.id.btnCalc);
        tvSaida = findViewById(R.id.tvSaida);

        btnCalc.setOnClickListener(op -> calc());


    }

    private void calc() {

        if (rbProfHor.isChecked()) {
            prof = new ProfessorHorista("Alberto","AB123", 24, 48, 40.23);
        }

        if (rbProfTit.isChecked()) {
            prof = new ProfessorTitular("Colevati", "AB124", 43, 15000.00, 15);
        }

        double salario = prof.calcSalario();

        String texto = getString(R.string.salario) + " R$" + salario;

        tvSaida.setText(texto);
    }

}