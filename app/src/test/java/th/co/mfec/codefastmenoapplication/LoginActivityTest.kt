package th.co.mfec.codefastmenoapplication

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import th.co.mfec.codefastmenoapplication.module.login.constractor.LoginConstractor
import th.co.mfec.codefastmenoapplication.module.login.presentor.LoginPresentor

class LoginActivityTest {

    @Mock
    private lateinit var view: LoginConstractor.View
    private lateinit var presenter: LoginPresentor

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = LoginPresentor(view)
    }

    @Test
    fun `Should show error when username is empty`() {
        presenter.onLoginClick("", "")

        verify(view).showUsernameError()
    }

    @Test
    fun `Should show error when password is empty`() {
        presenter.onLoginClick("dsdsd", "")

        verify(view).showPasswordError()
    }

    @Test
    fun `Should start MainActivity when username and password correct`() {
        presenter.onLoginClick("testtest", "1212312121")

        verify(view).startMainActivity()
    }

    @Test
    fun `Should show error when username or password incorrect`() {
        presenter.onLoginClick("testtest", "4555555")

        verify(view).showLoginError()
    }
}