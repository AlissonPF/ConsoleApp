package br.edu.up.consoleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
Sintaxe básica Kotlin (C, Java, Javascript, C#)
1. Variáveis
2. Funções com parâmetros e retorno
3. Conversão String > Int > String
4. Operadores + - * /
5. String templates + repetidor for "convencional" = for(contador in 1..10){}
6. Condicionais if/else
7. Listas mutáveis e imutáveis
val listaImutavel = listOf("Laranja", "Maçã", "Pêssego")
val listaMutavel = mutableListOf("Laranja", "Maçã", "Pêssego")

//FALTA FALAR DE CLASSES OBJETOS
8. Classes e objetos

//FINALIZAR A CALCULADORA
//LAYOUTS
 */



//View.OnClickListener

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var txt01: EditText
    lateinit var txt02: EditText
    lateinit var btnProcessar: Button
    lateinit var txtConsole: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt01 = findViewById(R.id.txt01)
        txt02 = findViewById(R.id.txt02)
        btnProcessar = findViewById(R.id.btnProcessar)
        btnProcessar.setOnClickListener(this)

        txtConsole = findViewById(R.id.txtConsole)

    }

    fun somar(a: Int, b: Int): Int{
        return a + b
    }
    fun subtrair(a: Int, b: Int): Int {
        return a - b
    }
    fun multiplicar(a: Int, b: Int): Int{
        return a * b
    }
    fun dividir(a: Int, b: Int): Int {
        return a / b
    }

    override fun onClick(p0: View?) {
        //var textoCompleto = txt01.text.toString() + txt02.text.toString()
        //val resultado: Int = somar(a.toInt(), b.toInt())

        val a = txt01.text.toString()
        val b = txt02.text.toString()

//        var texto = ""
//        for(contador in 1..a.toInt()){
//            //texto += contador.toString() + "\n"
//            //texto += "Número: " + contador.toString() + "\n"
//            texto += "Número: $contador \n"
//        }

//        var texto = ""
//        if (a.toInt() < 10){
//            texto = "Valor de A é menor que 10!"
//        } else {
//            texto = "Valor de A é maior que 10!"
//        }

//        val listaDeFrutas = mutableListOf("Laranja", "Maçã", "Pêssego")
//        listaDeFrutas.add("Mixirica")
//        listaDeFrutas.removeAt(2)
//        var texto = ""
//        for(fruta in listaDeFrutas){
//            texto += fruta + "\n"
//        }

        //val lista = criarListaDeTextos(a.toInt(), b)
        //var texto = converterParaTextoConsole(lista)
        // Criar um lista de textos, utilizando uma função, com
        // base no valor do texto 1 e utilizando o texto 2

        val lista = criarListaDePessoas(a.toInt(), b)
        txtConsole.text = converterPessoasParaTextoConsole(lista)
    }

    fun converterPessoasParaTextoConsole(lista: MutableList<Pessoa>): String{
        var texto = ""
        for(pessoa in lista){
            texto += "${pessoa.nome}, Idade: ${pessoa.idade} \n"
        }
        return texto
    }


    fun converterParaTextoConsole(lista: MutableList<String>): String{
        var texto = ""
        for (item in lista){
            texto += item + "\n"
        }
        return texto
    }


    fun criarListaDeTextos(total: Int, texto: String): MutableList<String> {
        var lista = mutableListOf<String>()
        for(contador in 1..total){
            lista.add("$texto $contador")
        }
        return lista
    }
    class Pessoa(val nome: String, val idade: Int)
    fun criarListaDePessoas(total: Int, texto: String): MutableList<Pessoa> {
        var p1 = Pessoa("Carlos", 20)
        var p2 = Pessoa("Ana", 19)

        //Quando já se conhece os objetos
        //e se utiliza os objetos para criar
        //a lista preenchida
        //var lista = mutableListOf(p1, p2)

        //Quando ainda não se tem os objetos
        var lista = mutableListOf<Pessoa>()
        //e vai adicioná-los posteriormente
        //lista.add(p1)
        //lista.add(p2)

        for(contador in 1..total){
            //val pessoa = Pessoa("$texto $contador", contador)
            //lista.add(pessoa)
            lista.add(Pessoa("$texto $contador", contador))
        }
        return lista
    }


//    class Pessoa {
//        lateinit var nome: String
//        fun calcular(){
//        }
//    }




}
