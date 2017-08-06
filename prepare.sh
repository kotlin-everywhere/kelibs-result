#!/bin/sh

echo "rootProject.name='kelibs-result'\ninclude 'java', 'js'" > settings.gradle
touch build.gradle
jdk/gradlew wrapper
