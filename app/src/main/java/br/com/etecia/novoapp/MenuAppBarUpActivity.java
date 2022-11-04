package br.com.etecia.novoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarUpActivity extends AppCompatActivity {
//declarando a variavel global do objeto AppBar

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_up_layout);
        //apresentando a toolbar xml para o java
        idToolbar = findViewById(R.id.idToolbar);

        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Você clicou em voltar!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(),
                                "Você clicou no Favorite.",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBuscar:
                        Toast.makeText(getApplicationContext(),
                                "Você clicou no Buscar.",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(),
                                "Você clicou no More.",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }

}