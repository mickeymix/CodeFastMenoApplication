package th.co.mfec.codefastmenoapplication.module.login.presentor

import th.co.mfec.codefastmenoapplication.module.login.constractor.LoginConstractor

class LoginPresentor(private val view: LoginConstractor.View) : LoginConstractor.Presentor {
    override fun onLoginClick(userName: String, password: String) {
        val username: String = userName
        if(username.isEmpty()) {
            view.showUsernameError()
            return
        }
        val password: String = password
        if(password.isEmpty()) {
            view.showPasswordError()
            return
        }
        val isLoginSuccess: Boolean = checkUserPass(username, password)
        if(isLoginSuccess) {
            view.startMainActivity()
            return
        }
        view.showLoginError()

    }

    fun checkUserPass(userName: String, password: String): Boolean {
        return userName == "testtest" && password == "1212312121"
    }
}