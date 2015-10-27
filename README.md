# OpenRemote Shared Code

Development
---

* Install JDK 1.7 (DO NOT BUILD THIS PROJECT WITH 1.8! YES, ANDROID STINKS.)

* After importing as Gradle project in IntelliJ: *Settings* => *Annotation Processors*, check *Enable annotation processing* and *Obtain processors from project classpath*. Configure the production and test sources directories to `build/generated/source/apt/main` and `build/generated/source/apt/test` respectively and choose to *Store generated sources relative to: Module content root*.

Publishing Artifact
---

Publish local snapshot only:

    ./gradlew clean build publishToMavenLocal

Publish releases to public repository:

    ./gradlew clean build publish -PartifactRepoPassword=<SECRET>
