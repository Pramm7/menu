package com.example.asus.menu;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep_nama.add("Gulai");
        resep_detail.add("Gulai adalah masakan berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercitarasa gurih.");
        resep_ingredients.add("1. Nasi yang telah masak\n2. Cabai\n3. Santan\n4. Kunyit\n5. bawang putih\n6. bawang merah\n7. Lada\n8. Jahe\n9. pala, kunyit, minyak sayur, gula, dan irisan mentimun serta tomat untuk hiasan");
        resep_process.add("\n" +
                "    Siapkan satu panci dan isi air secukupnya. Rebus dahulu daging dan iga kambing sampai mendidih (setengah lunak) untuk menghilangkan bau khas rengus kambing.\n" +
                "    Sambil menunggu daging kambing nya mendidih, haluskan bumbu bumbu halus diatas. Bisa menggunakan blender, tetapi lebih enak kalau di haluskan memaki tangan (di uleg pakai tangan).\n" +
                "    Siapkan satu wajan dan isi minyal goreng secukupnya.\n" +
                "    Masukkan daun kunyit, serai uang sudah dimemarkan, daun salam, daun jeruk dan bumbu bumbu halus yang sudah dipersiapkan di atas. Aduk aduk dengan api kecil sampai tercium bau harum.\n" +
                "    Setelah rebusan pertama daging kambing selesai, buang airnya suapay kotoran dan darah yang menempel juga ikut terbuang.\n" +
                "    Isi panci dengan air kurang lebih sebanyak 1.25 liter dan rebus air sampai mendidih.\n" +
                "    Masukkan daging kambing yang sudah direbus dan tunggu sebentar sampai daging agak lunak.\n" +
                "    Masukkan bumbu bumbu yang sudah dihaluskan diatas ke dalam panci dan aduk aduk sebentar sampai semua bahan tercampur rata.\n" +
                "    Masukkan setengah liter santan encernya. Aduk aduk bersama sisa bumbu lain yang belum dimasukkan sampai mendidih. Jaga jangan sampai santan pecah.\n" +
                "    Masukkan sisa santan kentalnya dan aduk aduk kembali sampai semau bahan tercampur sempurna. Ingat, jaga proses pengadukan jangan sampai santan pecah karena bisa merusak dan mengurai kelezatan rasa resep gulai kambing nya.\n" +
                "    Cicipi dan tambahkan garam kalau dirasakan perlu.\n");
        resep_nama.add("Mi goreng");
        resep_detail.add("Mi goreng berarti \"mi yang digoreng\" adalah makanan yang populer dan digemari di Indonesia, Malaysia, dan Singapura");
        resep_ingredients.add("1.Nasi\n2.Air");
        resep_process.add("1.process");
        resep_nama.add("Rendang");
        resep_detail.add("Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam hingga kering dan berwarna hitam pekat.");
        resep_ingredients.add("1.Daging");
        resep_process.add("1.process");
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
