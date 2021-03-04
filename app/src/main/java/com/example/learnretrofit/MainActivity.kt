package com.example.learnretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.learnretrofit.data.ResultUsers
import com.example.learnretrofit.data.UserAdapter
import com.example.learnretrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var rvUser: UserAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            NetworkConfig().getService()
                .getUsers()
                .enqueue(object : Callback<List<ResultUsers>> {
                    override fun onFailure(
                            call: Call<List<ResultUsers>>,
                            t: Throwable
                    ) {
                        Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT)
                            .show()
                    }

                    override fun onResponse(
                            call: Call<List<ResultUsers>>,
                            resultUsers: Response<List<ResultUsers>>
                    ) {
                        rvUser.adapter = UserAdapter(resultUsers.body())
                    }
                })
        }

    }
}

