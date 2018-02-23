package id.dev.septiyadi.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showIn, eraseIn;
    RadioButton rbLaki, rbPerempuan;

    String jkLaki = "Laki-laki", jkPerempuan = "Perempuan";

    TextView showOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showIn = (Button)findViewById(R.id.btPopUP);
        eraseIn = (Button)findViewById(R.id.delInput);

        rbLaki = (RadioButton)findViewById(R.id.laki);
        rbPerempuan = (RadioButton)findViewById(R.id.perempuan);

        showOutput = (TextView)findViewById(R.id.inView);

        showIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbLaki.isChecked()){
                    showOutput.setText("Pilihan Jenis Kelamin: " + jkLaki);
                    System.out.println("Telusur data: " + jkLaki);
                }else if (rbPerempuan.isChecked()){
                    showOutput.setText("Pilihan Jenis Kelamin: " + jkPerempuan);
                    System.out.println("Telusur data: " + jkPerempuan);
                }
            }
        });
    }
}
