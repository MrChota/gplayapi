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

package com.apps.gplayapi.data.models.details

import com.apps.gplayapi.data.models.StreamBundle

class DevStream {
    var title: String = String()
    var description: String = String()
    var imgUrl: String = String()
    var streamBundle: StreamBundle = StreamBundle()
}