package com.example.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {

    private lateinit var imgcover : ImageView
    private lateinit var tvtitle : TextView
    private lateinit var tvtype : TextView
    private lateinit var tvwriter: TextView
    private lateinit var tvdesc : TextView
    private lateinit var ratebar : RatingBar
    private lateinit var rbValue : TextView
    private lateinit var toolbarBack : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgcover = findViewById(R.id.cover)
        tvtitle = findViewById(R.id.title)
        tvtype= findViewById(R.id.type)
        tvwriter= findViewById(R.id.writer)
        tvdesc = findViewById(R.id.description)
        ratebar = findViewById(R.id.ratingBar)
        rbValue = findViewById(R.id.rateValue)

        imgcover.setImageResource(intent.getStringExtra("COVER")!!.toInt())
        tvtitle.text = intent.getStringExtra("TITLE")
        tvtype.text = intent.getStringExtra("TYPE")
        tvwriter.text = intent.getStringExtra("WRITER")
        tvdesc.text = intent.getStringExtra("DESCRIPTION")
        rbValue.text = intent.getStringExtra("RATEVALUE")
        ratebar.rating = intent.getStringExtra("RATEBAR")!!.toFloat()

        toolbarBack = findViewById(R.id.toolbarBack)
        setSupportActionBar(toolbarBack)

        toolbarBack.setNavigationIcon(R.drawable.ic_back)
        toolbarBack.setNavigationOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sharefav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.share-> {
                val sendIntent : Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Please read this awesome book\n"+"--------------------\n"+tvtitle.text.toString()+"\n"+tvwriter.text.toString()+"\n"+tvdesc.text.toString())
                    type="text/plain"
                }
               val shareIntent = Intent.createChooser(sendIntent, "Share via : ")
                startActivity(shareIntent)
            }
            R.id.fav-> {
                Toast.makeText(this, "Favourite clicked", Toast.LENGTH_SHORT).show()
                item.setIcon(R.drawable.ic_fav)
            }

        }
        return true
    }


}
