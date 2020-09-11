package com.machnv.navigation.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Item(
    var id: Int?,
    var name: String?
) : Parcelable {
}