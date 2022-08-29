package com.example.libraryapp

object BookData {

    private val booktitle = arrayOf(
        "Hunt for The Thumb",
        "Kappa",
        "Kumpulan Budak Setan",
        "Daun yang Jatuh Tidak Pernah Membenci Angin",
        "Satu Kota Tiga Tuhan",
        "Kau, Aku, dan Sepucuk Angpau Merah",
        "Cantik Itu Luka",
        "Orang Aneh",
        "O",
        "Indonesia X-Files 2",
        "Lelaki Harimau",
        "Metamorfosis dan Cerita Lainnya",
        "Seperti Dendam Rindu Harus Dibayar Tuntas",
        "Peril at End House" )

    private val booktype = arrayOf(
        "Komik",
        "Novel",
        "Kumpulan Cerita",
        "Novel",
        "Sosial Politik",
        "Novel",
        "Novel",
        "Novel",
        "Novel",
        "Nonfiksi",
        "Novel",
        "Kumpulan Cerita",
        "Novel",
        "Novel")

    private val bookwriter = arrayOf(
        "Yamada Yusuke, Ayamura Kirihito",
        "Ryunosuke Akutagawa",
        "Eka Kurniawan, Intan Paramaditha, Ugoran Prasad",
        "Tere Liye",
        "T. Taufiqulhadi",
        "Tere Liye",
        "Eka Kurniawan",
        "Albert Camus",
        "Eka Kurniawan",
        "dr. Abdul Mun'im Idries, Sp.F",
        "Eka Kurniawan",
        "Franz Kafka",
        "Eka Kurniawan",
        "Agatha Christie")
    private val bookdescription = arrayOf(
        "Permainan mencari ibu jari... Di seluruh negeri, beredar cerita di mana ada wanita yang dibunuh dan ibu jarinya tidak ditemukan. Konon, wanita itu masih mencari ibu jarinya dan akan mengabulkan permintaan siapapun yang menemukannya... Menganggap cerita itu hanya gosip, sekumpulan anak-anak mencoba permainan itu untuk iseng. Tapi, salah satu dari mereka, Yumi, menghilang ketika memainkannya. Tujuh tahun sejak tragedi itu, Takeshi dan yang lainnya memutuskan untuk mencari Yumi tanpa mengetahui wanita itu masih mencari ibu jarinya...",
        "Kappa sebuah karya memukau hasil pikiran yang kacau dan jenius dari seorang intelektual paling terkemuka Jepang dalam era Meiji. Novel satire dan sebuah analisis sosial tentang kehidupan masyarakat dan budaya Jepang. Kappa terjadi di suatu tempat, di antara mimpi dan kenyataan. Novel ini diceritakan lewat orang pertama dari sudut pandang orang gila di rumah sakit jiwa, yang dikenal sebagai Pasien No.23. Ditulis secara singkat sebelum Ryonosuke Akutagawa bunuh diri, terutama saat halusinasi dan khayalan menyerangnya.",
        "Kumpulan Budak Setan, kompilasi cerita horor Eka Kurniawan, Intan Paramaditha, dan Ugoran Prasad, adalah proyek membaca ulang karya-karya Abdullah Harahap, penulis horor populer yang produktif di era 1970-1980an. Dua belas cerpen di dalamnya mengolah tema-tema khas Abdullah Harahap-balas dendam, seks, pembunuhan-serta motif-motif berupa setan, arwah penasaran, obyek gaib (jimat, topeng, susuk), dan manusia jadi-jadian.",
        "Dia bagai malaikat bagi keluarga kami. Merengkuh aku, adikku, dan Ibu dari kehidupan jalanan yang miskin dan nestapa. Memberikan makan, tempat berteduh, sekolah, dan janji masa depan yang lebih baik. Dia sungguh bagai malaikat bagi keluarga kami. Memberikan kasih sayang, perhatian, dan teladan tanpa mengharap budi sekali pun. Dan lihatlah, aku membalas itu semua dengan membiarkan mekar perasaan ini. Ibu benar, tak layak aku mencintai malaikat keluarga kami. Tak pantas. Maafkan aku, Ibu. Perasaan kagum, terpesona, atau entahlah itu muncul tak tertahankan bahkan sejak rambutku masih dikepang dua. Sekarang, ketika aku tahu dia boleh jadi tidak pernah menganggapku lebih dari seorang adik yang tidak tahu diri, biarlah... Biarlah aku luruh ke bumi seperti sehelai daun... daun yang tidak pernah membenci angin meski harus terenggutkan dari tangkai pohonnya.",
        "Tulisan-tulisan dalam buku ini-meski ditulis oleh seorang jurnalis-menawarkan sudut pandang yang berbeda, Alih-alih melaporkan perang, buku ini justru melukiskan sisi-sisi kehidupan sehari-hari antara dua bangsa yang 'terpaksa' hidup bersama, meski memiliki perbedaan yang nyaris tak terjembatani.\nBuku 'Satu Kota Tiga Tuhan' karya Taufiqulhadi ini bukan buku yang berbicara mengenai tiga agama samawi - Yahudi, Kristen, dan Islam - yang dipeluk tiga komunitas besar di Yerussalem atau al-Quds, sebagaimana diisyaratkan oleh judul buku ini. Lebih dari itu, buku ini berbicara mengenai sejarah, politik, ekonomi, budaya, militer, dan konflik yang melingkupi bangsa Israel dan bangsa Palestina, yang sebenarnya telah terjadi sejak lebih dari 1000 tahun yang lalu, yang ditulis dalam tulisan-tulisan pendek lepas. Alhasil, buku ini berbicara banyak hal dalam spektrum yang luas.",
        "Tentang  kisah cinta antara pemuda asal Kalimantan bernama Borno dan pemudi Tionghoa bernama Mei. Gagal menjadi pekerja pabrik karet, sarang burung walet, petugas karcis, akhirnya menjadi pengemudi sepit (Speedboat) dan montir bengkel Daeng, dipertemukanlah kedua pemuda ini. Walaupun saling mencintai, Mei beberapa kali tanpa alasan hilang dari pandangan Borno. Rintangan yang Borno harus lewati, yaitu untuk bertemu dengan Mei di Surabaya, berhubungan lagi, dan lain-lain harus dilewati.",
        "Di satu sore, seorang perempuan bangkit dari kuburannya setelah dua puluh satu tahun kematian. Kebangkitannya menguak kutukan dan tragedi keluarga, yang terentang sejak akhir masa kolonial. Perpaduan antara epik keluarga yang dibalut romans, kisah hantu, kekejaman politik, mitologi, dan petualangan. Dari kekasih yang lenyap ditelan kabut hingga seorang ibu yang menginginkan bayi buruk rupa",
        "Bayangkan Anda yang sebenarnya tidak bersalah dalam sebuah kasus, tiba-tiba dijatuhi vonis hukuman mati oleh pengadilan. Sisa hidup Anda terhenti di kamar penjara yang pengap, menanti hari penentuan ajal. Tak ada cinta, tak ada senyumm kekasih. Munngkin saat itu Anda akan mengutuk dunia atau menuntut keadilan Tuhan. Tapi tidak demikian dengan Mersault, tokoh utama dalam novel ini. Baginya, orang yang dijatuhi hukuman mati lebih bebas daripada mereka yang melakukan bunuh diri, karena mereka menanggalkan kehidupannya sendiri.\nOrang aneh adalah novel terbaik Albert Camus yang memantulkan keterasingan dan absurditas manusia. Lewat karakter Mersault, Camus mencitrakan dirinya: citra absurditas dan paham eksistensialisme!",
        "Di balik pertunjukan sirkus monyet dan siksaan tanpa akhir, seekor monyet belajar untuk menjadi manusia. Ia percaya cinta menunggunya di sana, dalam wujud Kaisar Dangdut. Cinta pula yang membuat seorang polisi meninggalkan rumah. Apakah ia percaya bahwa cinta sejati bisa dibuktikan dengan terjun ke sungai yang akan mengubahnya menjadi ikan? Hidup mereka berbelit dengan seekor anjing, kakatua, ular sanca, lelaki buta, sepasang pemulung, dan kaleng sarden, dalam fabel tentang mimpi serta kebengisan hidup.",
        "Buku itu belum memuat semuanya. Masih ada lagi yang harus diketahui khalayak.\n\nDemikian Mun'im berpesan, setelah buku Indonesia X-Files terbit. Tiga bulan sebelum kematiannya. Dia sadar, selama ini publik telah banyak dibohongi oleh hal-hal yang mengusung alasan melindungi masyarakat.\nDalam buku ini, Mun'im mengungkap hubungan sebab-akibat kriminalitis yang sejak dulu hingga kini masih berlangsung. Kejahatan seksual, fenomena bunuh diri, kerusuhan, penembakan, dan penyalahgunaan obat-obatan adalah beberapa diantaranya. Dari paparan Mun'im, kita tak hanya memahami, tetapi juga mendapatkan bekal agar lebih berhati-hati dari intaian kejadian yang tak diinginkan.",
        "Pada lanskap yang sureal, Margio adalah bocah yang menggiring babi ke dalam perangkap. Namun di sore ketika seharusnya rehat menanti musim perburuan, ia terperosok dalam tragedi pembunuhan paling brutal. Di balik motif-motif yang berhamburan, antara cinta dan pengkhianatan, rasa takut dan berahi, bunga dan darah, ia menyangkal dengan tandas. “Bukan aku yang melakukannya,” ia berkata dan melanjutkan, “Ada harimau di dalam tubuhku.”",
        "Metamorfosis, cerpen Kafka yang dicantumkan sebagai judul antologinya ini, merupakan cerpen yang terpanjang. Senapas dengan cerpen-cerpen lainnya, melalui Metamorfosis, Kafka membangun dunia yang suram, menyakitkan, dan buntu tanpa harapan. Ia menusuk saraf kehidupan masyarakat industrial-modern. Di dalamnya tergambar dengan jelas nihilisme masyarakat tanpa Tuhan, hiper-rasionalisme birokrasi yang mencekik kejujuran dalam jejaringnya, dan kandasnya egala macam idealisme.",
        "Di puncak rezim yang penuh kekerasan, kisah ini bermula dari satu peristiwa: dua orang polisi memerkosa seorang perempuan gila, dan dua bocah melihatnya melalui lubang di jendela. Dan seekor burung memutuskan untuk tidur panjang. Di tengah kehidupan yang keras dan brutal, si burung tidur merupakan alegori tentang kehidupan yang tenang dan damai, meskipun semua orang berusaha membangunkannya.",
        "Tiga kecelakaan fatal dalam tiga hari. Semuanya nyaris merenggut nyawa Nick Buckley, gadis cantik yang tinggal seorang diri di End House. Hercule Poirot yang mengkhawatirkan keselamatan gadis itu bertanya-tanya apakah semua itu memang kecelakaan atau usaha pembunuhan ? Ia pun membuka mata dan memasang telinga lebar-lebar. Tapi kecelakaan lain kembali terjadi, dan kali ini korbannya gadis lain."  )

    private val bookcover = intArrayOf(
        R.drawable.thumb,
        R.drawable.kappa,
        R.drawable.budak,
        R.drawable.daun,
        R.drawable.satukota,
        R.drawable.kauaku,
        R.drawable.cantik,
        R.drawable.oranganeh,
        R.drawable.o,
        R.drawable.xfiles,
        R.drawable.lelaki,
        R.drawable.meta,
        R.drawable.dendam,
        R.drawable.peril)

    private val bookrate = floatArrayOf(3.8F,  4.2F,  4.2F, 4.0F, 4.0F, 3.5F, 4.5F, 4.0F, 3.5F, 4.8F, 4.5F, 3.5F, 3.0F, 4.0F)

    val listData : ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in booktitle.indices) {
                val book = Book ()
                book.title = booktitle[position]
                book.writer = bookwriter[position]
                book.type = booktype[position]
                book.description = bookdescription[position]
                book.cover  = bookcover[position]
                book.rateBar = bookrate[position]
                book.rateValue = bookrate[position]
                list.add(book)
            }
            return list
        }

}