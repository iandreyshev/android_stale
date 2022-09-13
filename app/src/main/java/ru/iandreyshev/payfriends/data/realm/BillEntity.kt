package ru.iandreyshev.payfriends.data.realm

import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import java.util.*

open class BillEntity : RealmObject {
    @PrimaryKey
    var id: String = ""
    var title: String = ""
    var backer: MemberEntity? = null
    var creationDate: Date = Date()
    var payments: RealmList<PaymentEntity>? = null
}
