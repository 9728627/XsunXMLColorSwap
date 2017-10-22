package html.eduhollcs184assignmentsassignment1.ucsb.cs.httpwww.xsunxmlcolorswap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //method1
        final Button button1 = (Button)findViewById(R.id.button);
        final TextView text1 = (TextView)findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int R = (int)(Math.random()*256);
                int G = (int)(Math.random()*256);
                int B = (int)(Math.random()*256);


                text1.setText("COLOR: " + R +"r "+ G +"g "+ B + "b");
                text1.setTextColor(Color.rgb(R,G,B));
            }
        });

    }
    //method 2 (works as well)

    /*public void changeColor(View view){

        final TextView text1 = (TextView)findViewById(R.id.textView);

        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);


        text1.setText("COLOR: " + R +"r "+ G +"g "+ B + "b");
        text1.setTextColor(Color.rgb(R,G,B));


    }*/




}
