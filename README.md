# OpenRemote Shared Code

Development
---

* Install JDK 1.7 (DO NOT BUILD THIS PROJECT WITH 1.8! YES, ANDROID STINKS.)

Publishing Artifact
---

Publish local snapshot only:

    ./gradlew clean build publishToMavenLocal

Publish releases to public repository:

    ./gradlew clean build publish -PartifactRepoPassword=<SECRET>
