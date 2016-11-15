package br.com.cristiana.livrocapitulo4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;

import br.com.cristiana.livrocapitulo4.Utils.Constantes;

public class LoginActivity extends Activity {

    TextInputLayout tilUsuario, tilSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tilUsuario = (TextInputLayout) findViewById(R.id.tilUsuario);
        tilSenha = (TextInputLayout) findViewById(R.id.tilSenha);

    }

    public void logar(View v){
        String usuario = tilUsuario.getEditText().getText().toString();
        String senha = tilSenha.getEditText().getText().toString();

        if (usuario.equals("admin") && senha.equals("admin")){
            tilSenha.setErrorEnabled(false);
            tilUsuario.setErrorEnabled(false);

            Intent i = new Intent(this, MainActivity.class);
            i.putExtra(Constantes.KEY_USUARIO, usuario);
            startActivity(i);

        } else {
            tilUsuario.setError(" ");
            tilSenha.setError(getString(R.string.app_invalido));
        }
    }
}
