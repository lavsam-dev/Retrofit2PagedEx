package lavsam.gb.libs.poplibs.retrofit2pagedex

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import lavsam.gb.libs.poplibs.retrofit2pagedex.databinding.UserRowBinding

class UsersAdapter(private val context: Context) : PagedListAdapter<User, UsersAdapter.MyViewHolder>(USER_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding: UserRowBinding = DataBindingUtil.inflate(inflater, R.layout.user_row,parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = getItem(position)
//        holder.itemBinding.user = getItem(position)
        /*
        android:text="@{user.firstName}"
        android:text="@{user.email}"
         */
        holder.itemBinding.txtUserName.text = user?.firstName
        holder.itemBinding.txtUserEmail.text = user?.email.toString()
    }

    class MyViewHolder(val itemBinding: UserRowBinding) : RecyclerView.ViewHolder(itemBinding.root){

        private var binding : UserRowBinding? = null

        init {
            this.binding = itemBinding
        }

    }
    companion object {
        private val USER_COMPARATOR = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean =
                oldItem.firstName == newItem.firstName
            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean =
                newItem == oldItem
        }
    }

}