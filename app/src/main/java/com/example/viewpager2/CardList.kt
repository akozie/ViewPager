package com.example.viewpager2

class CardList {

    var initCardList = cardList()
    fun cardList(): ArrayList<CardModel>{
        val cardList = ArrayList<CardModel>()

        cardList.add(CardModel("Emmanuel", "100%", "App"))
        cardList.add(CardModel("May", "100%", "Pharmacy"))
        cardList.add(CardModel("Hannah", "100%", "Business Admin"))
        cardList.add(CardModel("Paul", "100%", "Elect/Elect Engr"))
        return cardList
    }
}