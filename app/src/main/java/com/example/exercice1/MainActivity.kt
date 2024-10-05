import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercice1.R

import com.example.exercice1.ui.theme.Exercice1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercice1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Jetpack Compose",
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Jetpack Compose Tutorial",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
            ),
            modifier = Modifier.padding(16.dp)
        )


        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            style = MaterialTheme.typography.bodyMedium.copy(),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)

        )


        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built " +
                    "around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on " +
                    "the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            style = MaterialTheme.typography.bodyMedium.copy(),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Exercice1Theme {
        Screen()
    }
}
