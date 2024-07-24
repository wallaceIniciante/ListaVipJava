package desenvolvimentoAndroid.wallace.listavip.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import desenvolvimentoAndroid.wallace.listavip.R;
import desenvolvimentoAndroid.wallace.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa outraPessoa;

    EditText txtPrimeiroNome;
    EditText sobreNome;
    EditText txtNomeCurso;
    EditText txtTelefone;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;
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
        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        txtPrimeiroNome = findViewById(R.id.txtPrimeiroNome);
        sobreNome = findViewById(R.id.sobreNome);
        txtNomeCurso = findViewById(R.id.txtNomeCurso);
        txtTelefone = findViewById(R.id.txtTelefone);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPrimeiroNome.setText("Primeiro Nome");
                sobreNome.setText("Sobrenome");
                txtNomeCurso.setText("Curso Desejado");
                txtTelefone.setText("Telefone de Contato");
            }
        });
 
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Volte Sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(txtPrimeiroNome.getText().toString());
                pessoa.setSobrenome(sobreNome.getText().toString());
                pessoa.setNomeCursoDesejado(txtNomeCurso.getText().toString());
                pessoa.setTelefoneContato(txtTelefone.getText().toString());

                Toast.makeText(MainActivity.this,"Salvo!"+pessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}