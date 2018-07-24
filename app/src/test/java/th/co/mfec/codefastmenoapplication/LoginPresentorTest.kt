package th.co.mfec.codefastmenoapplication

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import th.co.mfec.codefastmenoapplication.module.login.constractor.LoginConstractor
import th.co.mfec.codefastmenoapplication.module.login.presentor.LoginPresentor

class LoginPresentorTest{
    @Mock
    private lateinit var view: LoginConstractor.View
    private lateinit var presenter: LoginPresentor

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = LoginPresentor(view)
    }

    @Test
    fun `should return true when username and password correct`() {
        val output = presenter.checkUserPass("testtest", "1212312121")
        assertEquals(true, output)
    }

    @Test
    fun `should return false when username or password incorrect`() {
        val output = presenter.checkUserPass("mix", "dssdsds")
        assertEquals(false, output)
    }

}