package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                     */
                }
            }
        }
    }
}
// suprimer de greeting dans tout le code changer en GreetingText

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

 */

@Composable
// parametre modifier de type Modifier et la valeur par default = Modifier

fun GreetingText(message : String , from : String , modifier: Modifier = Modifier){
    //AJOUT DU COMPOSANT TEXT
    Row {
        Text(
            text = message,
            color = Color.Magenta,
            fontSize = 55.sp,
            lineHeight = 150.sp
        )
        Text(
            text = from,
            fontSize = 36.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
       // Greeting("zhouleykha")
        // appel de la function GreetingText
        GreetingText("Happy BIRTHDAY ZHOULEYKHA!","FROM EMMA")

    }
}