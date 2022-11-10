package com.example.urtulesi_vaqcina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var chek1: CheckBox
    private lateinit var chek2: CheckBox
    private lateinit var saxeli: EditText
    private lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chek1=findViewById(R.id.chek1)
        chek2=findViewById(R.id.chek2)
        saxeli=findViewById(R.id.saxeli)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            if ((chek1.isChecked && saxeli.text.toString()=="")
                || (!chek1.isChecked && !chek2.isChecked&& saxeli.text.toString().isNotEmpty())
                ||(!chek1.isChecked && !chek2.isChecked&& saxeli.text.toString()=="")){

                Toast.makeText(this, "გთხოვთ, უპასუხოთ ორივე შეკითხვას", Toast.LENGTH_SHORT).show()
            }else if ((chek2.isChecked && saxeli.text.toString().isNotEmpty() && !chek1.isChecked)
                ||(chek2.isChecked && saxeli.text.toString()=="" && !chek1.isChecked)){
                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
            } else if (chek1.isChecked && chek2.isChecked&&saxeli.text.toString().isNotEmpty()){
                Toast.makeText(this, "გთხოვთ,აირჩიოთ კი ან არა", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "თქვენი პასუხი მიღებულია, პკ", Toast.LENGTH_SHORT).show()
            }

        }

    }
}