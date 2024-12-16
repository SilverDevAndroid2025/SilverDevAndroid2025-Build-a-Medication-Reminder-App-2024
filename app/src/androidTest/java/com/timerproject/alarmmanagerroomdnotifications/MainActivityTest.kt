import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.timerproject.alarmmanagerroomdnotifications.BaseApplication
import com.timerproject.alarmmanagerroomdnotifications.MainActivity
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.testing.CustomTestApplication
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test


//@CustomTestApplication(BaseApplication::class)
//@CustomTestApplication(MainActivity::class)
@HiltAndroidTest
@HiltAndroidApp
class MainActivityTest {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    //val composeTestRule = createAndroidComposeRule<ComponentActivity>()
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    //val composeTestRule = createAndroidComposeRule(MainActivity::class.java)

    @Test
    fun test1() {
        composeTestRule.setContent {
            MainActivity()
        }
        composeTestRule.onNodeWithText("One")
    }
}
