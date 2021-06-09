package com.example.onlineclass

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlineclass.ui.theme.OnlineClassTheme

class MondayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }

                fun blah() {
                    print("blah")
                }

                Row {

                    Column(modifier = Modifier.weight(0.35f)) {

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
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
                                }
                            }
                        }
                    }


                    Column(modifier = Modifier.weight(0.65f)) {

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
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                                shape = RoundedCornerShape(25.dp)) {
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                                    Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                                    Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun MondayPreview() {
    OnlineClassTheme {


        Row {

            Column(modifier = Modifier.weight(0.35f)) {

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
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
                        }
                    }
                }

            }


            Column(modifier = Modifier.weight(0.65f)) {

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
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
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
                        shape = RoundedCornerShape(25.dp)) {
                        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize() ) {
                            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "Sample", contentScale = ContentScale.Crop)
                            Text(text = "Monday", modifier = Modifier, fontSize = 24.sp, color = Color.Black)
                        }
                    }
                }

            }

        }

    }
}