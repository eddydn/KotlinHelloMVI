package edmt.dev.kotlinhellomvi.Model

import com.hannesdorfmann.mosby3.mvp.MvpView
import edmt.dev.kotlinhellomvi.View.MainViewState
import io.reactivex.Observable

interface MainView : MvpView {
    val imageIntent:Observable<Int> // imageIntent will use Integer index to get image from image list

    fun render(viewState: MainViewState) // Render function will render view base on view state
}