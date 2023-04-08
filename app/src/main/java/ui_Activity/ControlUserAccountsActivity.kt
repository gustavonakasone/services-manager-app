package ui_Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_servicesmanager.databinding.ActivityControlUserAccountsBinding
import com.example.app_servicesmanager.databinding.ActivityOrderDetailBinding

class ControlUserAccountsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityControlUserAccountsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityControlUserAccountsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
