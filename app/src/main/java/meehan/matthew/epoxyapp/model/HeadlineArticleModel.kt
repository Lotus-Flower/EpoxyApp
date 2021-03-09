package meehan.matthew.epoxyapp.model

import com.airbnb.epoxy.EpoxyController
import meehan.matthew.epoxyapp.headlineArticle

data class HeadlineArticleModel(
    var title: CharSequence = "",
    var description: CharSequence = ""
) : ArticleEpoxyModel {
    override fun buildModel(epoxyController: EpoxyController) {
        epoxyController.headlineArticle {
            id(title)
            model(this@HeadlineArticleModel)
        }
    }
}