package lavsam.gb.libs.poplibs.retrofit2pagedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import lavsam.gb.libs.poplibs.retrofit2pagedex.databinding.ActivityMainBinding
// работа со страницами. Пока пусто...
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.recyclerMain.layoutManager = LinearLayoutManager(this@MainActivity)

        recycler_main.layoutManager = LinearLayoutManager(this@MainActivity)
        val adapter = UsersAdapter(this)
        recycler_main.adapter = adapter

        val userViewModel = ViewModelProvider(this,UserViewModelFactory(this)).get(UserViewModel::class.java)
        userViewModel.getData().observe(this, object : Observer<PagedList<User>> {
            override fun onChanged(t: PagedList<User>?) {
                adapter.submitList(t)
            }
        })
    }
}
