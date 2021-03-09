package meehan.matthew.epoxyapp

import androidx.lifecycle.ViewModel

class ArticleViewModel : ViewModel() {

    val data: MutableList<ArticleEpoxyModel> = mutableListOf()

    fun getArticles() {
        data.clear()
        data.addAll(
            listOf(
                ArticleHeaderModel(
                    title = "Articles"
                ),
                PhotoArticleModel(
                    title = "Headline1",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore.",
                    photoUrl = "https://placekitten.com/120/120"
                ),
                PhotoArticleModel(
                    title = "Headline2",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore.",
                    photoUrl = "https://placekitten.com/120/120"
                ),
                HeadlineArticleModel(
                    title = "Headline3",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore et dolore."
                ),
                HeadlineArticleModel(
                    title = "Headline4",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore et dolore."
                ),
                HeadlineArticleModel(
                    title = "Headline5",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                            "sed do eiusmod tempor incididunt ut labore et dolore."
                )
            )
        )
    }
}