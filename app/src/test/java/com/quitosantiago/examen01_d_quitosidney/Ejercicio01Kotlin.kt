package com.quitosantiago.examen01_d_quitosidney
/*El ejercicio consiste en hacer que me salga la frecuenia de las letras que
* hay en la palabra, es decir,que me cuente cuantas veces se repite una letra en una palabra.*/

import org.junit.Test

class Ejercicio01Kotlin {
    companion object {
        const val LETRAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz"
    }
/*Le declaro todo el abecedario, para evitar la redundancia en todas las funciones*/
    @Test
    fun main() {
        val cadena = "hello"
        val conteoLetra = contarLetras_palabra(cadena)
        val vecesLetra = numVecesLetra(cadena)
    /*Le declaro la palabra en la variable cadena, e conteo palabra es para que me cuente cuantas letras tiene la palabra que puse en cadena
    * veces letra me cuenta la frecuencia de las letras en la palabra*/

        println("Cantidad de letras en $cadena: $conteoLetra")
        println("Entrada: $cadena")
        println("Salida: $vecesLetra")
    }
    /*La impresión de lo que le pido, usando los val para que me salgan en la consola*/
    private fun contarLetras_palabra(cadena: String): Int {
        return cadena.count { it in LETRAS }
    }
    /*cuenta las letras que hay en la cadena, usando a la variable LETRAS que hice arriba, con todo el abecedario
    *dándome el total de letras*/
    private fun numVecesLetra(cadena: String): Map<Char, Int> {
        return cadena.filter { it in LETRAS }
            .groupingBy { it }
            .eachCount()
    }
}/*cuenta en este caso el numero de veces que apaece la letra en la palabram, usando también al
a la variable LETRA y agrupándolos con el groupinBy y luego contando con el eachCount*/