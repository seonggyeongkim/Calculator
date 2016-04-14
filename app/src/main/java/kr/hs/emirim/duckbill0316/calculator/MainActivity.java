package kr.hs.emirim.duckbill0316.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button butPlus, butMinus,butDivide,butMultiply; //클래스가 만들어짐
    EditText editNum1,editNum2;
    TextView textResult;


    //연결 준비 작업
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ()안에 내용의 파일들의 메인 메모리에 클래스가 만들어지도록 도와줌!
        butPlus=(Button)findViewById(R.id.but_plus); // ()안에 있는 id의 값을 찾아서 view를 찾아라!
        // findViewById : 객체 주소 값
        // Button으로 형변환!
        butMinus=(Button)findViewById(R.id.but_minus);
        butDivide=(Button)findViewById(R.id.but_divide);
        butMultiply=(Button)findViewById(R.id.but_multiply);

        editNum1=(EditText)findViewById(R.id.edit_num1);
        editNum2=(EditText)findViewById(R.id.edit_num2);

        textResult=(TextView)findViewById(R.id.text_result);

        butPlus.setOnClickListener(this); //*
        //이벤트 리소스 와 리스러가 연결됨!
        butMinus.setOnClickListener(this);
        butDivide.setOnClickListener(this);
        butMultiply.setOnClickListener(this);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */


    //event handler (처리하는 이벤트 class)
    @Override
    public void onClick(View v){ //이번트가 발생된 아이디의 주소를 받는다!
       // 2개의 EditText에 입력된 값을 반환받는다.

        String num1Str=editNum1.getText().toString();  //getText() : 입력된 내용 반환  //참조 변수 선언
        String num2Str=editNum2.getText().toString();

        int num1=Integer.parseInt(num1Str); //문자열에서 숫자형으로 변환!
        int num2=Integer.parseInt(num2Str);

        double result=0.0;

        switch(v.getId()) {//객체가 가지고 있는 id 값
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_divide:
                result=(double)num1/num2;
                break;
            case R.id.but_multiply:
                result=num1*num2;
                break;

        }

        textResult.setText("* 계산 결과 : "+result); //setText : 값을 넣는다!


    }
}
