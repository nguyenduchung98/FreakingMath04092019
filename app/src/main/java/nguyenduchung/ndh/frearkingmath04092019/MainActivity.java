package nguyenduchung.ndh.frearkingmath04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView mtxtA,mtxtB,mtxtKq,mtxttoantu;
    ImageButton mibtnTrue,mibtnFalse;
    Boolean check=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        random();

    }

    private void initView() {
        mtxtA=findViewById(R.id.textviewA);
        mtxtB=findViewById(R.id.textviewB);
        mtxttoantu=findViewById(R.id.textviewToantu);
        mtxtKq=findViewById(R.id.textviewKetqua);
        mibtnFalse=findViewById(R.id.imagebuttonFalse);
        mibtnTrue=findViewById(R.id.imagebuttonTrue);
    }
    private void random(){
        Random random=new Random();
        int number1=random.nextInt(10)+1;
        int number2=random.nextInt(10)+1;
        int toantu=random.nextInt(4)+1;

        check=random.nextBoolean();
        int kq=0;
        switch (toantu){
            case 1: kq=number1 + number2;
            mtxttoantu.setText("+");
            break;
            case 2: kq=number1 - number2;
                mtxttoantu.setText("-");
                break;
            case 3: kq=number1 * number2;
                mtxttoantu.setText("*");
                break;
            case 4: kq=number1 / number2;
                mtxttoantu.setText("/");
                break;
        }
        if(check==false){
            kq +=5;
        }
        mtxtA.setText(number1 + "");
        mtxtA.setText(number2 + "");
        mtxtKq.setText(kq);


    }

}
