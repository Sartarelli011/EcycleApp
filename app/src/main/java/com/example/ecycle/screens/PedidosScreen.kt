import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.example.ecycle.R

@Composable
fun PedidosScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        contentAlignment = Alignment.Center,

        ) {
        Text(text = "Pedidos")

        Button(onClick = { navController.navigate("login") }) {
            Text(text = "Voltar")
        }
    }
}