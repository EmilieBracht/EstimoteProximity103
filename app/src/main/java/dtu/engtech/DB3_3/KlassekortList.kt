package dtu.engtech.DB3_3

import android.provider.SyncStateContract
import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KlassekortList(
    list: List<Klassetrin>,
    modifier: Modifier = Modifier

) {
    Log.d(SyncStateContract.Constants.FIREBASETAG, "KlassekortList size: ${list.size}")
    LazyColumn(modifier = modifier
    ) {
        items(
            items = list
        ) { klassetrin ->
            Klassekort(
                klassetrin = klassetrin
            )

        }
    }
}


