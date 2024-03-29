package com.example.cocktailrecipe.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.cocktailrecipe.R
import com.example.cocktailrecipe.data.vo.CocatailVo
import com.example.cocktailrecipe.data.vo.IngredientVo
import com.example.cocktailrecipe.delegate.CocatailDelegate
import kotlinx.android.synthetic.main.viewholder_cocktail.view.*
import kotlinx.android.synthetic.main.viewholder_ingredient.view.*

class IngredientViewHolder(var itemViews: View) : RecyclerView.ViewHolder(itemViews) {

    private lateinit var ingredient: IngredientVo
    fun setCocktailData(ingredient: IngredientVo) {
        this.ingredient = ingredient

        itemViews.tvIngredient.text = ingredient.ingredient
        itemViews.tvMeasure.text = ingredient.measure
//        itemViews.tv_bottom.text = ingredient.strDrink
//        Glide.with(itemViews.iv_show!!.context)
//            .load(ingredient.strDrinkThumb)
//            .placeholder(R.drawable.placeholder)
//            .error(R.drawable.placeholder)
//            .into(itemViews.iv_show!!)


    }
}