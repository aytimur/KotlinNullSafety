package ibrahim.aytimur.nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Kotlin null safety
        // non-null type(null olmayan tipler)
        var kullanici ="admin"
        var sifre ="35admin"
        textView.text = kullanici
        // nullable type(null olabilen tipler)
        // safe call operatörü(?.)
        var adi:String?="ibrahim"
        adi = null
        var soyadi:String?=null
        textView.text = adi?.length.toString()

        // !! Operatörü(Güvenli olmayan yol)
        var unvani:String?="öğretmen"
        var alani:String?=null
        textView.text = unvani!!.length.toString() // doğrusu
        // textView.text = alani!!.length.toString()  hata verecektir

        // Elvis Operatörü(?:)
        var okuladi:String?="Gazeteci Çetin Altan MTAL"
        var okuladresi:String?=null
        var uzunluk:Int = okuladresi?.length ?: 0
        textView.text = uzunluk.toString()

    }
}