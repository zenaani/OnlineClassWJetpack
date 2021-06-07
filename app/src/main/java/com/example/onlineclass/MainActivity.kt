package com.example.onlineclass

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlineclass.ui.theme.OnlineClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }



            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Background() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue))
}

@Composable
fun CircleLink() {
    Box(Modifier
        .size(45.dp, 45.dp)
        ) {

        Card(modifier = Modifier
            .fillMaxSize(),
        shape = CircleShape) {

            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Blah", color = Color.Green, fontSize = 20.sp, textAlign = TextAlign.Center)
            }
            


        }
    }
}


@Composable
fun DaysLayout() {
    Column() {

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)

        ) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                shape = RoundedCornerShape(25.dp)) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                }
            }
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                }
            }
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                }
            }
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                }
            }
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            Card(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnlineClassTheme {
        Greeting("Android")

        Background()

        Column {


            Box(modifier = Modifier
                .fillMaxSize()
                .weight(0.2f)
            ) {

                Row() {

                    Box(modifier = Modifier.weight(0.2f)) {
                        CircleLink()
                    }
                    Box(modifier = Modifier.weight(0.2f)) {
                        CircleLink()
                    }
                    Box(modifier = Modifier.weight(0.2f)) {
                        CircleLink()
                    }
                    Box(modifier = Modifier.weight(0.2f)) {
                        CircleLink()
                    }
                }
            }


            Box(modifier = Modifier
                .fillMaxSize()
                .weight(0.8f)
                .padding(25.dp, 25.dp, 25.dp, 0.dp)
                .background(color = Color.Green)
            ) {
                Card(modifier = Modifier
                    .fillMaxSize(),
                    shape = RoundedCornerShape(25.dp,25.dp,0.dp,0.dp)
                ) {

                    Background()

                    Box(modifier = Modifier
                        .fillMaxSize(0.2f)
                        .padding(25.dp)) {

                        DaysLayout()


                    }

                }
            }
            
        }



    }
}