package ru.iandreyshev.stale.domain.core

import ru.iandreyshev.stale.domain.paymentEditor.PaymentDraftError

sealed interface Result<out TResult> {
    data class Success<out T>(val data: T) : Result<T>
    data class Error(val error: ErrorType) : Result<Nothing>
}

sealed interface ErrorType {
    // Payment editor
    data class InvalidPaymentDraft(
        val errors: List<PaymentDraftError>
    ) : ErrorType

    // Common
    object Unknown : ErrorType
}
