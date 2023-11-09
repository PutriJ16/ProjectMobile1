package com.example.projectmobile1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class BMIFragment : Fragment() {

    private lateinit var weightEdit: EditText
    private lateinit var heightEdit: EditText
    private lateinit var resultText: TextView
    private lateinit var calculateBtn: Button
    private lateinit var spinner: Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bmi, container, false)

        weightEdit = view.findViewById(R.id.weightEdit)
        heightEdit = view.findViewById(R.id.heightEdit)
        resultText = view.findViewById(R.id.resultText)
        calculateBtn = view.findViewById(R.id.calculateBtn)
        spinner = view.findViewById(R.id.spinner)

        val listItems = listOf("Male","Female")

        val arrayAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, listItems)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                calculateBtn.isEnabled = true // Aktifkan tombol perhitungan ketika jenis kelamin dipilih.

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                calculateBtn.isEnabled = false // Nonaktifkan tombol perhitungan jika tidak ada jenis kelamin yang dipilih.

            }
        }
        calculateBtn.setOnClickListener {
            calculateBMI()
        }

        return view
    }

    private fun calculateBMI() {
        val weightStr = weightEdit.text.toString().toFloatOrNull()
        val heightStr = heightEdit.text.toString().toFloatOrNull()

        if (weightStr != null && heightStr != null) {
            val bmi = weightStr / (heightStr / 100).pow(2)

            val selectedItem = spinner.selectedItem.toString()
            val bmiCategory = when (selectedItem) {
                "Male" -> calculateMaleBMI(bmi)
                "Female" -> calculateFemaleBMI(bmi)
                else -> "Invalid Gender"
            }

            resultText.text = bmiCategory
        } else {
            resultText.text = "Invalid Input"
        }
    }

    private fun calculateMaleBMI(bmi: Float): String {
        return when {
            bmi < 20 -> "Underweight (Male)"
            bmi < 25 -> "Normal Weight (Male)"
            bmi < 30 -> "Overweight (Male)"
            else -> "Obese (Male)"
        }
    }

    private fun calculateFemaleBMI(bmi: Float): String {
        return when {
            bmi < 19 -> "Underweight (Female)"
            bmi < 24 -> "Normal Weight (Female)"
            bmi < 29 -> "Overweight (Female)"
            else -> "Obese (Female)"
        }
    }
}