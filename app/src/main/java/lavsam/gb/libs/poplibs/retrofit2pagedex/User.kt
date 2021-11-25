package lavsam.gb.libs.poplibs.retrofit2pagedex

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(

    @SerializedName("title")
    val firstName: String,

    @SerializedName("popularity")
    val email: Int

) : Serializable

/*
    @SerializedName("name")
    val firstName: String,

    @SerializedName("url")
    val email: String
 */
/* reqres
    @SerializedName("id")
    val id: Int,

    @SerializedName("email")
    val email: String,

    @SerializedName("first_name")
    val firstName: String,

    @SerializedName("last_name")
    val lastName: String
 */