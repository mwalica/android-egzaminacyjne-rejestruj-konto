package ch.walica.egzaminacyjne_rejestruj_konto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPass, etPass2;
    private Button btnConfirm;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etPass2 = findViewById(R.id.etPass2);
        btnConfirm = findViewById(R.id.btnConfirm);
        tvResult = findViewById(R.id.tvResult);

        btnConfirm.setOnClickListener(view -> {
            String email = etEmail.getText().toString().trim();
            String pass = etPass.getText().toString().trim();
            String pass2 = etPass2.getText().toString().trim();

            if (!email.contains("@")) {
                tvResult.setText("Nieprawiodłowy adres email");
            } else if (!pass.equals(pass2)) {
                tvResult.setText("Hasła się różnią");
            } else {
                tvResult.setText("Witaj " + email);
            }


        });

    }
}