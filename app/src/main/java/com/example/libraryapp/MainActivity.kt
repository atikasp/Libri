package com.example.libraryapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() ,NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var rvBook : RecyclerView
    private var list : ArrayList<Book> = arrayListOf()
    private var listBookAdapter = ListBookAdapter(list)
    private lateinit var totalbooks: TextView
    private lateinit var texttotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBook = findViewById(R.id.rv_books)
        rvBook.setHasFixedSize(true)

        list.addAll(BookData.listData)
        showRecyclerList()
        totalbooks()

        drawerLayout= findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar,0, 0)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    private fun totalbooks() {
        totalbooks = findViewById(R.id.totalofbooks)
        val total = listBookAdapter.itemCount.toString()
        totalbooks.text = total
    }

    private fun showRecyclerList() {
        rvBook.layoutManager = LinearLayoutManager(this)
        rvBook.adapter = listBookAdapter

        listBookAdapter.setOnItemClickCallback(object : ListBookAdapter.OnItemClickCallback {
            override fun onItemClicked(data : Book) {
                showSelectedBook(data)
            }
        })
    }

    private fun showSelectedBook(book: Book) {

        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra("COVER", book.cover.toString())
        moveIntent.putExtra("TITLE", book.title)
        moveIntent.putExtra("TYPE", book.type)
        moveIntent.putExtra("WRITER", book.writer)
        moveIntent.putExtra("DESCRIPTION", book.description)
        moveIntent.putExtra("RATEBAR", book.rateBar.toString())
        moveIntent.putExtra("RATEVALUE", book.rateValue.toString())
        startActivity(moveIntent)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_mine-> {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.nav_fav-> {
                val wishIntent = Intent(this@MainActivity, WishlistActivity::class.java)
                startActivity(wishIntent)
            }
            R.id.nav_about -> {
                val aboutIntent = Intent(this@MainActivity, About::class.java)
                startActivity(aboutIntent)

            }
            R.id.nav_close -> {
                closeApp()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuinflater =  menuInflater
        menuinflater.inflate(R.menu.search_menu, menu)

        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchitem = menu?.findItem(R.id.search)
        val searchview = searchitem?.actionView as SearchView
        searchview.queryHint = "Title, Writer"
        searchview.setSearchableInfo(manager.getSearchableInfo(componentName))

        searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                searchview.clearFocus()
                searchview.setQuery("", false)
                searchitem.collapseActionView()
                return true
            }

            @SuppressLint("DefaultLocale")
            override fun onQueryTextChange(newText: String?): Boolean {
                texttotal = findViewById(R.id.texttotal)
                texttotal.visibility = View.GONE
                totalbooks.visibility = View.GONE
                val tempList : MutableList<Book> = ArrayList()
                if(newText!!.isNotEmpty()){
                    val search = newText.toLowerCase()
                    for (book in list) {
                        if (book.title.toLowerCase().contains(search) || book.writer.toLowerCase().contains(search)) {
                            tempList.add(book)
                        }
                    }

                }
                else {
                    totalbooks.visibility = View.VISIBLE
                    texttotal.visibility = View.VISIBLE
                    tempList.addAll(list)
                }
                listBookAdapter.updateList(tempList)
                return true
            }

        })

        return true
    }

    private fun closeApp() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to close this application ?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> finishAffinity() }
            .setNegativeButton("No") { dialog, id -> dialog.cancel() }

        val alert = builder.create()
        alert.setTitle("Close This App ?")
        alert.show()

    }



}


