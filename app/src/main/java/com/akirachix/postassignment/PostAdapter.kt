package com.akirachix.postassignment



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


//class PostAdapter(private val post:List<Post>) :RecyclerView.Adapter<PostAdapter.Post>{
//}


//class PostAdapter (val infoList:List<Post>):
//    RecyclerView.Adapter<infoViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): infoViewHolder { var itemView=
//        LayoutInflater.from(parent.context)
//        .inflate(R.layout.post_item,parent,false)
//        return  infoViewHolder((itemView))
//    }
//
//    override fun getItemCount(): Int {
//        return  infoList .size
//    }
//
//    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        val info=infoList[position]
//        holder.tvauthor.text =Post.author
//
//        holder.tvtitle.text =Post.title
//        holder.tvDate.text= Post.Date
//        holder.tvPreview.text=Post.Preview
//        holder.link=Post.tvLink
//    }
//
//
//}

class PostAdapter(val articlesList: List<Post>): RecyclerView.Adapter<PostViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return PostViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val article = articlesList[position]
//        holder.tvauthor.text=article.author

//        holder.tvDate.text=article.Date
//        holder.tvPreview.text=article.Preview
//        holder.tvLink.text=article.Link
        holder.tvauthor.text = article.authorName
        holder.tvtitle.text = article.title
        holder.tvDate.text = article.publishDate
        holder.tvPreview.text=article.previewText








    }

    override fun getItemCount(): Int {
        return articlesList.size

    }

}
class PostViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvauthor=itemView.findViewById<TextView>(R.id.tvAuthor )
    var tvtitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var  tvDate= itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview =itemView.findViewById<TextView>(R.id.tvPreview)
    var link = itemView.findViewById<TextView>(R.id.tvLink)
    }
