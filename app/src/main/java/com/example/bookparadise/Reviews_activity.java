package com.example.bookparadise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Reviews_activity extends AppCompatActivity {
    Spinner spinner;
    String severity,a,name;
    EditText username,problemdesc;
    Button sendmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        spinner = findViewById(R.id.severityspinner);
        username = findViewById(R.id.user_name);
        problemdesc = findViewById(R.id.problem_description);
        sendmail = findViewById(R.id.sendmail);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("не критично");
        arrayList.add("практически не критично");
        arrayList.add("средняя критичность");
        arrayList.add("высокая");
        arrayList.add("очень высокая");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Reviews_activity.this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                severity = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
                severity ="не критично";
            }
        });


        sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString().trim();

                String descrip= problemdesc.getText().toString().trim();

                if(TextUtils.isEmpty(descrip)){
                    problemdesc.setError("Детали обязательны");
                    return;
                }

                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"any"});
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"any"});
                emailIntent.putExtra(Intent.EXTRA_TEXT, descrip);
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Вид жалобы : "+severity+" жалоба от "+user);
                startActivity(Intent.createChooser(emailIntent, "Выберите"));

            }
        });




    }
}