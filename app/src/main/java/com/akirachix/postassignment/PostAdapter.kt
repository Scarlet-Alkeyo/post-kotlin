package com.akirachix.postassignment



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.sql.Date


//class PostAdapter(private val post:List<Post>) :RecyclerView.Adapter<PostAdapter.Post>{
//}


class PostAdapterAdapter (val infoList:List<Post>):
    RecyclerView.Adapter<infoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): infoViewHolder { var itemView=
        LayoutInflater.from(parent.context)
        .inflate(R.layout.post_item,parent,false)
        return  infoViewHolder((itemView))
    }

    override fun getItemCount(): Int {
        return  infoList .size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val info=infoList[position]
        holder.tvauthor.text =Post.author

        holder.tvtitle.text =Post.title
        holder.tvDate.text= Post.Date
        holder.tvPreview.text=Post.Preview
        holder.link=Post.tvLink
    }


}
class ContactViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvauthor=itemView.findViewById<TextView>(R.id.tvAuthor )
    var tvtitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var  tvDate= itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview =itemView.findViewById<TextView>(R.id.tvPreview)
    var link = itemView.findViewById<TextView>(R.id.tvLInk)
    }
