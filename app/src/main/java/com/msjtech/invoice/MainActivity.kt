package com.msjtech.invoice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.msjtech.invoice.ui.theme.InvoiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InvoiceTheme {
                val invoice = Invoice(
                    id = "Invoice-2025-001",
                    company = "MsjRide",
                    fromPlace = "Place 1",
                    toPlace = "Place 2",
                    date = "14/07/2025",
                    totalHt = 10.0,
                    taxRate = 0.1,
                    customer = "Adem",
                    nbKilometre = 5.3,
                    paymentMethod = "CB"

                )
                InvoiceItem(invoice)
            }
        }
    }
}

@Composable
fun InvoiceItem(invoice: Invoice, modifier: Modifier = Modifier) {
    Text(
        text = "Invoice = ${invoice.id}",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InvoiceTheme {
        val invoice = Invoice(
            id = "Invoice-2025-001",
            company = "MsjRide",
            fromPlace = "Place 1",
            toPlace = "Place 2",
            date = "14/07/2025",
            totalHt = 10.0,
            taxRate = 0.1,
            customer = "Adem",
            nbKilometre = 5.3,
            paymentMethod = "CB"

        )
        InvoiceItem(invoice)
    }
}