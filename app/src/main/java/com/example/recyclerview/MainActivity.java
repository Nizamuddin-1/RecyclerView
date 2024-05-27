package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView r= findViewById(R.id.Recycle);
        r.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"A"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"B"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"C"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"D"));
        arrayList.add(new ContactModel(R.drawable.ic_baseline_emoji_people_24,"E"));
        arrayList.add(new ContactModel(R.drawable.ic_launcher_background,"F"));

        RecyclerContactAdapter adapter= new RecyclerContactAdapter(this,arrayList);
        r.setAdapter(adapter);


    }
}