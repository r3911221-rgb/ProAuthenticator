pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ProAuthenticator"

include(":app")
include(":core:model")
include(":core:crypto")
include(":core:database")
include(":core:designsystem")
include(":core:datastore")
include(":core:testing")
include(":feature:vault")
include(":feature:scanner")
include(":feature:manual_entry")
include(":feature:settings")
include(":feature:importers")
include(":feature:categories")
include(":feature:widget")
include(":feature:iconpack")
include(":feature:export")
