package com.example.onlineclass

import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
                Background()

                Column {

                    Box(modifier = Modifier
                        .weight(0.1f)
                        .fillMaxSize()
                    ) {
                        Text(text = "Hello World")
                    }

                    Box(modifier = Modifier
                        .fillMaxSize()
                        .weight(0.9f)
                        .padding(25.dp, 25.dp, 25.dp, 0.dp)
                        .background(color = Color.Green)
                    ) {

                        Column() {

                            Row {

                                CircleLink()
                                Spacer(modifier = Modifier.padding(8.dp))

                                CircleLink()
                                Spacer(modifier = Modifier.padding(8.dp))

                                CircleLink()
                                Spacer(modifier = Modifier.padding(8.dp))

                                CircleLink()
                                Spacer(modifier = Modifier.padding(8.dp))

                                CircleLink()
                                Spacer(modifier = Modifier.padding(8.dp))

                            }

                            Spacer(modifier = Modifier.padding(12.dp))

                            Card(modifier = Modifier
                                .fillMaxSize(),
                                shape = RoundedCornerShape(25.dp,25.dp,0.dp,0.dp)
                            ) {

                                Background()

                                Box(modifier = Modifier
                                    .fillMaxSize(0.2f)
                                    .padding(25.dp)) {

                                    Column() {

                                        Box(modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.2f)

                                        ) {
                                            Card(modifier = Modifier
                                                .fillMaxSize()
                                                .padding(12.dp),
                                                shape = RoundedCornerShape(25.dp)) {
                                                IconButton(
                                                    onClick = { this@MainActivity.startActivity(
                                                        Intent(this@MainActivity, MondayActivity::class.java)) }, modifier = Modifier.fillMaxSize() ) {
                                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                                    Text(text = "Monday", modifier = Modifier, fontSize = 66.sp, color = Color.Black)
                                                }
                                            }
                                        }

                                        Box(modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.2f)
                                        ) {
                                            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
                                        }

                                        Box(modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.2f)
                                        ) {
                                            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
                                        }

                                        Box(modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.2f)
                                        ) {
                                            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
                                        }

                                        Box(modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.2f)
                                        ) {
                                            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//187 Lines of Code converted to - __________ (using the below composable)

//NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier.fillMaxSize().weight(0.2f) )

//Insert Tag into the parameter of the func to have an id



@Composable
fun NdhoFunc(subject : String, image: Painter, modifier: Modifier) {


    Card (
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        shape = RoundedCornerShape(25.dp)
    ) {
        IconButton (
            onClick = {  },
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(painter = image, contentDescription = "Trial V", contentScale = ContentScale.Crop )
            Text(text = subject, modifier = Modifier, fontSize = 36.sp, color = Color.Black)

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
    Column {

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
        }



        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.2f)
        ) {
            NdhoFunc(subject = "Monday" , image = painterResource(id = R.drawable.sample) , modifier = Modifier)
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
                .weight(0.1f)
                .fillMaxSize()
            ) {
                Text(text = "Hello World")
            }




            Box(modifier = Modifier
                .fillMaxSize()
                .weight(0.9f)
                .padding(25.dp, 25.dp, 25.dp, 0.dp)
                .background(color = Color.Green)
            ) {

                Column() {

                    Row {

                        CircleLink()
                        Spacer(modifier = Modifier.padding(8.dp))

                        CircleLink()
                        Spacer(modifier = Modifier.padding(8.dp))

                        CircleLink()
                        Spacer(modifier = Modifier.padding(8.dp))

                        CircleLink()
                        Spacer(modifier = Modifier.padding(8.dp))

                        CircleLink()
                        Spacer(modifier = Modifier.padding(8.dp))

                    }
                    
                    Spacer(modifier = Modifier.padding(12.dp))


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
}