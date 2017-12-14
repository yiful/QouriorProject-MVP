package com.yiful.qouriorproject.model;

import android.text.TextUtils;

import com.yiful.qouriorproject.presenter.LoginPresenter;
import com.yiful.qouriorproject.view.LoginView;

import org.w3c.dom.Text;

/**
 * Created by Yifu on 12/14/2017.
 */

public class LoginPresenterImplementation implements LoginPresenter {
    private LoginView loginView;

    public LoginPresenterImplementation(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login(String username, String password) {
        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            loginView.loginValidationFailure();
        }else if(username.equalsIgnoreCase("yifu") && password.equalsIgnoreCase("1234")){
            loginView.loginSuccess();
        }else{
            loginView.loginFailure();
        }
    }
}
