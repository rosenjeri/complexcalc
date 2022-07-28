package com.example.complexcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ButtonAdd : Button
    lateinit var ButtonSubtract : Button
    lateinit var ButtonMultiply : Button
    lateinit var ButtonDivide : Button
    lateinit var ButtonClear : Button
    lateinit var Button1 : Button
    lateinit var Button2 :Button
    lateinit var Button3 : Button
    lateinit var Button4 : Button
    lateinit var Button5 : Button
    lateinit var Button6 : Button
    lateinit var Button7 : Button
    lateinit var Button8 : Button
    lateinit var Button9 : Button
    lateinit var Button0 : Button
    lateinit var ButtonEquals:Button
    lateinit var Txt_result: TextView
    lateinit var Txt_control:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonAdd=findViewById(R.id.btnadd)
        ButtonSubtract=findViewById(R.id.btnsubtract)
        ButtonMultiply=findViewById(R.id.btnmultiply)
        ButtonDivide=findViewById(R.id.btndivide)
        ButtonEquals=findViewById(R.id.btnequals)
        ButtonClear=findViewById(R.id.btnclear)
        Button0=findViewById(R.id.btn0)
        Button1=findViewById(R.id.btn1)
        Button2=findViewById(R.id.btn2)
        Button3=findViewById(R.id.btn3)
        Button4=findViewById(R.id.btn4)
        Button5=findViewById(R.id.btn5)
        Button6=findViewById(R.id.btn6)
        Button7=findViewById(R.id.btn7)
        Button8=findViewById(R.id.btn8)
        Button9=findViewById(R.id.btn9)
        Txt_control=findViewById(R.id.btn_control)
        Txt_result=findViewById(R.id.btn_result)
    }
}