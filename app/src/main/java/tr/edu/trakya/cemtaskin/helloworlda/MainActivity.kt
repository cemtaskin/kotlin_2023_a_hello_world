package tr.edu.trakya.cemtaskin.helloworlda

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tr.edu.trakya.cemtaskin.helloworlda.ui.theme.HelloWorldATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
           LoginForm()
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginForm(){
    var text by remember { mutableStateOf("Hello") }

    Column() {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Ali"
        )
        Row{
            Text("Username : ")
            TextField(value="", onValueChange = {text = it

            })
        }
        Row{
            Text("Password:")
            TextField(value="", onValueChange = {text = it

            })
        }
        Button(onClick = { /*TODO*/ }) {
            Text("Login")
            
        }

    }


}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        style = TextStyle(
            textAlign = TextAlign.Right,
            color = MaterialTheme.colorScheme.error
        ),
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
    )
}

@Composable
fun GreetingButton (){
    Button(onClick = { /*TODO*/ }) {
        Greeting(name = "Ali")
        Greeting(name = "Duru")
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    LoginForm()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Greeting(name = "Ali")
}