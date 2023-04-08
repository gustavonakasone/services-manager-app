package ui_Activity

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app_servicesmanager.R
import com.example.app_servicesmanager.databinding.ActivityAddOrderBinding
import com.example.app_servicesmanager.databinding.ActivityMenuBinding
import com.example.app_servicesmanager.databinding.ActivityProfileChangeBinding


class AddOrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            // Handle the click event here
            Toast.makeText(this, "cliquei no botao", Toast.LENGTH_LONG).show()
        }

    }


}