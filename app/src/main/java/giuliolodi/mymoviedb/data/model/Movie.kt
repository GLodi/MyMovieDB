package giuliolodi.mymoviedb.data.model

data class Movie(
        val posterPath: String,
        val id: String,
        val overview: String,
        val backdropPath: String,
        val title: String,
        val voteAverage: Double)