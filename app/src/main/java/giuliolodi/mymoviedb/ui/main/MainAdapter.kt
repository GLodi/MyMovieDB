package giuliolodi.mymoviedb.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import giuliolodi.mymoviedb.R
import giuliolodi.mymoviedb.data.network.model.Movie
import kotlinx.android.synthetic.main.main_activity_item.view.*

class MainAdapter: RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private var movies: List<Movie> = ArrayList()

    class ViewHolder(root: View): RecyclerView.ViewHolder(root) {
        fun bind (movie: Movie) = with(itemView) {
            title.text = movie.title
            Picasso.with(context).load(movie.getPosterUrl()).into(main_activity_item_poster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent?.context).inflate(R.layout.main_activity_item, parent, false))
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun addMovies(movies: List<Movie>?) {
        if (movies != null) {
            this.movies = movies
            notifyDataSetChanged()
        }
    }

}