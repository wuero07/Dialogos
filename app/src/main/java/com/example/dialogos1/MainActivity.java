package com.example.dialogos1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity implements MyDialog.MyDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowDialog = findViewById(R.id.btnShowDialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog();
                myDialog.show(getSupportFragmentManager(), "myDialog");
            }
        });

        Button btnShowSimpleDialog = findViewById(R.id.btnShowSimpleDialog);
        btnShowSimpleDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDialog simpleDialog = new SimpleDialog();
                simpleDialog.show(getSupportFragmentManager(), "simpleDialog");
            }
        });
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        Toast.makeText(this, "Cliente agregado con éxito", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        Toast.makeText(this, "Operación cancelada", Toast.LENGTH_SHORT).show();
    }
}
