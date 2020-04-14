package com.example.recyclerviewapp;

import java.util.ArrayList;

public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Wiwin Winarti",
            "Virdyawan Eka Prayoga",
            "Mega Restu Mirantika",
            "Andi Purnama",
            "Yulianti"
    };

    private static String[] mahasiswaNim = {
            "311710465",
            "311710496",
            "311710112",
            "311710003",
            "311710092",
    };

    private static String[] mahasiswaHp = {
            "0857-9493-2912",
            "0896-8857-1302",
            "0858-6009-6469",
            "0838-0695-8903",
            "0881-5386-8739",
    };

    private static int[] mahasiswaImage = {
            R.drawable.wiwinwinarti,
            R.drawable.virdyawan,
            R.drawable.mega,
            R.drawable.andi,
            R.drawable.yulianti
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}