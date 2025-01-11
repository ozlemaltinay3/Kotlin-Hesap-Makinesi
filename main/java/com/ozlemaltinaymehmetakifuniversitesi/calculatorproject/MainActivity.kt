package com.ozlemaltinaymehmetakifuniversitesi.calculatorproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Bu fonksiyon aktivite ilk oluşturulduğunda çağrılır.
        // "super.onCreate(savedInstanceState)" üst sınıfın onCreate metodunu çağırır.
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Bu satır aktivitenin layout'unu ayarlar. "activity_main.xml"  bu aktivite ile ilişkili layout dosyasıdır.
        setContentView(R.layout.activity_main)
        // Bu satır, pencere ait girintiler için bir dinleyici ayarlar. Pencere ait girintiler, sistem çubukları (durum çubuğu, gezinme çubuğu) tarafından gizlenen ekran bölgelerini temsil eder.
        // "findViewById(R.id.main)" layout'ta "main" id'sine sahip görünümü bulur.
        // Lambda ifadesi (kıvrımlı parantezler { ... } ), dinleyici tetiklendiğinde yürütülecek kodu tanımlar.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Bu satır, "findViewById(R.id.main)" ile tanımlanan görünümün dolgusunu ayarlar.
            insets
            // Bu satır sadece "insets" değişkenini döndürür. Bu bağlamda herhangi bir ek işlem yapmaz.
        }
        var refreshButton=findViewById<Button>(R.id.refresh_button)//Refresh butonunu aktif etmiş olduk.
        var textView=findViewById<TextView>(R.id.textView)//Text kısmmını aktif etmiş olduk.
        var divButton=findViewById<Button>(R.id.divide_button)//Bölme butonunu aktif etmiş olduk.
        var multButton=findViewById<Button>(R.id.mult_button)//Çarpma butonunu aktif etmiş olduk.
        var minusButton=findViewById<Button>(R.id.dif_button)//Çıkarma butonunu aktif etmiş olduk.
        var addButton=findViewById<Button>(R.id.tot_button)//Toplama butonunu aktif etmiş olduk.
        var equalButton=findViewById<Button>(R.id.equal_button)//Eşittir butonunu aktif etmiş olduk.
        var modButton=findViewById<Button>(R.id.mod_button)//% butonunu aktif etmiş olduk.
        var MinConvButton=findViewById<Button>(R.id.min_con_button)//+-butonunu aktif etmiş olduk.
        var nineButton=findViewById<Button>(R.id.nine_button)//9 butonunu aktif etmiş olduk.
        var eightButton=findViewById<Button>(R.id.eight_button)//8 butonunu aktif etmiş olduk.
        var sevenButton=findViewById<Button>(R.id.seven_button)//7 butonunu aktif etmiş olduk.
        var sixButton=findViewById<Button>(R.id.six_button)//6 butonunu aktif etmiş olduk.
        var fiveButton=findViewById<Button>(R.id.five_button)//5 butonunu aktif etmiş olduk.
        var fourButton=findViewById<Button>(R.id.four_button)//4 butonunu aktif etmiş olduk.
        var threeButton=findViewById<Button>(R.id.three_button)//3 butonunu aktif etmiş olduk.
        var twoButton=findViewById<Button>(R.id.two_button)//2 butonunu aktif etmiş olduk.
        var oneButton=findViewById<Button>(R.id.one_button)//1 butonunu aktif etmiş olduk.
        var comaButton=findViewById<Button>(R.id.coma_button)//, butonunu aktif etmiş olduk.
        var zeroButton=findViewById<Button>(R.id.zero_button)//0 butonunu aktif etmiş olduk.
        var dubzeroButton=findViewById<Button>(R.id.dub_zero_button)//00 butonunu aktif etmiş olduk.

        var operation=0/*0 ise bölme 1 ise çarpma 2 ise çıkarma 3 ise toplama işlemi olsun*/
        var firstnumber=0

        refreshButton.setOnClickListener{/*AC Yani yenileme butonu*/
            firstnumber=0
            textView.text="0"

        }
        divButton.setOnClickListener {//Bölme butonu çalıştırma tıklama
            firstnumber=textView.text.toString().toInt()
            textView.text="0"
            operation=0

        }
        multButton.setOnClickListener{//Çarpma butonu tıklama
            firstnumber=textView.text.toString().toInt()
            textView.text="0"
            operation=1

        }
        minusButton.setOnClickListener{//Çıkarma butonu tıklama
            firstnumber=textView.text.toString().toInt()
            textView.text="0"
            operation=2

        }
        addButton.setOnClickListener{//Toplama Butonu tıklama
            firstnumber=textView.text.toString().toInt()
            textView.text="0"
            operation=3

        }
        nineButton.setOnClickListener{// 9 Butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="9"
            }else{
                textView.append("9")
            }
        }
        eightButton.setOnClickListener{//8 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="8"
            }else{
                textView.append("8")
            }
        }
        sevenButton.setOnClickListener{//7 Butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="7"
            }else{
                textView.append("7")
            }
        }
        sixButton.setOnClickListener{//6 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="6"
            }else{
                textView.append("6")
            }
        }
        fiveButton.setOnClickListener{//5 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="5"
            }else{
                textView.append("5")
            }
        }
        fourButton.setOnClickListener{//4 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="4"
            }else{
                textView.append("4")
            }
        }
        threeButton.setOnClickListener{//3 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="3"
            }else{
                textView.append("3")
            }
        }
        twoButton.setOnClickListener{//2 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="2"
            }else{
                textView.append("2")
            }
        }
        oneButton.setOnClickListener{//1 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="1"
            }else{
                textView.append("1")
            }
        }
        zeroButton.setOnClickListener{//0 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="0"
            }else{
                textView.append("0")
            }
        }
        dubzeroButton.setOnClickListener{//00 butonu tıklama
            var text= textView.text.toString()
            if(text=="0"){
                textView.text="00"
            }else{
                textView.append("00")
            }
        }
        MinConvButton.setOnClickListener {
            var currentNumber = textView.text.toString()    // textView'deki mevcut sayıyı bir String olarak alıyoruz.
            if (currentNumber.isNotEmpty() && currentNumber != "0") { // Eğer mevcut sayı boş değilse ve "0" değilse devam ediyoruz.
                if (currentNumber.startsWith("-")) {// Sayı negatif bir işaretle başlıyorsa, pozitif yapmak için işareti kaldırıyoruz.
                    // Eğer negatifse pozitif yap
                    textView.text = currentNumber.substring(1)
                } else {
                    // Eğer pozitifse negatif yap
                    textView.text = "-$currentNumber"
                }
            }
        }
        comaButton.setOnClickListener {
            var currentText = textView.text.toString()  // textView'deki mevcut metni bir String olarak alıyoruz.
            if (!currentText.contains(".")) {    // Eğer mevcut metin içinde "." (nokta) yoksa devam ediyoruz.
                textView.text = "$currentText."       // Mevcut metnin sonuna bir nokta ekleyerek güncelliyoruz.
            }
        }
        modButton.setOnClickListener {
            firstnumber = textView.text.toString().toInt() // textView'deki mevcut metni alıp tam sayıya dönüştürerek birinci sayıya atıyoruz.
            textView.text = "0" // textView'i sıfırlıyoruz, böylece kullanıcı ikinci sayıyı girebilir.
            operation = 4   // Mod işlemini temsil eden bir değer (operation 4) ile işlem türünü belirtiyoruz.
        }

        equalButton.setOnClickListener{
            // textView'deki mevcut metni alıp tam sayıya dönüştürerek ikinci sayıya atıyoruz.
            var secondnum=textView.text.toString().toInt()




            var total=when(operation){

                // Eğer işlem (operation) 0 ise, birinci sayıyı ikinci sayıya bölerek sonucu hesaplıyoruz.
                0->firstnumber/secondnum

                // Eğer işlem 1 ise, birinci sayıyı ikinci sayı ile çarparak sonucu hesaplıyoruz.
                1->firstnumber*secondnum

                // Eğer işlem 2 ise, birinci sayıdan ikinci sayıyı çıkararak sonucu hesaplıyoruz.
                2->firstnumber-secondnum

                // Eğer işlem 3 ise, birinci sayıyı ikinci sayıya ekleyerek sonucu hesaplıyoruz.
                3->firstnumber+secondnum

                // Eğer işlem 4 ise, birinci sayının ikinci sayıya göre modunu (kalanını) hesaplıyoruz.
                4->firstnumber % secondnum


                else->0
            }
            // Hesaplanan toplam değeri (total) bir String'e dönüştürerek textView'e yazdırıyoruz.
            // Böylece sonucu kullanıcıya gösteriyoruz.
            textView.text=total.toString()
        }
    }
}