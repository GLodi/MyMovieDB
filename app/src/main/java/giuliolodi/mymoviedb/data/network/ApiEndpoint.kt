package giuliolodi.mymoviedb.data.network

class ApiEndpoint {

    object ApiEndpoint {
        @JvmStatic
        val BASE_URL: String = "https://api.themoviedb.org/3"

        @JvmStatic
        val DISCOVER_MOVIE: String = "/discover/movie"

        @JvmStatic
        val API_KEY: String = "?api_key=341bff7724d6fc5fcf4b704668e0ca8c"
    }

}


