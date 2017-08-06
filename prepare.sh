#!/bin/sh

echo "rootProject.name='kelibs-result'\ninclude 'jdk', 'js'" > settings.gradle
touch build.gradle
jdk/gradlew wrapper
