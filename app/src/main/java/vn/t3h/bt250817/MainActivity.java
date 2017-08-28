package vn.t3h.bt250817;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rdb1,rdb2,rdb3,rdb4;
    Button btm;
    RadioGroup rdr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addControl() {
        rdb1 = (RadioButton) findViewById(R.id.radioButton);
        rdb2 = (RadioButton) findViewById(R.id.radioButton2);
        rdb3 = (RadioButton) findViewById(R.id.radioButton3);
        rdb4 = (RadioButton) findViewById(R.id.radioButton4);
        btm = (Button) findViewById(R.id.button);

    }
    private void addEvent() {
        btm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String tmp = "";
                int id = rdr.getCheckedRadioButtonId();
                switch (id){
                    case R.id.radioButton:
                        tmp = rdb1.getText().toString();
                        break;
                    case R.id.radioButton2:
                        tmp = rdb1.getText().toString();
                        break;
                    case R.id.radioButton3:
                        tmp = rdb1.getText().toString();
                        break;
                    case R.id.radioButton4:
                        tmp = rdb1.getText().toString();
                        break;
                }
                Toast.makeText(MainActivity.this,tmp,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
