package meehan.matthew.epoxyapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.airbnb.epoxy.EpoxyRecyclerView
import com.squareup.picasso.Picasso

@BindingAdapter("recyclerModels")
fun bindRecyclerModels(epoxyRecyclerView: EpoxyRecyclerView, models: List<ArticleEpoxyModel>) {
    epoxyRecyclerView.withModels {
        models.forEach { model -> model.buildModel(this) }
    }
}

@BindingAdapter("remoteImageUrl")
fun bindRemoteImageUrl(imageView: ImageView, url: String) {
    Picasso
        .get()
        .load(url)
        .into(imageView)
}