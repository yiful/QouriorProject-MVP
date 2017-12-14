package com.yiful.qouriorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.yiful.qouriorproject.model.LoginPresenterImplementation;
import com.yiful.qouriorproject.presenter.LoginPresenter;
import com.yiful.qouriorproject.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView{
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenterImplementation(MainActivity.this);
        loginPresenter.login("shiva", "123");
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(this, "failure", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginValidationFailure() {
        Toast.makeText(this, "validation failure", Toast.LENGTH_SHORT).show();
    }
}
