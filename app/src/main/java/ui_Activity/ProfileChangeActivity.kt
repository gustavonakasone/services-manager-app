package ui_Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_servicesmanager.databinding.ActivityProfileChangeBinding

class ProfileChangeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pagePasswordButton.setOnClickListener{
            val intent = Intent(this, PasswordChangeActivity::class.java)
            startActivity(intent)
        }
        binding.alterUserButton.setOnClickListener{
            Toast.makeText(this, "Altera Usuario Logica", Toast.LENGTH_LONG).show()
        }
    }
}