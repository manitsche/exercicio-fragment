package com.manitsche.exerciciofragment.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.manitsche.exerciciofragment.Fragment.LojasFragment;
import com.manitsche.exerciciofragment.Fragment.ProdutosFragment;
import com.manitsche.exerciciofragment.R;

public class MainActivity extends AppCompatActivity {

    private Button btnProdutos, btnLojas;
    private ProdutosFragment produtosFragment;
    private LojasFragment lojasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialize os botões
        btnProdutos = findViewById(R.id.btnProdutos);
        btnLojas = findViewById(R.id.btnLojas);

        // Inicialize os fragmentos
        produtosFragment = new ProdutosFragment();
        lojasFragment = new LojasFragment();

        // Adiciona o fragmento de produtos por padrão
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameConteudo, produtosFragment)
                .commit();

        // Configura o clique dos botões
        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameConteudo, produtosFragment)
                        .commit();
            }
        });

        btnLojas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameConteudo, lojasFragment)
                        .commit();
            }
        });
    }
}
