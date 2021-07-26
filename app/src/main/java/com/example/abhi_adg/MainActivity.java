package com.example.abhi_adg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView1;
    RecyclerView.Adapter adapter1;
    RecyclerView.LayoutManager layoutManager1;

    RecyclerView recyclerView2;
    RecyclerView.Adapter adapter2;
    RecyclerView.LayoutManager layoutManager2;

    RecyclerView recyclerView3;
    RecyclerView.Adapter adapter3;
    RecyclerView.LayoutManager layoutManager3;

    String title[]={"Appearance","Notifications","Haptics"};
    int pic[]={R.drawable.appearance,R.drawable.notification,R.drawable.haptics};
    int arr1[]={R.drawable.arrow,R.drawable.arrow,R.drawable.arrow};

    String title2[]={"Contact Us","Share With Peers","Our Instagram","Our Twitter","Our Facebook","Our LinkedIn"};
    int pic2[]={R.drawable.mail,R.drawable.share,R.drawable.insta,R.drawable.twitter,R.drawable.fb,R.drawable.linkdin};
    int arr2[]={R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow,R.drawable.arrow};


    String title3[]={"About Us","Privacy Policy"};
    int pic3[]={R.drawable.aboutus,R.drawable.privacy};
    int arr3[]={R.drawable.arrow,R.drawable.arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.rcv);
        recyclerView1.setHasFixedSize(true);
        layoutManager1=new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager1);
        adapter1=new Adapter1(this,title,pic,arr1);
        recyclerView1.setAdapter(adapter1);

        recyclerView2=findViewById(R.id.rcv2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2=new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2=new Adapter2(this,title2,pic2,arr2);
        recyclerView2.setAdapter(adapter2);


        recyclerView3=findViewById(R.id.rcv3);
        recyclerView3.setHasFixedSize(true);
        layoutManager3=new LinearLayoutManager(this);
        recyclerView3.setLayoutManager(layoutManager3);
        adapter3=new Adapter3(this,title3,pic3,arr3);
        recyclerView3.setAdapter(adapter3);





    }


}