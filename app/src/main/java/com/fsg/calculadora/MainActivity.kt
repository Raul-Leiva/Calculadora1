package com.fsg.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var valor1: EditText
    lateinit var valor2: EditText
    lateinit var tvTitulo: TextView
    var valor01: String = "0"
    var valor02: String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor1 = findViewById(R.id.valor1)
        valor2 = findViewById(R.id.valor2)
        tvTitulo = findViewById(R.id.tvTitulo)


    }

    fun sumar(view: View) {
        valor01 = valor1.text.toString()
        valor02 = valor2.text.toString()

        val resultado = valor01.toDouble() + valor02.toDouble()
            tvTitulo.text = resultado.toString()

        }
    fun restar(view: View) {
        valor01 = valor1.text.toString()
        valor02 = valor2.text.toString()

        val resultado = valor01.toDouble() - valor02.toDouble()
        tvTitulo.text = resultado.toString()
    }
    fun multiplicar(view: View) {
        valor01 = valor1.text.toString()
        valor02 = valor2.text.toString()

        val resultado = valor01.toDouble() * valor02.toDouble()
        tvTitulo.text = resultado.toString()
    }
    fun dividir(view: View) {
        valor01 = valor1.text.toString()
        valor02 = valor2.text.toString()

        val denominador = valor02.toDouble()
        var resultado:String =""

        if (denominador == 0.0){
            resultado = "El denominador no puede ser 0"
        }
        else {
            resultado =(valor01.toDouble() / denominador).toString()
        }


        tvTitulo.text = resultado.toString()
    }
}
