package lavsam.gb.libs.poplibs.retrofit2pagedex

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserResponse(

//    @SerializedName("data")
    @SerializedName("results")
    val listUsers : ArrayList<User>

) : Serializable