package giuliolodi.mymoviedb.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DiscoverMovieResult(
    @Expose
    @SerializedName("page")
    val page: Int,

    @Expose
    @SerializedName("results")
    val results: List<Movie>,

    @Expose
    @SerializedName("total_results")
    val totalResults: Int)