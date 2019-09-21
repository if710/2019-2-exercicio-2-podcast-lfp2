package br.ufpe.cin.android.podcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.jetbrains.anko.doAsync
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    doAsync{
        val url = URL("https://audio.globoradio.globo.com/podcast/feed/711/rodada-tripla").readText()
        Log.e("Titulo", Parser.parser(url).toString())
    }
}
