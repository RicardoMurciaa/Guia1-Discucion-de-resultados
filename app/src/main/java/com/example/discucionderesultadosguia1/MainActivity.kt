package com.example.discucionderesultadosguia1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

lateinit var numero1: EditText
lateinit var numero2: EditText
lateinit var enviar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.TxtNumero1)
        numero2 = findViewById(R.id.TxtNumero2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)

        enviar.setOnClickListener{
            val valor1: Float = numero1.text.toString().toFloat()
            val valor2: Float = numero2.text.toString().toFloat()
            val suma: Float = valor1 + valor2

            val resultadoTexto = if (suma == suma.toInt().toFloat()){
                suma.toInt().toString()
            } else{
                suma.toString()
            }
            resultado.text = resultadoTexto
        }
    }
}