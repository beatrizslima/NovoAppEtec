package br.com.etecia.novoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Inserir o menu na barra do aplicativo.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    ///Criando método para clicar nos itens da barra de menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(), "clicou nos favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(), "clicou", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBusc:
                Toast.makeText(getApplicationContext(), "clicou", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mShare:
                Toast.makeText(getApplicationContext(), "clicou", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHist:
                Toast.makeText(getApplicationContext(), "clicou", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "clicou", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}