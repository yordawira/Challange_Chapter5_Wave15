package com.catty.challange_chapter5_wave15.model.user

import com.catty.challange_chapter5_wave15.data.HandType
import com.catty.challange_chapter5_wave15.model.engine.PlayerEngine

class Bot : PlayerEngine() {

    override var playerHand : String = ""

    fun getRandomHandBot () : String{
        return arrayOf(
            HandType.ROCK.hand,
            HandType.SCISSOR.hand,
            HandType.PAPER.hand
        ).random()
    }
}