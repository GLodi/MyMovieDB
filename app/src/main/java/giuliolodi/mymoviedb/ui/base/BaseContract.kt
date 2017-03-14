package giuliolodi.mymoviedb.ui.base

interface BaseContract {

    interface View {



    }

    interface Presenter<V: View> {

        fun onAttach(view: V)

        fun onDetach()

    }

}