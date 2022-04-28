package com.example.pookotlin

class Cuenta (numCuenta: Int, saldo: Double){

    //  Asignación de valores con el constructor

    var numCuenta:Int=numCuenta
    var saldo:Double= saldo

    fun depositar(){
        println("Ingrese elvalor que desea depositar")
    }
    fun consultarSaldo(){
        println("Su saldo es de: ${saldo}")
    }

    fun retirar(){
        println("Ingrese el valor que desea ")
    }

}