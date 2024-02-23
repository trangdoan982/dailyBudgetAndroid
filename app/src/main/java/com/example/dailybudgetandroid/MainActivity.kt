package com.example.dailybudgetandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailybudgetandroid.ui.theme.DailyBudgetAndroidTheme

class MainActivity : ComponentActivity() {
    // create shared keys
    companion object {
        const val SHARED_KEY = "shared_key"
        const val email_key = "email_key"
        const val password_key = "password_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val email_input = findViewById<EditText>(R.id.username)
        val password_input = findViewById<EditText>(R.id.password)
//        val login_button = findViewById<Button>(R.id.login)

//        setContent {
//            DailyBudgetAndroidTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Login()
//                }
//            }
//        }
    }
}

@Composable
fun Login(modifier: Modifier = Modifier) {
    Text(
        text = "Login",
        modifier = modifier
    )

}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    DailyBudgetAndroidTheme {
        Login()
    }
}