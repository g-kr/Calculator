package com.lco.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,badd,bsub,bdiv,brem,bmul,bclear,bdot,bequal;
    EditText ed;
    double var1,var2;
    boolean add,sub,mul,div,rem;
    int q=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b0=findViewById(R.id.btn0);
        b00=findViewById(R.id.btn00);
        badd=findViewById(R.id.btnadd);
        bsub=findViewById(R.id.btnsub);
        brem=findViewById(R.id.btnrem);
        bdiv=findViewById(R.id.btndiv);
        bmul=findViewById(R.id.btnmul);
        bclear=findViewById(R.id.clear);
        bdot=findViewById(R.id.btndot);
        bequal=findViewById(R.id.btnequals);
        ed=findViewById(R.id.result);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"00");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (q <1) {
                        ed.setText(ed.getText() + ".");
                        q++;
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "invalid", Toast.LENGTH_SHORT).show();
                    }

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(null);
                q=0;
            }
        });
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ed.setText(ed.getText()+"1");
//            }
//        });
        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 try{
                    var1 = Double.parseDouble(ed.getText() + "");
                    rem = true;
                    ed.setText(null);
                     q=0;
                }
                 catch (Exception e){
                     Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_SHORT).show();
                 }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    var1=Double.parseDouble(ed.getText()+"");
                    add=true;
                    ed.setText(null);
                    q=0;
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty field",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    var1 = Double.parseDouble(ed.getText() + "");
                    sub = true;
                    ed.setText(null);
                    q=0;
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty field",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var1 = Double.parseDouble(ed.getText() + "");
                    div = true;
                    ed.setText(null);
                    q=0;
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty field",Toast.LENGTH_SHORT).show();

                }
            }

        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 try{

                    var1 = Double.parseDouble(ed.getText() + "");
                    mul = true;
                    ed.setText(null);
                     q=0;
                }
                 catch (Exception e){
                     Toast.makeText(getApplicationContext(),"empty field",Toast.LENGTH_SHORT).show();
                 }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var2=Double.parseDouble(ed.getText()+"");
                    if (add==true){
                        ed.setText(var1+var2+"");
                    }
                    else if(sub==true){
                        ed.setText(var1-var2+"");

                    }
                    else if(mul==true){
                        ed.setText(var1*var2+"");

                    }
                    else if(div==true){
                        ed.setText(var1/var2+"");

                    }
                    else if(rem==true){
                        ed.setText(var1%var2+"");

                    }
                    q=0;
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_SHORT).show();
                }
            }
        });

















    }
}
