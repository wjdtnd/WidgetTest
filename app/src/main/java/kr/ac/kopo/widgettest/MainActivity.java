package kr.ac.kopo.widgettest;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.enable_clickable_test);

//        rg=findViewById(R.id.rg);
//
//       Button btnDone = findViewById(R.id.btn_done);
//
//        btnDone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result="";
//
//                if(rg.getCheckedRadioButtonId() == R.id.rb_male)
//                    result = "남성";
//                else
//                    result="여성";
//
//                Toast toast = Toast.makeText(getApplicationContext(), result+"을 선택하였습니다.", Toast.LENGTH_LONG);
//                toast.show();
//            }
//        });

    }
}