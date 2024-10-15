package com.nazwa.cobawen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.cobawen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Inisialisasi binding
    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur teks awal di tvCounter
        binding.tvCounter.text = counter.toString()

        // Tombol untuk menambah angka
        binding.btnAddNumber.setOnClickListener {
            counter++
            binding.tvCounter.text = counter.toString()
        }

        // Tombol untuk mengurangi angka (pastikan ini ada di layout XML)
        binding.btnSubtractNumber.setOnClickListener {
            if (counter > 0) { // Pastikan tidak kurang dari 0
                counter--
                binding.tvCounter.text = counter.toString()
            }
        }

        // Tombol untuk mereset angka
        binding.btnResetNumber.setOnClickListener {
            counter = 0
            binding.tvCounter.text = counter.toString()
        }
    }
}
