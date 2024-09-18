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

public class LojasFragment extends Fragment {

    private ListView listViewLojas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lojas, container, false);

        listViewLojas = view.findViewById(R.id.listViewLojas);
        // Exemplo de lojas
        String[] lojas = {"Loja Centro", "Loja Zona Sul", "Loja Zona Norte", "Loja Shopping"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, lojas);
        listViewLojas.setAdapter(adapter);

        return view;
    }
}
