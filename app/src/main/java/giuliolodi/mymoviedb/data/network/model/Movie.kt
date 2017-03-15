package giuliolodi.mymoviedb.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movie(
        @Expose
        @SerializedName ("poster_path")
        val posterPath: String?,

        @Expose
        @SerializedName("id")
        val id: Int,

        @Expose
        @SerializedName("overview")
        val overview: String,

        @Expose
        @SerializedName("backdrop_path")
        val backdropPath: String?,

        @Expose
        @SerializedName("title")
        val title: String,

        @Expose
        @SerializedName("vote_average")
        val voteAverage: Double) {

    fun getPosterUrl(): String {
        return "http://image.tmdb.org/t/p/w300/" + posterPath
    }

}