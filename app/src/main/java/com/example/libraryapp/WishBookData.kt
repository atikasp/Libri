package com.example.libraryapp

object WishBookData {

    private val wishbooktitle = arrayOf(
        "To Heal is To Accept",
        "Deep Work",
        "Kejahatan dan Hukuman",
        "Stay With Me" )


    private val wishbookwriter = arrayOf(
        "Adi K.",
        "Carol Dweck",
        "Fyodor Dostoyevsky",
        "Ayobami Adebayo" )


    private val wishbookcover = intArrayOf(
        R.drawable.heal,
        R.drawable.deep,
        R.drawable.fyodor,
        R.drawable.stay )


    val listWishBook : ArrayList<WishBook>
        get() {
            val list = arrayListOf<WishBook>()
            for (position in wishbooktitle.indices) {
                val wishbook = WishBook ()
                wishbook.title = wishbooktitle[position]
                wishbook.writer = wishbookwriter[position]
                wishbook.cover  = wishbookcover[position]
                list.add(wishbook)
            }
            return list
        }

}