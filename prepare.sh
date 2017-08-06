#!/bin/sh

echo "rootProject.name='kelibs-result'\ninclude 'java', 'js'" > settings.gradle
touch build.gradle
java/gradlew wrapper
