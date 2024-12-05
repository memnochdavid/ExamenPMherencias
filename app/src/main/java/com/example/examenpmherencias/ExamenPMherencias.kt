package com.example.examenpmherencias

//var catalogo= mutableListOf<Videojuego>()//lista que tendría los juegos

//Ejercicio 01
class Videojuego(
    var nombre: String ="",
    var plataforma:String="",
    var ano:Int=0
)

//Ejercicio 02

fun filtraJuegos(catalogo:List<Videojuego>, ano_input:Int): MutableList<Videojuego> {
    var devuelve=mutableListOf<Videojuego>()
    for(juego in catalogo){
        if(juego.ano==ano_input){
            devuelve+=juego
        }
    }
    return devuelve
}

//Ejercicio 03
fun mapaJuegos(juegos:List<Videojuego>):Map<String,Int> {
    var mapa=mutableMapOf<String, Int>()
    for(juego in juegos){
        if (mapa.containsKey(juego.plataforma)) {

        }
    }
}





//Ejercicio 04
fun plataformas(juegos:List<Videojuego>):MutableList<String>{
    var plataformas=mutableListOf<String>(juegos[0].plataforma)
    for(juego in juegos){
        if(juego.plataforma !in plataformas)
            plataformas+=juego.plataforma
    }
    return plataformas
}


//Ejercicio 05
class Circunferencia(
    var radio:Float
    constructor(var centro)
){
}


fun main(){

}