package com.example.libraryapp

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.Intent.ACTION_PICK
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WishlistActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvWishBook : RecyclerView
    private var listWishBook : ArrayList<WishBook> = arrayListOf()
    private var wishlistAdapter = WishListAdapter(listWishBook)
    private lateinit var toolbarBack : Toolbar
    private lateinit var pic : ImageView
    private val IMAGE_PICK_CODE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishlist)

        buttonBack()

        rvWishBook = findViewById(R.id.rv_wishbooks)
        rvWishBook.setHasFixedSize(true)
        listWishBook.addAll(WishBookData.listWishBook)
        rvWishBook.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvWishBook.adapter = wishlistAdapter

        val btnTakePic: ImageButton = findViewById(R.id.cover_wish)
        btnTakePic.setOnClickListener(this)
        val save: Button = findViewById(R.id.btn_save)
        save.setOnClickListener(this)
 }

    private fun buttonBack(){
        toolbarBack = findViewById(R.id.toolbarBack)
        setSupportActionBar(toolbarBack)
        toolbarBack.setNavigationIcon(R.drawable.ic_back)
        toolbarBack.setNavigationOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }


    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.cover_wish -> {
                    galleryAccess()
                }

                R.id.btn_save -> {
                    Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                }

                }
            }
        }

    private fun galleryAccess() {
        val intent = Intent(ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        pic = findViewById(R.id.inputcover)
        if (resultCode == Activity.RESULT_OK  && requestCode == IMAGE_PICK_CODE) {
            pic.setImageURI(data?.data)
        }
    }


}
