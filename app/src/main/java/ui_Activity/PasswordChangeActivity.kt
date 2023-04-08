package ui_Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_servicesmanager.databinding.ActivityPasswordChangeBinding

class PasswordChangeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changePasswordButton.setOnClickListener{
            Toast.makeText(this, "Altera Senha Logica", Toast.LENGTH_LONG).show()
        }
    }
}