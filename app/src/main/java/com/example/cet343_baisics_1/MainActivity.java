package com.example.cet343_baisics_1;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //declare variables
    private EditText edtFulName, edtEmail;
    private Switch switchNews;

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFulName = findViewById(R.id.editName);
        edtEmail = findViewById(R.id.editEmail);
        switchNews = findViewById(R.id.switchNews);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtFulName.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();

                if (name.isEmpty()) {
                    edtFulName.setError("Name is Required");
                }
                if (email.isEmpty()) {
                    edtEmail.setError("Email is Required");
                }
                boolean subscribed = switchNews.isChecked();

                Toast.makeText(getApplicationContext(), name + " " + email + " " + subscribed, LENGTH_LONG).show();
            }
        });

        /*
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         */
    }
}