package com.ersinberkealemdaroglu.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello Kotlin")
        //camelCase
        //snake_case
        //Variables - Değişkenler - var daha sonradan değiştirilebilir.
        var x = 4
        var y = 5
        println(x * y)

        var age = 35
        val result = age / 5 * 10
        println(result)
        age = 36
        println(age)

        //Constants - Sabit - Val daha sonradan değiştirilemez!
        val name = "Ersin"
        val surName = "Alemdaroğlu"
        println(name +" "+ surName)
        val oneAge = 4
        println(oneAge * 5)

        //Defining - Tanımlamak
        val myIntegers : Int
        //İnitialize - Başlatmak - ilk değerini atamak
        myIntegers = 10

        //Defining + İnitialize
        val a : Int = 5

        val double = 2.5
        val bolen = 7
        println(double/bolen)
        //Float alabileceği max size 6-7
        val float = 2.5f
        val doubles = 7
        println(float/doubles)

        var myBoolean : Boolean = true
        myBoolean = false
        println(myBoolean)
        // == eşitse
        //!= eşit değilse - buna eşit değilse
        //&& ve - şu ve şu aynı anda çalışıyorsa gibi
        // || veya - bu yada bu çalışsın mantığı
        val isAlive = true
        if (isAlive){
            println("Karakter Yaşıyor")
        }else{
            println("Karakter Öldü")
        }

        var convers = 5
        var myLongNumber = convers.toLong()
        println(myLongNumber)

        val mystr = "10"
        val myIntStr = mystr.toInt()
        println(myIntStr * 10)

        // Array
        val myArray = arrayOf("James", "Kirt", "Lars")
        myArray[0] // İndex
        myArray[0] = "James Hetfield" // Referans Tipler aga
        println(myArray[0])
        myArray.set(1,"Kirt Lord")
        for (myArrays in myArray){
            println(myArrays)
        }
        //Dizilerde ilk defining de array eleman sayısını verdiğimiz için yeni eleman eklenmez. Eleman eklemek için array üzerinde değişiklik yapılması lazım.
        //Bunun yerine List kullanılır.
        //myArray[4] = "Ersin Berke"
        //println(myArray[4])

        val myNumberArray = arrayOf(1,2,3,4,5,6)
        println(myNumberArray[3])

        // Eğer arraylerin sınırlarını aşarsak app çöker
        //örnek
        //println(myArray[8])
        //böyle bir index olmadığı için uygulama çöker

        val myNewArray = doubleArrayOf(1.2,1.4,1.5)
        println(myNewArray[1])
        val myMixArray = arrayOf("String",5)
        println(myMixArray[0])
        println(myMixArray[1])

        //Array List  - Koleksiyonlar

        val myMusicianList = arrayListOf<String>("James","Lars")
        myMusicianList.add(2,"Ersin")
        myMusicianList.add(0,"Rob")//0.İndex silinmedi sadece bir sağa kaydırıldı yani 2.index artık ersin yerine lars olacak
        println(myMusicianList[2])

        //Sadece int arraylistof
        val myListInt = arrayListOf<Int>()
        myListInt.add(0)
        myListInt.add(10)
        println(myListInt[1])

        // any den oluşan bir arraylistof yani her hangi bir eleman alabilir. int string boolean double float
        val myAnyList = arrayListOf<Any>()
        myAnyList.add(true)
        myAnyList.add(185)
        myAnyList.add("Lars")
        myAnyList.add(147.5)
        myAnyList.add(147.5f)
        println(myAnyList[2])

        //arrayof da aynı elemandan birden fazla olabilir
        val myExpArray = arrayOf(1,1,2,3,4)
        println("First Element : ${+ myExpArray[0]} Second Element : ${myExpArray[1]}" )
        //Set - Koleksiyon - Birden fazla veri tipini barındırabileceğimiz bir yöntem.
        //Set de aynı objeden sadece 1 tane olabilir. Yani setof içinde aynı sayıdan 2 tane varsa sadece 1 tanesi gösterilir. Aynısı double string yada float içinde geçerli. Sistemde kaç tane farklı telefon numarası var bulabilirsin.

        val mySet = setOf<Int>(1,2,3,1)
        println(mySet.size)

        // For Each -- Her biri için
        //it - tek tek atanan tüm değerleri it olarak görüyor.
        mySet.forEach { println(it * 3) }

        val myHastSet = hashSetOf<String>()
        myHastSet.add("Ersin")
        myHastSet.add("Ersin")
        println(myHastSet.size)

        // Hash Map - Map

        //Dizileri yada verileri birbirleri ile eşleştirme imkanı veriyor.
        // Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100,150)
        println(fruitArray[0] +" "+ caloriesArray[0])

        val myHashMap = hashMapOf<String,Int>()
        myHashMap.put("Apple",100)
        myHashMap.put("Banana",150)
        println(myHashMap["Apple"])

        val newMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
        println(newMap["C"])

        //Remainder - Kalan - Örnek 10 u 2 ye bölünce kaç kalır - 10  2 ye kalansız bölündüğü için sonuç 0

        println(10%2)

        //Switch - When
        val day  = 4
        var dayString = ""
        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Thu"
            3 -> dayString = "Wends"
            else -> dayString = "Tatil"
        }
        println(dayString)

        //Loops

        // For Loops

        val myForArray = arrayOf("Ersin","Berke",8)
        for (myArray in myForArray){
            println(myArray)
        }

        val myArrayNumber = arrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0)
        val res = myArrayNumber[0] / 3 * 5
        println(res)

        for (number in myArrayNumber){
            val z = number / 3 * 5
            println(z)
        }
        //indices - tek tek indexleri veriyor
        //until - a kadar demek
        for (i in myArrayNumber.indices){
            val s = myArrayNumber[i] / 3 * 5
            println(s)
        }
        //0..9 0 dan 9 a kadar demek
        for (i in 0..9){
            println(i)
        }

        val myStringArray = arrayListOf<String>()
        myStringArray.add("Kimal")
        myStringArray.add("Sinan")
        myStringArray.add("Osman")
        for (myFor in myStringArray){
            println(myFor)
        }

        myStringArray.forEach { println(it) }

        //While Döngüsü - koşul tutuyorsa devamlı çalışıyor - sonuç alana kadar

        var js = 0
        while (js < 10){
            println(js)
            js++
        }




    }
}