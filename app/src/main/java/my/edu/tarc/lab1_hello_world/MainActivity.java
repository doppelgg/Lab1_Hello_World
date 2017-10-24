package my.edu.tarc.lab1_hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Global variables/ Module variables
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    //onCreate = main function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display Main UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Link UI to Program Variable
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }


    public void displayMessage(View view)
    {
        String name;
        int age;
        //getuser Input from edit text
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age ++;
        textViewMessage.setText("Hi " + name + ", you will be " + age  + " year old in 2018");

    }

    public void resetInput(View view)
    {
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("Hello World");
    }
}
