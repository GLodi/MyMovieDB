package giuliolodi.mymoviedb.data.api

import com.google.gson.annotations.SerializedName
import giuliolodi.mymoviedb.data.model.Movie

class Response {

    @SerializedName("results")
    lateinit var movies: List<Movie>

}