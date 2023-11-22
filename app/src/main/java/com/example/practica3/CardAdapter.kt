import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practica3.CardItem
import com.example.practica3.R

class CardAdapter(private val cardItems: List<CardItem>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardImage: ImageView = itemView.findViewById(R.id.cardImage)
        val cardSongName: TextView = itemView.findViewById(R.id.cardSongName)
        val cardArtistName: TextView = itemView.findViewById(R.id.cardArtistName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardItem = cardItems[position]

        holder.cardImage.setImageResource(cardItem.imageResId)
        holder.cardSongName.text = cardItem.songName
        holder.cardArtistName.text = cardItem.artistName
    }

    override fun getItemCount(): Int {
        return cardItems.size
    }
}
