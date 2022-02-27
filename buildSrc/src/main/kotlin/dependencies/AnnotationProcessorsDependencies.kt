package dependencies

object AnnotationProcessorsDependencies {
    const val DAGGER = "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.DAGGER}"
    //const val ROOM = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"
    const val MOSHI = "com.squareup.moshi:moshi-kotlin-codegen:${BuildDependenciesVersions.MOSHI}"
    const val DATABINDING = "androidx.databinding:databinding-compiler:${BuildDependenciesVersions.DATABINDING}"
}
