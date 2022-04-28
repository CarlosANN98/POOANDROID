package com.example.pookotlin

open class persona (nombre:String?, apellido:String?, edad:Int?){
    var nombre: String?=nombre
    var apellido:String?=apellido
    var edad:Int?=edad


    fun caminar(){
        println("La persona ${nombre}, ${apellido} de ${edad} años,  se encuentra caminando")
    }

}