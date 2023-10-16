package tr.edu.trakya.cemtaskin.helloworlda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tr.edu.trakya.cemtaskin.helloworlda.ui.theme.HelloWorldATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Greeting(name ="Ali Duru" )
        }

//        setContent {
//            HelloWorldATheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Ali Duru")
//                }
//            }
//        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
                .width(100.dp)
                .height(200.dp)
                .padding(10.dp)
            .clickable {  }
        ,
        style = TextStyle(
            textAlign = TextAlign.Right,
            color = MaterialTheme.colorScheme.primary
        ),

        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,


    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting(name ="Ali Duru" )
}