package co.domi.semana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //Atributos
    private Button ConfigButton;
    private EditText nameTest;
    private Button ContinuarButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Setups?
        ConfigButton = findViewById(R.id.ConfigButton);
        nameTest = findViewById(R.id.nameTest);
        ContinuarButtom = findViewById(R.id.ContinuarButtom);



    }




}