package br.ufpe.cin.android.podcast

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View

class ItemFeedRecyclerView(private val listItemFeed: List<ItemFeed>) : Adapter<ItemFeedRecyclerView.ViewHolder> (){
    // Creating the adapter to RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        // Inflates on the ItemLista layout.
        val view = LayoutInflater.from(context).inflate(R.layout.itemlista, parent, false)
            return view
        }
        // Returns the size of listItemFeed.
        override fun getItemCount(): Int {
            return listItemFeed.size
        }
}
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){}