package meehan.matthew.epoxyapp.model

import com.airbnb.epoxy.EpoxyController
import meehan.matthew.epoxyapp.articleHeader

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