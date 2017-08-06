#!/bin/sh

echo "rootProject.name='kelibs-result'\ninclude 'kelibs-result-java', 'kelibs-result-js'" > settings.gradle
touch build.gradle
java/gradlew wrapper
