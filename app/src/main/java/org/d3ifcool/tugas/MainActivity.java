package org.d3ifcool.tugas;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.d3ifcool.tugas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        count = 0;
        binding.setChoco(false);
        binding.setCream(false);
        binding.setCount(count);
    }

    public void tambah(View view) {
        binding.setCount(++count);
    }

    public void kurang(View view) {
        binding.setCount(--count);
    }
    public void Choco(View view) {
        binding.setChoco(!binding.getChoco());
    }

    public void Cream(View view) {
        binding.setCream(!binding.getCream());
    }

    public void SubmitOrder(View view) {
        int price = 5;
        if (binding.getChoco())price += 2;
        if (binding.getCream())price += 1;
        price = price * count;
        binding.setPrice(price);
        binding.price.setVisibility(View.VISIBLE);
    }


}
