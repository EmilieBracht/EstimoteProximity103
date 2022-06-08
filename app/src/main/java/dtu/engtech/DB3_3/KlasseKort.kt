package dtu.engtech.DB3_3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Klassekort (
    klassetrin: Klassetrin,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(painter = painterResource((R.drawable.Startside)),
            contentDescription = "Startside",
            modifier = Modifier
                .size(50.dp)
            )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = klassetrin?.Boernehave ?:""
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = klassetrin?.Indskoling ?:"",
                modifier = Modifier.padding(all = 4.dp),
                style = MaterialTheme.typography.body2
            )


        }

    }

}