package meehan.matthew.epoxyapp

import com.airbnb.epoxy.EpoxyController

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