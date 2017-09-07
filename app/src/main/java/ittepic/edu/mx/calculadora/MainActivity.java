package ittepic.edu.mx.calculadora;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_value;
    int acum;
    String op;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_plus,btn_min,btn_mul,btn_div,btn_sign,btn_eq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acum=0;
        op="";
        //txt_value.setText("0");
        btn_0=(Button) findViewById(R.id.btn_0);
        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);
        btn_4=(Button) findViewById(R.id.btn_4);
        btn_5=(Button) findViewById(R.id.btn_5);
        btn_6=(Button) findViewById(R.id.btn_6);
        btn_7=(Button) findViewById(R.id.btn_7);
        btn_8=(Button) findViewById(R.id.btn_8);
        btn_9=(Button) findViewById(R.id.btn_9);
        btn_plus=(Button) findViewById(R.id.btn_plus);
        btn_min=(Button) findViewById(R.id.btn_minus);
        btn_mul=(Button) findViewById(R.id.btn_mul);
        btn_div=(Button) findViewById(R.id.btn_div);
        btn_sign=(Button) findViewById(R.id.btn_sign);
        btn_eq=(Button) findViewById(R.id.btn_eq);
        txt_value=(TextView) findViewById(R.id.txt_value);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt_value.getText().equals("0"))
                    txt_value.append("0");
                if(op.equals("eq")){
                    txt_value.setText("0");
                }
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("1");
                }
                else
                txt_value.append("1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("2");
                }
                else
                txt_value.append("2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("3");
                }
                else
                    txt_value.append("3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("4");
                }
                else
                    txt_value.append("4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("5");
                }
                else
                    txt_value.append("5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("6");
                } else
                    txt_value.append("6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("7");
                } else
                    txt_value.append("7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("8");
                }else
                    txt_value.append("8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.equals("eq")){
                    txt_value.setText("9");
                }else
                    txt_value.append("9");
            }
        });
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_value.setText(""+((-1)*Integer.parseInt(txt_value.getText().toString())));
                op="sign";
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acum+=Double.parseDouble(txt_value.getText().toString());
                txt_value.setText("");
                op="suma";
            }
        });
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acum!=0)acum-=Double.parseDouble(txt_value.getText().toString());
                else acum=Integer.parseInt(txt_value.getText().toString());
                txt_value.setText("");
                op="resta";
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acum!=0)
                acum*=Double.parseDouble(txt_value.getText().toString());
                else
                    acum=Integer.parseInt(txt_value.getText().toString());
                txt_value.setText("");
                op="mul";
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acum!=0)
                    acum/=Double.parseDouble(txt_value.getText().toString());
                else
                    acum=Integer.parseInt(txt_value.getText().toString());
                txt_value.setText("");
                op="div";
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(op.equals("suma")){
                    acum+=Integer.parseInt(txt_value.getText().toString());
                    op="";
                }
                if(op.equals("resta")){
                    //acum-=Integer.parseInt(txt_value.getText().toString());
                    acum= acum-Integer.parseInt(txt_value.getText().toString());
                    op="";
                }
                if(op.equals("mul")){
                    acum*=Integer.parseInt(txt_value.getText().toString());
                    op="";
                }
                if(op.equals("div")){
                    acum/=Double.parseDouble(txt_value.getText().toString());
                    op="";
                }
                if(op.equals("sign")){
                    op="";
                    acum = Integer.parseInt(txt_value.getText().toString());
                }
                txt_value.setText(""+acum);
                acum=0;
                op="eq";
            }
        });
    }
}
