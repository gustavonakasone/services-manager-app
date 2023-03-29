package ui_Activity

import adapter.OrderAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.app_servicesmanager.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import model.Order

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val orders = listOf(
            Order(1, "Order 1", "Description", "Accepted"),
            Order(2, "Order 2", "Description","Accepted"),
            Order(3, "Order 3", "Description","Accepted")
        )


        val listView = findViewById<ListView>(R.id.ordemServico)
        val adapter = OrderAdapter(this, orders)
        listView.adapter = adapter


        val addOrder: FloatingActionButton = findViewById(R.id.btn_add_order)
        addOrder.setOnClickListener {
                // Code for handling the click event goes here
            Toast.makeText(this, "cliquei no botao", Toast.LENGTH_LONG).show()
        }
    }
    override fun onResume(){
        super.onResume()

        val addOrder: FloatingActionButton = findViewById(R.id.btn_add_order)
        addOrder.setOnClickListener {
            // Code for handling the click event goes here
            Toast.makeText(this, "cliquei no botao", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AddOrderActivity::class.java)
            startActivity(intent)
        }
    }
}