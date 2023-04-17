package com.example.calculatorj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
Button ba,bs,bm,bd;
Button bc,be;
TextView dres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.zero);
        b0.setOnClickListener( this);
        b1=(Button) findViewById(R.id.one);
        b1.setOnClickListener(this);

        b2=(Button)findViewById(R.id.two);
        b2.setOnClickListener(this);

        b3=(Button) findViewById(R.id.three);
        b3.setOnClickListener(this);

        b4=(Button)findViewById(R.id.four);
        b4.setOnClickListener(this);

        b5=(Button) findViewById(R.id.five);
        b5.setOnClickListener( this);

        b6=(Button)findViewById(R.id.six);
        b6.setOnClickListener(this);

        b7=(Button) findViewById(R.id.seven);
        b7.setOnClickListener(this);

        b8=(Button)findViewById(R.id.eight);
        b8.setOnClickListener(this);

        b9=(Button) findViewById(R.id.nine);
        b9.setOnClickListener(this);


        ba=(Button)findViewById(R.id.add);
        ba.setOnClickListener((View.OnClickListener) this);

        bs=(Button) findViewById(R.id.sub);
        bs.setOnClickListener((View.OnClickListener) this);
        bm=(Button)findViewById(R.id.mul);
        bm.setOnClickListener((View.OnClickListener) this);
        bd=(Button) findViewById(R.id.div);
        bd.setOnClickListener((View.OnClickListener) this);
        be=(Button)findViewById(R.id.equalsto);
        be.setOnClickListener((View.OnClickListener) this);

        bc=(Button) findViewById(R.id.clear);
        bc.setOnClickListener((View.OnClickListener) this);

        dres=(TextView) findViewById(R.id.display);
        dres.setText("");
    }
    @Override
    public void onClick(View v)
    {
        if(v.equals(b0))
            dres.append("0");
        if(v.equals(b1))
            dres.append("1");
        if(v.equals(b2))
            dres.append("2");
        if(v.equals(b3))
            dres.append("3");
        if(v.equals(b4))
            dres.append("4");
        if(v.equals(b5))
            dres.append("5");
        if(v.equals(b6))
            dres.append("6");
        if(v.equals(b7))
            dres.append("7");
        if(v.equals(b8))
            dres.append("8");
        if(v.equals(b9))
            dres.append("9");
        if(v.equals(ba))
            dres.append("+");
        if(v.equals(bs))
            dres.append("-");
        if(v.equals(bm))
            dres.append("*");
        if(v.equals(bd))
            dres.append("/");
        if(v.equals(bc))
            dres.setText("");
        if(v.equals(be))
        {
            try{
                String cdata=dres.getText().toString();
                if(cdata.contains("/"))
                {
                    String opn[]=cdata.split("/");
                    if(opn.length==2)
                    {
                        double op1=Double.parseDouble(opn[0]);
                        double op2=Double.parseDouble(opn[1]);
                        double ar=op1/op2;
                        dres.setText(String.valueOf(ar));
                    }
                }
                if(cdata.contains("*"))
                {
                    String opn[]=cdata.split("\\*");
                    if(opn.length==2)
                    {
                        double op1=Double.parseDouble(opn[0]);
                        double op2=Double.parseDouble(opn[1]);
                        double ar=op1*op2;
                        dres.setText(String.valueOf(ar));
                    }
                }
                if(cdata.contains("-"))
                {
                    String opn[]=cdata.split("-");
                    if(opn.length==2)
                    {
                        double op1=Double.parseDouble(opn[0]);
                        double op2=Double.parseDouble(opn[1]);
                        double ar=op1-op2;
                        dres.setText(String.valueOf(ar));
                    }
                }
                if(cdata.contains("+"))
                {
                    String opn[]=cdata.split("\\+");
                    if(opn.length==2)
                    {
                        double op1=Double.parseDouble(opn[0]);
                        double op2=Double.parseDouble(opn[1]);
                        double ar=op1+op2;
                        dres.setText(String.valueOf(ar));
                    }
                }
            }
            catch(NumberFormatException e)
            {
                Toast.makeText(getApplicationContext(), "InvalId EXpression", Toast.LENGTH_SHORT).show();
            }
        }
    }
}