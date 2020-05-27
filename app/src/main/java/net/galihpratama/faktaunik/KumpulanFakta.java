package net.galihpratama.faktaunik;

import java.util.Random;

public class KumpulanFakta {
    // Fields (Variabel dari member) - Properties tentang object
    private String[] mFakta = {
            "Ridwan Kamil adalah walikota Bandung",
            "Pemrograman Android tidaklah terlalu sulit apabila kita belajar",
            "Bill Gates merupakan pemilik Microsoft Corporation",
            "Gunung Tangkuban Perahu berada di Kota Bandung",
            "Harga bensin turun dan naik secara cepat"
    };

    // Method - Aksi dimana object tersebut bisa mengambilnya
    public String getFakta() {

        String fakta = "";

        // Memilih fakta secara acak
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFakta.length);
        fakta = mFakta[randomNumber];

        return fakta;
    }

}
