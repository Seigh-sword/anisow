package com.xo.anilab.ui.categories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.xo.anilab.core.Resource
import com.xo.anilab.data.model.Category
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.common.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CategoriesViewModel(
    private val repository: AniLabRepository,
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories.asStateFlow()

    init {
        load()
    }

    fun load() {
        viewModelScope.launch {
            _categories.value = Resource.Loading(_categories.value.data)
            _categories.value = repository.categories()
        }
    }

    companion object {
        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            CategoriesViewModel(ServiceLocator.repository)
        }
    }
}
