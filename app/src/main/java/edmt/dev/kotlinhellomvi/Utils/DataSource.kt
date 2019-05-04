package edmt.dev.kotlinhellomvi.Utils

import io.reactivex.Observable

class DataSource(internal var imageList:List<String>)
{
    fun getImageLinkFromList(index:Int):Observable<String>
    {
        return Observable.just(imageList[index])
    }
}