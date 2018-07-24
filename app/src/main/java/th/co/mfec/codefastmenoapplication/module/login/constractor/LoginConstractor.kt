package th.co.mfec.codefastmenoapplication.module.login.constractor

class LoginConstractor {

    interface View {
        fun getUsername(): String

        fun getPassword(): String

        fun showUsernameError()

        fun showPasswordError()

        fun startMainActivity()

        fun showLoginError()
    }

    interface Presentor {
        fun onLoginClick(userName: String, passsword: String)
    }
}