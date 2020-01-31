package network

import com.google.gson.annotations.Expose

data class TestDto(
    @Expose
    val ms1: String?,
    @Expose
    val msg2: String?,
    @Expose
    val msg3: String?
    )
