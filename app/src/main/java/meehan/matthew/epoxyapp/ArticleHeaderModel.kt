package meehan.matthew.epoxyapp

import com.airbnb.epoxy.EpoxyController

data class ArticleHeaderModel(
    var title: CharSequence = ""
): ArticleEpoxyModel {
    override fun buildModel(epoxyController: EpoxyController) {
        epoxyController.articleHeader {
            id(title)
            model(this@ArticleHeaderModel)
        }
    }
}