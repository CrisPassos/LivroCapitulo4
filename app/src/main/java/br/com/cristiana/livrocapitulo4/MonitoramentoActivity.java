package br.com.cristiana.livrocapitulo4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MonitoramentoActivity extends AppCompatActivity {

    protected static final String CATEGORIA = "livro";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + icicle);

        setContentView(R.layout.activity_monitoramento);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onStart() chamada.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CATEGORIA, getClassName() + ".onRestart() chamada.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(CATEGORIA, getClassName() + ".onResume() chamada.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(CATEGORIA, getClassName() + ".onPause() chamada.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(CATEGORIA, getClassName() + ".onStop() chamada.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(CATEGORIA, getClassName() + ".onDestroy() chamada.");

    }

    private String getClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }

    public void segundaTela(View v){
        Intent i = new Intent(this, MonitoramentoTelaActivity.class);
        startActivity(i);
    }

}
