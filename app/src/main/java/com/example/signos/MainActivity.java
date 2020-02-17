package com.example.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {
            "Aires", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem","Libra", "Escorpião", "Sagitário",
            "Capricórino", "Aquário", "Peixes"
    };

    private String[] perfil = {
            "Mostrar o valor da iniciativa, dar o primeiro passo e estimular as pessoas",
            "Concluir o que começar e provar que é preciso construir sonhos com os pés na realidade",
            "Perguntar, compreender e comunicar aos outros tudo o que aprender",
            "Valorizar a emoção e mostrar que também é preciso enxergar com o coração",
            "Destacar a beleza, a alegria e a grandiosidade do que há de bom no mundo",
            "Analisar, apontar erros e lembrar a importância do aperfeiçoamento constante",
            "Cooperar, mostrar que é preciso ponderar e atenuar desavenças em nome do amor",
            "Analisar, apontar erros e lembrar a importância do aperfeiçoamento constante",
            "Cooperar, mostrar que é preciso ponderar e atenuar desavenças em nome do amor",
            "Controlar os instintos, desenvolver a intuição e usá-la para praticar o bem",
            "Mostrar a importância do bom humor, da generosidade e levar a mensagem da esperança",
            "Ensinar que é preciso ter responsabilidade e dedicação para progredir",
            "Acreditar no futuro, buscar horizontes novos e lembrar o valor de ser livre",
            "Compreender os mistérios humanos, ter compaixão e confortar quem necessita de apoio"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, perfil[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
