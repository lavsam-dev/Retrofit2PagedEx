package lavsam.gb.libs.poplibs.retrofit2pagedex

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource

class UserDataSourceFactory(private val context: Context) : DataSource.Factory<Int, User>() {

    val mutableLiveData = MutableLiveData<UserDataSource>()

    override fun create(): DataSource<Int, User> {
        val userDataSource = UserDataSource(context)
        mutableLiveData.postValue(userDataSource)
        return userDataSource
    }

}