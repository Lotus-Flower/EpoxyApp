package meehan.matthew.epoxyapp.model

import com.airbnb.epoxy.EpoxyController
import meehan.matthew.epoxyapp.photoArticle

data class PhotoArticleModel(
    var title: CharSequence = "",
    var description: CharSequence = "",
    var photoUrl: String = ""
) : ArticleEpoxyModel {
    override fun buildModel(epoxyController: EpoxyController) {
        epoxyController.photoArticle {
            id(title)
            model(this@PhotoArticleModel)
        }
    }
}