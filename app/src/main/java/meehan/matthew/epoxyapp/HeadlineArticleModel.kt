package meehan.matthew.epoxyapp

import com.airbnb.epoxy.EpoxyController

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