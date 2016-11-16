package br.com.cristiana.livrocapitulo4;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaContatoActivity extends AppCompatActivity {

    private ListView listaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contato);

        listaContatos = (ListView) findViewById(R.id.lstContatos);

        //Uri para buscar os contatos
        Uri uri = ContactsContract.Contacts.CONTENT_URI;

        //Recuperar o cursos dos contatos
        Cursor c = getContentResolver().query(uri, null, null, null, null);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        while (c.moveToNext()){
            adaptador.add(c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
        }

        //Informa o adapter responsável por exibir a lista do ListActivity
        listaContatos.setAdapter(adaptador);

        c.close();

    }
}
