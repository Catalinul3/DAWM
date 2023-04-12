package com.example.zoo.models

enum class Type(val key:Int){

    EUROPE(0),
    ASIA(1),
    AMERICA(2),
    AFRICA(3),
    AUSTRALIA(4)
}
open class Zoo(val type: Type)



