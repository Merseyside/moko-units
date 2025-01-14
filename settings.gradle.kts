/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        jcenter {
            content {
                includeGroup("org.jetbrains.kotlinx")
            }
        }
    }
}

includeBuild("units-build-logic")
includeBuild("units-generator")

include(":units")
include(":units-basic")
include(":units-test")
include(":units-viewbinding")
include(":units-databinding")
include(":sample:android-databinding")
include(":sample:mpp-library")
include(":sample:android-viewbinding")
