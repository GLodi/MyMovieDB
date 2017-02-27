package giuliolodi.mymoviedb.ui.base

interface BaseContract {

    interface View {

        fun isNetworkAvailable()

    }

    interface Presenter<V: View?> {

        fun onAttach(view: V)

        fun onDetach()

    }

}