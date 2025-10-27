package com.example.lab_4.domain
interface ChiuitRepository {

    fun getAll(): List<Chiuit>

    fun addChiuit(chiuit: Chiuit)

    fun removeChiuit(chiuit: Chiuit)
}