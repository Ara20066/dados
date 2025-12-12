package com.example.dados

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val api = RetrofitClient.create()
        api.getDados().enqueue(object : Callback<Dados> {
            override fun onResponse(call: Call<Dados>, response: Response<Dados>) {
                val dados = response.body()
                if (dados != null) {
                    Log.i("MainActivity", "Title: ${'$'}{dados.title}")
                    Log.i("MainActivity", "Description: ${'$'}{dados.description}")
                    dados.scoringRules.forEach { rule ->
                        Log.i("MainActivity", "Rule: ${'$'}{rule.combination} -> ${'$'}{rule.points}")
                    }
                } else {
                    Log.w("MainActivity", "Response body empty")
                }
            }

            override fun onFailure(call: Call<Dados>, t: Throwable) {
                Log.e("MainActivity", "API error", t)
            }
        })
    }
}
