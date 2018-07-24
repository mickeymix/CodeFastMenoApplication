package th.co.mfec.codefastmenoapplication.module.login.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_login.*
import th.co.mfec.codefastmenoapplication.R
import th.co.mfec.codefastmenoapplication.module.login.constractor.LoginConstractor
import th.co.mfec.codefastmenoapplication.module.login.presentor.LoginPresentor

class LoginActivity : AppCompatActivity(), LoginConstractor.View {
    lateinit var presenter: LoginPresentor
    override fun getUsername(): String {

        return editText.text.toString()
    }

    override fun getPassword(): String {
        return editText2.text.toString()
    }

    override fun showUsernameError() {
        Toast.makeText(this, "showUsernameError", LENGTH_SHORT).show()
    }

    override fun showPasswordError() {
        Toast.makeText(this, "showPasswordError", LENGTH_SHORT).show()




    }

    override fun startMainActivity() {
        Toast.makeText(this, "startMainActivity", LENGTH_SHORT).show()

    }

    override fun showLoginError() {
        Toast.makeText(this, "showLoginError", LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresentor(this)
    }
}
