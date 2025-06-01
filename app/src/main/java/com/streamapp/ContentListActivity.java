package com.streamapp;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ContentListActivity extends AppCompatActivity {

    private ArrayList<String> conteudos;
    private ArrayList<String> descricoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);

        conteudos = new ArrayList<>();
        descricoes = new ArrayList<>();

        // Conteúdos fictícios
        conteudos.add("Podcast: Tecnologia em Debate");
        descricoes.add("Um podcast sobre as últimas tendências em tecnologia, inovação e gadgets.");

        conteudos.add("Série: Viagem no Tempo");
        descricoes.add("Série de ficção científica que explora viagens temporais e paradoxos.");

        conteudos.add("Filme: Código Fonte");
        descricoes.add("Um thriller de ação e suspense envolvendo programação e espionagem digital.");

        conteudos.add("Documentário: Planeta Azul");
        descricoes.add("Um mergulho nos oceanos do planeta, com imagens de tirar o fôlego.");

        conteudos.add("Música: Sons do Espaço");
        descricoes.add("Uma trilha musical relaxante inspirada em ondas sonoras cósmicas.");

        ListView listView = findViewById(R.id.contentList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, conteudos
        );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ContentListActivity.this, ContentDetailActivity.class);
                intent.putExtra("titulo", conteudos.get(position));
                intent.putExtra("descricao", descricoes.get(position));
                startActivity(intent);
            }
        });
    }
}