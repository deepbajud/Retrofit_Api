package com.example.retrofitapi.Models

import com.google.gson.annotations.SerializedName

data class CatModel(

	@field:SerializedName("owner")
	val owner: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("file")
	val file: String? = null,

	@field:SerializedName("validated")
	val validated: Boolean? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("mimetype")
	val mimetype: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("tags")
	val tags: List<String?>? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)
