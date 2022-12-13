package com.example.project

import android.os.Parcel
import android.os.Parcelable

data class Zikr(val zikrName:String, val aboutZikr: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(zikrName)
        parcel.writeString(aboutZikr)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Zikr> {
        override fun createFromParcel(parcel: Parcel): Zikr {
            return Zikr(parcel)
        }

        override fun newArray(size: Int): Array<Zikr?> {
            return arrayOfNulls(size)
        }
    }
}
