package com.manitsche.exerciciofragment.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.manitsche.exerciciofragment.R;

public class ProdutosFragment extends Fragment {

    private ListView listViewProdutos;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_produtos, container, false);

        listViewProdutos = view.findViewById(R.id.listViewProdutos);
        // Exemplo de produtos
        String[] produtos = {"Tênis de Corrida", "Bola de Futebol", "Raquete de Tênis", "Camisa de Time"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, produtos);
        listViewProdutos.setAdapter(adapter);

        return view;
    }
}
