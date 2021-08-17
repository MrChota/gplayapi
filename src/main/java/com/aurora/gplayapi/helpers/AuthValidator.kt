/*
 *     GPlayApi
 *     Copyright (C) 2020  apps OSS
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 */

package com.apps.gplayapi.helpers

import com.apps.gplayapi.GooglePlayApi
import com.apps.gplayapi.data.models.AuthData
import com.apps.gplayapi.data.providers.HeaderProvider
import com.apps.gplayapi.network.IHttpClient

class AuthValidator(authData: AuthData) : BaseHelper(authData) {

    override fun using(httpClient: IHttpClient) = apply {
        this.httpClient = httpClient
    }

    fun isValid(endpoint: String = GooglePlayApi.URL_SYNC, method: METHOD = METHOD.POST): Boolean {
        val headers = HeaderProvider.getDefaultHeaders(authData)
        val playResponse = when (method) {
            METHOD.POST -> httpClient.post(endpoint, headers, hashMapOf())
            METHOD.GET -> httpClient.get(endpoint, headers, hashMapOf())
        }

        return playResponse.isSuccessful
    }

    enum class METHOD {
        GET,
        POST
    }
}