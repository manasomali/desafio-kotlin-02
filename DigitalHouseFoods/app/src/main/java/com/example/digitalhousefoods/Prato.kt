package com.example.digitalhousefoods

class Prato (val img: Int, var nome:String, val descricao:String) {
    override fun toString(): String {
        return "nome: $nome | descricao: $descricao"
    }
}