package com.egco428.ex1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun plusFunct(int1: Int, int2 : Int):Int{
            return int1+int2
        }
        fun showMessage(int1: Int, int2 : Int){
            Toast.makeText(this,plusFunct(int1,int2).toString(),Toast.LENGTH_LONG).show()
            labelText.text = plusFunct(int1,int2).toString()
        }

        fun minusFunct(int1: Int,int2 : Int):Int{
            return int1-int2
        }
        fun showMessage2(int1: Int, int2 : Int){
            Toast.makeText(this,minusFunct(int1,int2).toString(),Toast.LENGTH_LONG).show()
            labelText.text = minusFunct(int1,int2).toString()
        }

        fun multipleFunct(int1: Int,int2 : Int):Int{
            return int1*int2
        }
        fun showMessage3(int1: Int, int2 : Int){
            Toast.makeText(this,multipleFunct(int1,int2).toString(),Toast.LENGTH_LONG).show()
            labelText.text = multipleFunct(int1,int2).toString()
        }
        fun devideFunct(int1: Float,int2 : Float): Float {
            return int1/int2
        }
        fun showMessage4(int1: Float, int2 : Float){
            Toast.makeText(this,devideFunct(int1,int2).toString(),Toast.LENGTH_LONG).show()
            labelText.text = devideFunct(int1,int2).toString()

        }

        labelText.text = "Hello pong"


        plusBtn.setOnClickListener {
            showMessage(editText.text.toString().toInt(),editText2.text.toString().toInt())
//            Toast.makeText(this,"hello again!!!",Toast.LENGTH_LONG).show()
            Log.d("Test" , "Check Click Event") //display in cosolelog "Logcat"
//            labelText.text = editText.text
        }
        minusBtn.setOnClickListener {
            showMessage2(editText.text.toString().toInt(),editText2.text.toString().toInt())
//            Toast.makeText(this,"hello again!!!",Toast.LENGTH_LONG).show()
            Log.d("Test" , "Check Click Event") //display in cosolelog "Logcat"
//            labelText.text = editText.text
        }
        multipltBtn.setOnClickListener {
            showMessage3(editText.text.toString().toInt(),editText2.text.toString().toInt())
//            Toast.makeText(this,"hello again!!!",Toast.LENGTH_LONG).show()
            Log.d("Test" , "Check Click Event") //display in cosolelog "Logcat"
//            labelText.text = editText.text
        }
        divideBtn.setOnClickListener {
            showMessage4(editText.text.toString().toFloat(),editText2.text.toString().toFloat())
        }


    }
}
