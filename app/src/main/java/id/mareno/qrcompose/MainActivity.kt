package id.mareno.qrcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import id.mareno.qr_library.rememberQrBitmapPainter
import id.mareno.qrcompose.ui.theme.QRComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QRComposeTheme {
                // A surface container using the 'background' color from the theme
                Image(
                    painter = rememberQrBitmapPainter("00020101021126680016ID.CO.TELKOM.WWW011893600898029183533402150001952918353340303UMI51440014ID.CO.QRIS.WWW0215ID10232753331940303UMI5204549953033605502015802ID5913Samuel Mareno6013KOTA SEMARANG61055026562220511893318458550703A106304A92B"
                    ),
                    contentDescription = null
                )
            }
        }
    }
}