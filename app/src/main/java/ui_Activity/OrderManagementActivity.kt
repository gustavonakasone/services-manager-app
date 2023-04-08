package ui_Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_servicesmanager.databinding.ActivityOrderManagementBinding

class OrderManagementActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderManagementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}