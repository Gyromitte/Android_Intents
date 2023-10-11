package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void abrirMapa(View v)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo: -31.417, -64.183"));
        startActivity(i);
    }


    public void Camara(View v)
    {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void marcar(View v)
    {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 871347400"));
        startActivity(i);
    }


    public void Contactos(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(i);
    }

    public void SMS(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 871347400"));
        startActivity(i);
    }

    public void OpenScreen2(View v)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}