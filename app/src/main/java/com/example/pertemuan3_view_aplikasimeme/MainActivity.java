package com.example.pertemuan3_view_aplikasimeme;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    String t1[],t2[],t3[];
    int images[]={R.drawable.gweh,R.drawable.apabila,R.drawable.terkadang};

    RecyclerView recycles;
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycles = findViewById(R.id.konten);
        t1 = getResources().getStringArray(R.array.title);
        t2 = getResources().getStringArray(R.array.description);
        t3 = getResources().getStringArray(R.array.category);
        HomeAdapter appAdapter = new
                HomeAdapter(this,t1,t2,t3,images);
        recycles.setAdapter(appAdapter);
        recycles.setLayoutManager(new
                LinearLayoutManager(this    ,LinearLayoutManager.HORIZONTAL,false));
    }

}
