package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.GamesItemBinding

class Adapter(private val gamelist : ArrayList<Game>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(item: View): RecyclerView.ViewHolder(item){
        private val binding = GamesItemBinding.bind(item)
        val gameImage : ImageView = itemView.findViewById(R.id.image)
        val gameName : TextView = itemView.findViewById(R.id.title)
//        fun bind(game: Game) = with(binding){
//            image.setImageResource(game.gameImage)
//            title.text = game.gameName
//        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.games_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = gamelist[position]
        holder.gameImage.setImageResource(game.gameImage)
        holder.gameName.text = game.gameName
        //holder.bind(gamelist[position])
    }
    override fun getItemCount(): Int {
        return gamelist.size
    }
}