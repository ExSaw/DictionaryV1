package com.rickrip.dictionary.feature_dictionary.presentation

import com.rickrip.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
